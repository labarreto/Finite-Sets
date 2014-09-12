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


// creating the BST. has to implement a tree interface. 
public class Data1{

    //before I had bstInterface in a different file, but realized I should have
    //everything in same file. 
    
    //renaming bstInterface to BST for simplicity
    public interface BST{
        
        // (empty) --> finite-set
//        public BST empty();
        // (cardinality t) --> integer where t is a finite set (BST).
        public int cardinality(int t);
        // (isEmptyHuh t) --> boolean where t is a finite set
        public boolean isEmptyHuh(BST t);
        // (member t elt) --> boolean where t is a finite-set and elt is an int
        public boolean member(BST t, int elt);
        // (remove t elt) --> finite-set where t is a finite-set and elt is an int
        public BST add(BST t, int elt);
        // (add t elt) --> finite-set where t is a finite-set and elt is an ent
        public BST remove(BST t, int elt);
        // (union t u) --> finite-set where t and u are finite-sets
        public BST union(BST t, BST u);
        // (inter t u) --> finite-set where t and u are finite-sets
        public BST inter(BST t, BST u);
        // (diff t u) --> finite-set where t and u are finite-sets
        public BST diff(BST t, BST u);
        // (equal t u) --> boolean where t and u are finite-sets
        public BST equal(BST t, BST u);
        // (subset t u) --> boolean where t and u are finite-sets
        public BST subset(BST t, BST u);
        
    }
    
    public static class BST_MT implements BST {
        public BST_MT() {
        }
        
        public int cardinality(){
            return 0;
            // returns size of BST which in the case of the empty BST, is 0
        }
        public boolean isEmptyHuh() {
            return true;
            // returns whether or not the BST is empty. (AND IT IS!)
        }
        public boolean member(int elt) {
            return false;
            // returns whether int elt is part of the BST, which it's not
            // since there are no elements in the BST_MT
        }
        
        public BST add(int elt) {
            return new BST_MT();
            // !!!!!!!!!!!!!!!COME BACK TO THIS LATER!!!!!!!!!!!!!!!!!
        }
        
        public BST remove(int elt) {
            // when you remove an int from BSt (there are no ints to remove)
            // just return a new empty BST. 
            return new BST_MT();
        }
        
        public BST union(BST u) {
            return u;
            //the union of an empty set and u should be u
        }
        
        public BST inter(BST u) {
            return new BST_MT();
            // the intersection of an empty set and u should be the empty set
            // since there is no intersection
        }
        
        public BST diff(BST u) {
            return u;
            // returns everything that is different from BST u and BST t. 
            // BST t happens to be empty, so the difference will be the entire
            // set of u.
        }
        

        public boolean equal(BST u) {
            // if u is not equal to the empty list, return false
            // used this negation operator due to the fact that there is only
            // one empty list yet there could be numerous 
            if ( u != new BST_MT()){
                return false;
            }
            return true;
        }
        
    }
    
    

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("hello World");
        System.out.println("This should be different");
        System.out.println("HELLO, I'M A FINITE SET.");
    }
    
}
