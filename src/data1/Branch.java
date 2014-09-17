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
public class Branch implements finiteSet{
            //error here that reads "Branch is not abstract..."

    //in class, professor calls it BRANCH. 
        public int here;
        public finiteSet left;
        public finiteSet right;
        
        
        public Branch(finiteSet left, int here, finiteSet right) {
            this.left = left;
            this.here = here;
            this.right = right;
        }
        
        public static finiteSet empty() {
            //empty will return an empty Branch called Leaf(). 
            //return empty();
            return (finiteSet) new Leaf();
            
            //why do i have to put a cast? I thought Leaf() implements the finiteSet????
        }
//        
//        
//        public static finiteSet empty() {
//            return new Leaf();
//        }


        
        public int cardinality(){
            return left.cardinality() + right.cardinality() + 1;
            // returns the size. 
            //left.cardinality() size of left.
            //1 is size of the node you are looking at. 
            //right.cardinality() is the size of the right.
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
            }else {
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
                    return new Branch(this.left.add(elt), this.here, this.right);
                } else {
                    return new Branch(this.left, this.here, this.right.add(elt));
                }
            }

        }
        
        public finiteSet remove(int elt) {
            if (this.here == elt){
                //you're getting rid of the current node
                //you'd want to return a tree that takes the union of the right
                //and the left side. thus return.....
                return right.union(left);
            } else if (this.here > elt) {
                //this will take 
                return new Branch(this.left.remove(elt), this.here, this.right);
            } else {
                return new Branch(this.left, this.here, this.right.remove(elt));
            }
        }
        
        public finiteSet union(finiteSet u) {
            return u.add(here).union(right).union(left);
            //adds u to the appropriate spot in the union of the left and right.
        }
        
        public finiteSet inter(finiteSet u) {
            //member will check if the element in u is in this' HERE. 
            //if it is, then it will be including in the intersection
            if (u.member(here)) {
                return new Branch(this.left.inter(u), this.here, this.right.inter(u));
            }else{
                // if it is not a member, then remove element HERE from the intersection. 
                return this.remove(here).inter(u);
            }

        }
        
        public finiteSet diff(finiteSet u) {
            //figure out
            return this;
            
            // (THIS - u). diff is elements in this that are not in u. 
            // returns everything that is different from BST u and BST t. 
            // BST t happens to be empty, so the difference will be the entire
            // set of u.
        }


    public boolean equal(finiteSet u) {
        //figure out
        
            return true;
        }
        
        public boolean subset(finiteSet u) { //(finiteSet u)
            
            //figure out
            
 
            return true;

        }
        
    }
