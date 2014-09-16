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
        int here;
        finiteSet left;
        finiteSet right;
        
        Branch(finiteSet left, int here, finiteSet right) {
            this.left = left;
            this.here = here;
            this.right = right;
        }
        
        
        public int cardinality(){
            return left.cardinality() + right.cardinality();
            // returns the size. 
            //left.cardinality() size of left.
            //1 is size of the node you are looking at. 
            //right.cardinality() is the size of the right.
        }
        public boolean isEmptyHuh() {
            //checks THIS finiteSet. 
            if (cardinality() == 0) {
                //if the size is 1 (one node which could be empty)
                return true;
            }else {
                return false;
            }
            // returns whether or not the BST is empty. (AND IT IS!)
        }
        public boolean member(int elt) {
            return false;
            // returns whether int elt is part of the BST, which it's not
            // since there are no elements in the BST_MT
        }
        
        public finiteSet add(int elt) {
            return this;
            //return BST_MT();
            // !!!!!!!!!!!!!!!COME BACK TO THIS LATER!!!!!!!!!!!!!!!!!
        }
        
        public finiteSet remove(int elt) {
            // when you remove an int from BSt (there are no ints to remove)
            // just return a new empty BST. 
            return this;
            //return BST_MT();
        }
        
        public finiteSet union(finiteSet u) {
            return this;
            //the union of an empty set and u should be u
        }
        
        public finiteSet inter(finiteSet u) {
            return this;
            // the intersection of an empty set and u should be the empty set
            // since there is no intersection
        }
        
        public finiteSet diff(finiteSet u) {
            return this;
            // returns everything that is different from BST u and BST t. 
            // BST t happens to be empty, so the difference will be the entire
            // set of u.
        }
        

        public boolean equal(finiteSet u) { //(finiteSet u)
            //error here that reads "return type boolean is not compatible with finiteSet"
            // if u is not equal to the empty list, return false
            // used this negation operator due to the fact that there is only
            // one empty list yet there could be numerous 
            return true;
//            if ( u != this){
//                return false;
//            }
//            return true;
        }
        
        public boolean subset(finiteSet u) { //(finiteSet u)
            //error here that reads "return type boolean is not compatible with finiteSet"
            return true;
            // the empty set will always be the subset of another set u.
        }
        

        
    }
    
    

    
    
    
    /**
     * @param args the command line arguments
     */
