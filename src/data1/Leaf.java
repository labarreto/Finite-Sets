/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data1;



//empty tree
public class Leaf implements finiteSet{
    
    Leaf(){}
    
    
    public static FiniteSet empty(){
        return new Leaf();
    }


    
    public int cardinality() {
        return 0;
    }
    
    public boolean isEmptyHuh() {
        return true;
    }
    
    public boolean member(int elt) {
        return false;
        //the empty tree doesn't have any members
    }
    
    public finiteSet add(int elt) {
        // add int elt to a the empty tree.
        // thus left and right would be null. 
        // only element would be at HERE, which is what elt represents. 
        return new Branch(null, elt, null);
  
    }
    
    public finiteSet remove (int elt) {
        return this;
    }
    
    public finiteSet union(finiteSet u){
        //union of THIS and u should be u because THIS is empty
        return u;
    }
    
    public finiteSet inter(finiteSet u){
        //intersection of THIS and u should be empty set because there is nothing that intersects
        return this;
    }
    
    public finiteSet diff(finiteSet u) {
        return u;
        //difference between THIS and u is u. (This - u) = all elements in this that are not in u,
        //which in the case of the empty set, is all of u. 
    }
    public boolean equal(finiteSet u){
        //checks that the set u is empty just like this set. 
        return u.isEmptyHuh();
    }
    
    public boolean subset(finiteSet u){
        //empty set is the subset of all sets. 
        return true;
    }
    
}
