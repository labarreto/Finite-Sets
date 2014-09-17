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

//creating an interface
    //renaming bstInterface to BST for simplicity
   interface finiteSet{
        // (empty) --> finite-set
        public int cardinality();
        // (isEmptyHuh t) --> boolean where t is a finite set
        public boolean isEmptyHuh();
        // (member t elt) --> boolean where t is a finite-set and elt is an int
        public boolean member(int elt);
        // (remove t elt) --> finite-set where t is a finite-set and elt is an int
        public finiteSet add(int elt);
        // (add t elt) --> finite-set where t is a finite-set and elt is an ent
        public finiteSet remove(int elt);
        // (union t u) --> finite-set where t and u are finite-sets
        public finiteSet union(finiteSet u);
        // (inter t u) --> finite-set where t and u are finite-sets
        public finiteSet inter(finiteSet u);
        // (diff t u) --> finite-set where t and u are finite-sets
        public finiteSet diff(finiteSet u);
        // (equal t u) --> boolean where t and u are finite-sets
        public boolean equal(finiteSet u);
        // (subset t u) --> boolean where t and u are finite-sets
        public boolean subset(finiteSet u);
        
    }