/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

import java.util.*;

/**
 *
 * @author ldbruby95
 */
public class Testers {

    public static int ranNum() {
        Random randomInts = new Random();
        int side = randomInts.nextInt();
        Math.abs(side);
        int remainder = Math.abs(side % 10);
        return remainder;
    }
    
    
    //random Int function taken from http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
    public static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}

//    public static finiteSet createBST(int size) {
//        finiteSet randomTree = Branch.empty();
//        for (int i = 0; i < size; i++) {
//            randomTree = randomTree.add(randInt(0,15));
//        }
//        return randomTree;
//    }
    
    public static finiteSet createBST(int size) {
        if (size == 0) {
            return Branch.empty();
        }else {
            return createBST(size-1).add(randInt(0,50));
        }
    }
    

    //making 10 different trees. 
    //empty tree
    static finiteSet bst1 = createBST(0);
    static finiteSet bst2 = createBST(1);
    static finiteSet bst3 = createBST(2);
    static finiteSet bst4 = createBST(3);
    static finiteSet bst5 = createBST(4);
    static finiteSet bst6 = createBST(5);
    static finiteSet bst7 = createBST(6);
    static finiteSet bst8 = createBST(7);
    static finiteSet bst9 = createBST(8);
    static finiteSet bst10 = createBST(9);
    static finiteSet bst11 = createBST(10);

    


    
    // property testing. 
    // cardinality testing
    // two case: empty, non empty (Leaf, Branch)
    public static void testCardinalityMT(finiteSet u) {
        // first check that it's empty. 
        if (u.isEmptyHuh()) {
            if (u.cardinality() == 0) {
                System.out.println("Success! Cardinality for empty set is: " + u.cardinality()
                        + ", should be: 0");
            }
        }
    }
    
    public static void testCardinalityNotMT(finiteSet u, int elt) {
        int initialC = u.cardinality();
        int compareC = initialC +1;
        int finalC = u.add(elt).cardinality();
        // this will add elt to set u, and then find the cardinality, which would be
        // u.cardinality + 1
        // compareC should equal finalC
        
        if (finalC == u.cardinality() + 1 || finalC == u.cardinality()) {
            System.out.println("Success! Initial Cardinality for set is: " + initialC + ". Final cardinality "
                    + "after adding element is: "+ finalC + ". Final Should be: " + u.add(elt).cardinality());
        }else {
            System.out.println("Wrong! Initial Cardinality for set is: " + initialC + ". Final cardinality "
                    + "after adding element is: "+ finalC + ". Final Should be: " + u.add(elt).cardinality());
        }
      
    } 
    

    
    public static void testAdd(finiteSet u) {
        int ranNum = ranNum();
        finiteSet adding = u.add(ranNum);
        //you're testing to see that when you add an element, 
        //the size of the cardinality before should be less than or equal
        //to the size after you add an element
        if ((u.cardinality() <= adding.cardinality()) && adding.member(ranNum)){
            System.out.println("ADD works! ranNum is: (" + ranNum +
                    "), u.cardinality is: (" +
                    u.cardinality() +"), adding.cardinality() is: (" + adding.cardinality() +
                    ") and finally, adding.member(ranNum) is (" + adding.member(ranNum) + ")");
        }else {
            System.out.println("boohoo, check add function...ranNum is: (" + ranNum +
                    "), u.cardinality is: (" +
                    u.cardinality() +"), removing.cardinality() is: (" + adding.cardinality() +
                    ") and finally, removing.member(ranNum) is (" + adding.member(ranNum) + ")");
    } }
    
  public static void testRemove(finiteSet u)  {
      int ranNum = ranNum();
      finiteSet removing = u.remove(ranNum);
      if(removing.cardinality() <= u.cardinality()) {
          System.out.println("REMOVE works! ranNum is: (" + ranNum +
                    "), u.cardinality is: (" +
                    u.cardinality() +"), adding.cardinality() is: (" + removing.cardinality() +
                    ") and finally, adding.member(ranNum) is (" + removing.member(ranNum) + ")");
      } else {
                      System.out.println("boohoo, check remove function...ranNum is: (" + ranNum +
                    "), u.cardinality is: (" +
                    u.cardinality() +"), removing.cardinality() is: (" + removing.cardinality() +
                    ") and finally, removing.member(ranNum) is (" + removing.member(ranNum) + ")");
      }
      
  }
  
  public static void testSubset(finiteSet a, finiteSet b, finiteSet c) {
       if((a.union(b)).subset(c) == (a.subset(c) && b.subset(c)))  {
          //b.subset(a);
          System.out.println("SUCCESS! (A union B)subset of c? value is: " + (a.union(b)).subset(c) +
                  " equals A subset of C? and B subset of C? value is: " + (a.subset(c) && b.subset(c)));
      } else {
           System.out.println("FAILURE! (A union B)subset of c? Should be true, is: " + (a.union(b)).subset(c) +
                  " equals A subset of C? and B subset of C? Should be true, is: " + (a.subset(c) && b.subset(c)));
       }
  }
  
  public static void testEmptyInter(finiteSet u) {
      if (u.inter(Branch.empty()).equal(Branch.empty())) {
          System.out.println("SUCCESS! The intersection between u and the empty set is the empty set!");
      } else {
          System.out.println("FAILURE! The intersection between u and the empty set MUST be the empty set!!!");
      }
  }
  
  //Property of set equality
  public static void testEqual(finiteSet t, finiteSet u) {
      if ((t.union(u)).equal(t.inter(u)) && t.equal(u)) {
          System.out.println("SUCCESS! Sets t and u are equal because they have the same intersection and union");
      }else {
          System.out.println("FAILURE! Sets t and u are not equal because they don't have the same intersection a and union" );
      }
  }
  
  public static void testDiff(finiteSet t, int elt) {
      finiteSet x = t.add(elt);
      finiteSet y = t.diff(x);
      if (t.diff(t.add(elt)).equal(y)) {
          System.out.println("SUCCESS! The difference between set t and set t with added element elt, is the elt.");
      } else {
          System.out.println("FAILURE! No diff between set t and set t with additional element");
      }
  }

  

  public static void testInter(finiteSet t, finiteSet u) {
      finiteSet i = t.union(u);
      // the intersection between u and the union of Set t and u should be u. 
      if(u.inter(i).equal(u)) {
          System.out.println("SUCCESS! The intersection between u and the union of t and u is u!");
      } else {
          System.out.println("Failure! the intersection between u and the union of t and u is not u");
      }
  }
  
    public static void testInter(finiteSet t, finiteSet u, int elt) {
      finiteSet a = t.add(elt);
      finiteSet b = u.add(elt);
      if (!a.inter(b).isEmptyHuh()) {
          System.out.println("SUCCESS! The intersection between t and u after adding a common element is not empty!");
      } else {
          System.out.println("FAILURE: The intersection between t and u after adding a common element is empty even though it shouldn't be");
      }
      
  }
    
    
  

    public static void main(String[] args) {
        // TODO code application logic here
        //random num testing. 
        
        System.out.println("SIZE OF TREES");
        System.out.println("Bst1 Card: " + bst1.cardinality());
        System.out.println("Bst2 Card: " + bst2.cardinality());
        System.out.println("Bst3 Card: " + bst3.cardinality());
        System.out.println("Bst4 Card: " + bst4.cardinality());
        System.out.println("Bst5 Card: " + bst5.cardinality());
        System.out.println("Bst6 Card: " + bst6.cardinality());
        System.out.println("Bst7 Card: " + bst7.cardinality());
        System.out.println("Bst8 Card: " + bst8.cardinality());
        System.out.println("Bst9 Card: " + bst9.cardinality());
        System.out.println("Bst10 Card: " + bst10.cardinality());
        System.out.println("Bst11 Card: " + bst11.cardinality());
        System.out.println("------------------------------------------------------------");



        System.out.println("TESTING ADD PROPERTIES");
        testAdd(bst1);
        testAdd(bst2);
        testAdd(bst3);
        testAdd(bst4);
        testAdd(bst1);
        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING REMOVE PROPERTIES");
        testRemove(bst1);
        testRemove(bst2);
        testRemove(bst3);
        testRemove(bst4);
        testRemove(bst1);
        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING CARDINALITY PROPERTIES");
        testCardinalityMT(bst1);
        testCardinalityNotMT(bst2,5);
        testCardinalityNotMT(bst3,0);
        testCardinalityNotMT(bst4,40);
        testCardinalityNotMT(bst5,5);
        testCardinalityNotMT(bst6,6);
        testCardinalityNotMT(bst7,70);
        testCardinalityNotMT(bst8, 14);
        testCardinalityNotMT(bst9, 23);
        testCardinalityNotMT(bst10, 100);
        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING SUBSET PROPERTIES");
        testSubset(bst1, bst1, bst2); 
        testSubset(bst2, bst5, bst10); // low chances of it being true for a subset since 7 out of 10 elements would have to be in bst10. 
        testSubset(bst1, bst1, bst1);
        
        testSubset(bst3,bst2,bst1); //this should return a success since it's able to detect it's NOT a subset. 
        
        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING EQUAL PROPERTIES");
        System.out.println("Should return success. comparing bst3, and bst3: ");
        testEqual(bst3,bst3); // should return success
        System.out.println("Should return failure. comparing bst3, and bst4: ");
        testEqual(bst3,bst4); // should return failure
        
        testInter(bst3, bst1);
        testInter(bst2, bst2);
        testInter(bst5,bst7,155);
        
        testDiff(bst1, 5);
        testDiff(bst2, 20);
        testDiff(bst5, 100);
        testDiff(bst5, 2);

    }

}
