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

    public static finiteSet createBST(int size) {
        if (size == 0) {
            return Branch.empty();
        } else {
            return createBST(size - 1).add(randInt(0, 50));
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
    static finiteSet bst12 = bst3.union(bst5);
    static finiteSet bst13 = bst5.union(bst6);
    static finiteSet bst14 = bst3.union(bst6);

        public static void testEmptyInter(finiteSet u) {
        if (u.inter(Branch.empty()).equal(Branch.empty())) {
            System.out.println("SUCCESS! The intersection between u and the empty set is the empty set!");
        } else {
            System.out.println("FAILURE! The intersection between u and the empty set MUST be the empty set!!!");
        }
    }

    public static void testEmptyUnion(finiteSet u) {
        if (u.union(Branch.empty()).equal(u)) {
            System.out.println("SUCCESS! The union between u and the empty set is u! Holds identity property");
        } else {
            System.out.println("FAILURE! The union between u and the empty set MUST be u!!!");
        }
    }
    
    
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
        //int compareC = initialC + 1;
        int finalC = u.add(elt).cardinality();
        // this will add elt to set u, and then find the cardinality, which would be
        // u.cardinality + 1
        // compareC should equal finalC
        //the reason it's u.card +1 OR u.cardinality is because if you add an element that's already
        // in the set, the length will be the same as before since the element will not be added since
        // there is no need for repeated elements
        if (finalC == u.cardinality() + 1 || finalC == u.cardinality()) {
            System.out.println("Success! Initial Cardinality for set is: " + initialC + ". Final cardinality "
                    + "after adding element is: " + finalC + ". Final Should be: " + u.add(elt).cardinality());
        } else {
            System.out.println("Wrong! Initial Cardinality for set is: " + initialC + ". Final cardinality "
                    + "after adding element is: " + finalC + ". Final Should be: " + u.add(elt).cardinality());
        }

    }

    
    
        public static void testMember(finiteSet a, int elt) {
        finiteSet x = a.add(elt);
        finiteSet y = a.diff(x);
        if (y.cardinality() >= 1) {
            if (y.member(elt) && x.member(elt)) {
                System.out.println("SUCCESS!! elt is a member of the difference set!");
            } else {
                System.out.println("FAILURE! elt is not a member of the difference set!");
            }
        }

    }

    public static void testMember2(finiteSet t, int elt) {
        finiteSet x = t.add(elt);
        finiteSet y = x.union(t);
        if (x.cardinality() >= t.cardinality()) {
            if (y.member(elt)) {
                System.out.println("SUCCESS!! elt is a member of the union of original set T and set X(which contains elt)");
            } else {
                System.out.println("FAILURE!! elt is not a member tho it should be");
            }
        }
    }
    
    public static void testAdd(finiteSet u) {
        int ranNum = ranNum();
        finiteSet adding = u.add(ranNum);
        //you're testing to see that when you add an element, 
        //the size of the cardinality before should be less than or equal
        //to the size after you add an element
        if ((u.cardinality() <= adding.cardinality()) && adding.member(ranNum)) {
            System.out.println("ADD works! ranNum is: (" + ranNum
                    + "), u.cardinality is: ("
                    + u.cardinality() + "), adding.cardinality() is: (" + adding.cardinality()
                    + ") and finally, adding.member(ranNum) is (" + adding.member(ranNum) + ")");
        } else {
            System.out.println("boohoo, check add function...ranNum is: (" + ranNum
                    + "), u.cardinality is: ("
                    + u.cardinality() + "), removing.cardinality() is: (" + adding.cardinality()
                    + ") and finally, removing.member(ranNum) is (" + adding.member(ranNum) + ")");
        }
    }

    public static void testRemove(finiteSet u) {
        int ranNum = ranNum();
        finiteSet removing = u.remove(ranNum);
        if (removing.cardinality() <= u.cardinality()) {
            System.out.println("REMOVE works! ranNum is: (" + ranNum
                    + "), u.cardinality is: ("
                    + u.cardinality() + "), adding.cardinality() is: (" + removing.cardinality()
                    + ") and finally, adding.member(ranNum) is (" + removing.member(ranNum) + ")");
        } else {
            System.out.println("boohoo, check remove function...ranNum is: (" + ranNum
                    + "), u.cardinality is: ("
                    + u.cardinality() + "), removing.cardinality() is: (" + removing.cardinality()
                    + ") and finally, removing.member(ranNum) is (" + removing.member(ranNum) + ")");
        }
    }

        public static void testUnion(finiteSet a, int elt) {
        finiteSet x = a.add(elt);
        finiteSet y = a.diff(x); //set containing elt. 

        if (x.equal(a.union(y))) {
            System.out.println("SUCCESS! The set A with additional item elt (new set called X), is equal to the union of Difference Set Y "
                    + " and A!");
        } else {
            System.out.println("FAILURE! no union.");
        }

    }

    public static void testUnion(finiteSet t) {
        if (t.union(t).equal(t)) {
            System.out.println("SUCCESS!! Set T union T is T! Holds true for Idempotent property. Union"
                    + " can be applied many times without T changing!");
        } else {
            System.out.println("FAILURE!! Set t union t is not T even though it should be. Does not hold true");
        }
    }

    public static void testUnion(finiteSet t, finiteSet u) {
        finiteSet a = t.union(u);
        finiteSet b = u.union(t);
        if (a.equal(b)) {
            System.out.println("SUCCESS! The union of t and u equals the union of u and t! Holds true for"
                    + " commutative property!");
        } else {
            System.out.println("FAILURE! Union does not hold true for commutative property!");
        }
    }
    
        public static void testInter(finiteSet t, finiteSet u) {

        finiteSet i = t.union(u);
        // the intersection between u and the union of Set t and u should be u. 
        if (u.subset(u.inter(i))) {
            // u.subset(u.inter(i))
            System.out.println("SUCCESS! u is a subset of the intersection between u and the union of t!");
        } else {
            System.out.println("Failure! the intersection between u and the union of t and u is not u");
        }
    }

    public static void testInter(finiteSet t, finiteSet u, int elt) {
        finiteSet a = t.add(elt);
        finiteSet b = u.add(elt);
        if (!a.inter(b).isEmptyHuh() && (a.inter(b).cardinality() >= 1)) {
            System.out.println("SUCCESS! The intersection between t and u after adding a common element is not empty!");
        } else {
            System.out.println("FAILURE: The intersection between t and u after adding a common element is empty even though it shouldn't be");
        }

    }

    public static void testInter(finiteSet t, finiteSet u, finiteSet v) {
        finiteSet a = t.inter(u);
        finiteSet b = u.inter(v);
        //associative law
        if ((a.inter(v)).equal(t.inter(b))) {
            System.out.println("SUCCESS!! The intersection of (A inter B) inter C = A inter (B inter C) upholds"
                    + " the associative property of intersection!!");
        } else {
            System.out.println("FAILURE!! Intersection does not hold true for associative property.");
        }

    }

    public static void testInter2(finiteSet t, finiteSet u) {
        finiteSet a = t.inter(u);
        finiteSet b = u.inter(t);
        if (a.equal(b)) {
            System.out.println("SUCCESS! The intersection of A and B is equal to the intersection of B and A. Proves"
                    + " the commutative property!");
        } else {
            System.out.println("FAILURE! inter of A and B does not equal inter of B and A. Commutative property"
                    + "does not hold. ");
        }
        //commutative property
    }

    public static void testInter(finiteSet t) {
        if (t.inter(t).equal(t)) {
            System.out.println("SUCCESS!! Set T inter T is T! Holds true for Idempotent property. Inter"
                    + " can be applied many times without T changing!");
        } else {
            System.out.println("FAILURE!! Set t inter t is not T even though it should be. Does not hold true");
        }
    }
    
        public static void testDiff(finiteSet t, int elt) {
        //elt should be a member of the diff. 
        //when you add int elt to t, the difference between t and x 
        finiteSet x = t.add(elt);
        //y is the difference between t and x. In this case, the difference should be elt.
        //that means elt should be a member of y. 
        finiteSet y = t.diff(x);
        if (y.member(elt)) {
            System.out.println("SUCCESS! The difference between set t and set t with added element elt, is the elt.");
        } else {
            System.out.println("FAILURE! No diff between set t and set t with additional element");
        }
    }

    public static void testDiff(finiteSet t) {
        if (t.diff(t).isEmptyHuh()) {
            System.out.println("SUCCESS! the difference between t and t is the empty set!");
        } else {
            System.out.println("FAILURE! the difference between t and t is not the empty set"
                    + " even though it should be. ");
        }
    }
    
        //Property of set equality
    public static void testEqual(finiteSet t, finiteSet u) {
        if ((t.union(u)).subset(t.inter(u)) && (u.union(t)).subset(u.inter(t))) {
            System.out.println("SUCCESS! Sets t and u are equal because they have the same intersection and union");
        } else {
            System.out.println("FAILURE! Sets t and u are not equal because they don't have the same intersection a and union");
        }
    }
    // Testing subset properties 
    public static void testSubset(finiteSet a, finiteSet b, finiteSet c) {
        if ((a.union(b)).subset(c) == (a.subset(c) && b.subset(c))) {
            //b.subset(a);
            System.out.println("SUCCESS! (A union B)subset of c? value is: " + (a.union(b)).subset(c)
                    + " equals A subset of C? and B subset of C? value is: " + (a.subset(c) && b.subset(c)));
        } else {
            System.out.println("FAILURE! (A union B)subset of c? Should be true, is: " + (a.union(b)).subset(c)
                    + " equals A subset of C? and B subset of C? Should be true, is: " + (a.subset(c) && b.subset(c)));
        }
    }

    public static void testSubset(finiteSet a, finiteSet b) {
        finiteSet x = a.union(b);
        if (a.subset(x) && b.subset(x)) {
            System.out.println("SUCCESS! Set a and set b are subsets of the union of a and b.");
        } else {
            System.out.println("FAILURE! Set a and set b are not subsets of the union of a and b");
        }
    }

    public static void testSubset(finiteSet a, int elt) {
        finiteSet x = a.add(elt);
        finiteSet y = a.diff(x); //set containing elt. 
        if (y.subset(x)) {
            System.out.println("SUCCESS! The difference set is a subset of y. ");
        } else {
            System.out.println("FAILURE! The difference set is not a subset of y. ");
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
        System.out.println("TESTING EMPTY PROPERTIES");
        testEmptyInter(bst1);
        testEmptyInter(bst2);
        testEmptyInter(bst3);
        testEmptyInter(bst4);
        testEmptyUnion(bst1);
        testEmptyUnion(bst2);
        testEmptyUnion(bst3);
        testEmptyUnion(bst4);
        testEmptyUnion(bst5);
        testEmptyUnion(bst6);

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
        testCardinalityNotMT(bst2, 5);
        testCardinalityNotMT(bst3, 0);
        testCardinalityNotMT(bst4, 40);
        testCardinalityNotMT(bst5, 5);
        testCardinalityNotMT(bst6, 6);
        testCardinalityNotMT(bst7, 70);
        testCardinalityNotMT(bst8, 14);
        testCardinalityNotMT(bst9, 23);
        testCardinalityNotMT(bst10, 100);

        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING SUBSET PROPERTIES");
        testSubset(bst1, bst1, bst2);
        testSubset(bst2, bst5, bst10); // low chances of it being true for a subset since 7 out of 10 elements would have to be in bst10. 
        testSubset(bst1, bst1, bst1);
        testSubset(bst3, bst2, bst1); //this should return a success since it's able to detect it's NOT a subset. 
        testSubset(bst1, bst2);
        testSubset(bst2, bst3);
        testSubset(bst3, bst4);
        testSubset(bst4, bst5);
        testSubset(bst1, 2);
        testSubset(bst2, 10);
        testSubset(bst3, 15);

        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING EQUAL PROPERTIES");
        System.out.println("Should return success. comparing bst3, and bst3: ");
        testEqual(bst3, bst3); // should return success
        System.out.println("Should return failure. comparing bst3, and bst4: ");
        testEqual(bst3, bst4); // should return failure

        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING INTERSECTION PROPERTIES");
        testInter(bst3, bst1);
        testInter(bst2, bst2);
        testInter(bst5, bst7, 155);
        testInter(bst3, bst8, 15);
        testInter(bst13, bst10, 85);
        testInter(bst2, bst7, 48);
        testInter(bst1, bst5, 29);
        testInter(bst1, bst1, 10);
        testInter(bst9, bst11, 67);
        testInter(bst2, bst4, 2);
        testInter2(bst3, bst1);
        testInter2(bst2, bst2);
        testInter(bst12, bst13, bst14);
        testInter(bst1, bst5, bst5);
        testInter(bst6, bst3, bst5);
        testInter(bst1);
        testInter(bst3);
        testInter(bst5);
        testInter(bst10);
        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING DIFFERENCE PROPERTIES");
        testDiff(bst1, 5);
        testDiff(bst2, 20);
        testDiff(bst5, 100);
        testDiff(bst5, 2);
        testDiff(bst1);
        testDiff(bst2);
        testDiff(bst3);
        testDiff(bst4);
        testDiff(bst5);
        testDiff(bst6);

        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING MEMBER PROPERTIES");
        testMember(bst1, 5);
        testMember(bst2, 20);
        testMember(bst5, 100);
        testMember(bst5, 2);
        testMember2(bst1, 5);
        testMember2(bst2, 20);
        testMember2(bst5, 100);
        testMember2(bst5, 2);

        System.out.println("------------------------------------------------------------");
        System.out.println("TESTING UNION PROPERTIES");
        testUnion(bst1, 5);
        testUnion(bst2, 20);
        testUnion(bst5, 100);
        testUnion(bst5, 2);
        testUnion(bst1, bst1);
        testUnion(bst2, bst3);

        testUnion(bst3, bst2);
        testUnion(bst3, bst4);
        testUnion(bst10, bst5);
        testUnion(bst1);
        testUnion(bst3);
        testUnion(bst5);
        testUnion(bst10);

    }

}
