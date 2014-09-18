/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

/**
 *
 * @author ldbruby95
 */
public class Branch implements finiteSet {
            //error here that reads "Branch is not abstract..."

    //in class, professor calls it BRANCH. 
    public int here;
    public finiteSet left;
    public finiteSet right;

    Branch() {
    }

    public Branch(finiteSet left, int here, finiteSet right) {
        this.left = left;
        this.here = here;
        this.right = right;
    }

    public static finiteSet empty() {
            //empty will return an empty set called Leaf(). 
        //return empty();
        return new Leaf();

        //why do i have to put a cast? I thought Leaf() implements the finiteSet????
    }
//        
//        
//        public static finiteSet empty() {
//            return new Leaf();
//        }

    public int cardinality() {

        // returns the size. 
        //left.cardinality() size of left.
        //1 is size of the node you are looking at. 
        //right.cardinality() is the size of the right.

            return 1+this.left.cardinality()+this.right.cardinality();
      

    }

    public boolean isEmptyHuh() {
        // this is not the empty tree we called Leaf(), so it will not be empty!
        return false;

    }

    public boolean member(int elt) {
        if (this.here == elt) {
            //if here == element, return true.
            return true;
        } else if (this.here > elt) {
                //if here > elt that means look at the left side of the tree
            // since here would be to the right of the current item
            return left.member(elt);
        } else {
                //in other case here < elt, then elt would be to the right
            // of here, so check the right. 
            return right.member(elt);
        }

    }

    public finiteSet add(int elt) {
        if (here == elt) {
            return this;
        } else {
            if (here > elt) {
                return new Branch(left.add(elt), here, right);
            } else {
                return new Branch(left, here, right.add(elt));
            }
        }


    }

    public finiteSet remove(int elt) {
        if (here == elt) {
                //you're getting rid of the current node
            //you'd want to return a tree that takes the union of the right
            //and the left side. thus return.....
            return right.union(left);
        } else if (here > elt) {
            //this will take 
            return new Branch(left.remove(elt), here, right);
        } else {
            return new Branch(left, here, right.remove(elt));
        }
    }

    public finiteSet union(finiteSet u) {
        return this.left.union(u.union(right).add(this.here));
        //adds u to the appropriate spot in the union of the left and right.
    }

    public finiteSet inter(finiteSet u) {
            //member will check if the element in u is in this' HERE. 
        //if it is, then it will be including in the intersection
        if (u.member(here)) {
            return new Branch(this.left.inter(u), this.here, this.right.inter(u));
        } else {
            // if it is not a member, then remove element HERE from the intersection. 
            return this.remove(here).inter(u);
        }

    }

    public finiteSet diff(finiteSet u) {
            //figure out

            // (THIS - u). diff is elements in this that are not in u. 
        // returns everything that is different from BST u and BST t. 
        // BST t happens to be empty, so the difference will be the entire
        // set of u.
            //so basically
        if (u.member(this.here)) { //indicating that member and here are the same and not different
            //which means you do not include this.
            //you want to return the diff of the union of left and right while also
            //calling diff(...) to remove the equal "here" from the finiteSet.
            return this.left.union(this.right).diff(u.remove(this.here));

        } else {
            return this.left.union(this.right).diff(u);
                //if they're not members of each other, then return
            // the union of the left and righ while
        }
    }

    public boolean equal(finiteSet u) {
        //figure out
        // equality is when Set A is a subset of B implies B is a subset of A. 
        // if/then conditional statement.
        
        // if this is a subset of u and u is a subset of this, return true
        if (this.subset(u) && u.subset(this)) {
            return true;
        } else {
            // if not, then they are false. 
            return false;
        }
    }

    public boolean subset(finiteSet u) { //(finiteSet u)
        //subset means that for sets A and B. A is a subset of B if
        //all x in A are also in B. 
        //figure out
        
        //if this.here is a member of u, return a recursive call to check the
        //left of the node, and the right of the node and see if the rest
        //are in u. 
        if (u.member(this.here)) {
            return (this.left.subset(u) && this.right.subset(u));
        } else {
            //if not, return false. 
            return false;
        }

    }

}
