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
public class Leaf implements FiniteSet{
    int here;
    FiniteSet left;
    FiniteSet right;
    
    public Leaf() {
        this.left = null;
        this.right = null;
        this.here = 0;
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
    
    public FiniteSet add(int elt) {
        //
        return new Branch(left, elt, right);
    }
    
    public FiniteSet remove (int elt) {
            return new Leaf();
    }
    
    public FiniteSet union(FiniteSet u){
        //union of THIS and u should be u because THIS is empty
        return u;
    }
    
    public FiniteSet inter(FiniteSet u){
        //intersection of THIS and u should be empty set because there is nothing that intersects
        return new Leaf();
    }
    
    public FiniteSet differ(FiniteSet u) {
        return u;
        //difference between THIS and u is u.
    }
    public boolean equal(FiniteSet u){
        return true;
    }
    
    public boolean subset(FiniteSet u){
        return true;
    }
    
}
