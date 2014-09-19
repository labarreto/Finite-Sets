///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
package data1;

//the following is what appears in the console after running

//SIZE OF TREES
//Bst1 Card: 0
//Bst2 Card: 1
//Bst3 Card: 2
//Bst4 Card: 3
//Bst5 Card: 4
//Bst6 Card: 5
//Bst7 Card: 6
//Bst8 Card: 5
//Bst9 Card: 7
//Bst10 Card: 9
//Bst11 Card: 9
//------------------------------------------------------------
//TESTING EMPTY PROPERTIES
//SUCCESS! The intersection between u and the empty set is the empty set!
//SUCCESS! The intersection between u and the empty set is the empty set!
//SUCCESS! The intersection between u and the empty set is the empty set!
//SUCCESS! The intersection between u and the empty set is the empty set!
//SUCCESS! The union between u and the empty set is u! Holds identity property
//SUCCESS! The union between u and the empty set is u! Holds identity property
//SUCCESS! The union between u and the empty set is u! Holds identity property
//SUCCESS! The union between u and the empty set is u! Holds identity property
//SUCCESS! The union between u and the empty set is u! Holds identity property
//SUCCESS! The union between u and the empty set is u! Holds identity property
//------------------------------------------------------------
//TESTING ADD PROPERTIES
//ADD works! ranNum is: (7), u.cardinality is: (0), adding.cardinality() is: (1) and finally, adding.member(ranNum) is (true)
//ADD works! ranNum is: (6), u.cardinality is: (1), adding.cardinality() is: (2) and finally, adding.member(ranNum) is (true)
//ADD works! ranNum is: (7), u.cardinality is: (2), adding.cardinality() is: (3) and finally, adding.member(ranNum) is (true)
//ADD works! ranNum is: (5), u.cardinality is: (3), adding.cardinality() is: (4) and finally, adding.member(ranNum) is (true)
//ADD works! ranNum is: (3), u.cardinality is: (0), adding.cardinality() is: (1) and finally, adding.member(ranNum) is (true)
//------------------------------------------------------------
//TESTING REMOVE PROPERTIES
//REMOVE works! ranNum is: (1), u.cardinality is: (0), adding.cardinality() is: (0) and finally, adding.member(ranNum) is (false)
//REMOVE works! ranNum is: (7), u.cardinality is: (1), adding.cardinality() is: (1) and finally, adding.member(ranNum) is (false)
//REMOVE works! ranNum is: (9), u.cardinality is: (2), adding.cardinality() is: (2) and finally, adding.member(ranNum) is (false)
//REMOVE works! ranNum is: (1), u.cardinality is: (3), adding.cardinality() is: (3) and finally, adding.member(ranNum) is (false)
//REMOVE works! ranNum is: (3), u.cardinality is: (0), adding.cardinality() is: (0) and finally, adding.member(ranNum) is (false)
//------------------------------------------------------------
//TESTING CARDINALITY PROPERTIES
//Success! Cardinality for empty set is: 0, should be: 0
//Success! Initial Cardinality for set is: 1. Final cardinality after adding element is: 2. Final Should be: 2
//Success! Initial Cardinality for set is: 2. Final cardinality after adding element is: 3. Final Should be: 3
//Success! Initial Cardinality for set is: 3. Final cardinality after adding element is: 4. Final Should be: 4
//Success! Initial Cardinality for set is: 4. Final cardinality after adding element is: 5. Final Should be: 5
//Success! Initial Cardinality for set is: 5. Final cardinality after adding element is: 6. Final Should be: 6
//Success! Initial Cardinality for set is: 6. Final cardinality after adding element is: 7. Final Should be: 7
//Success! Initial Cardinality for set is: 5. Final cardinality after adding element is: 6. Final Should be: 6
//Success! Initial Cardinality for set is: 7. Final cardinality after adding element is: 8. Final Should be: 8
//Success! Initial Cardinality for set is: 9. Final cardinality after adding element is: 10. Final Should be: 10
//------------------------------------------------------------
//TESTING SUBSET PROPERTIES
//SUCCESS! (A union B)subset of c? value is: true equals A subset of C? and B subset of C? value is: true
//SUCCESS! (A union B)subset of c? value is: false equals A subset of C? and B subset of C? value is: false
//SUCCESS! (A union B)subset of c? value is: true equals A subset of C? and B subset of C? value is: true
//SUCCESS! (A union B)subset of c? value is: false equals A subset of C? and B subset of C? value is: false
//SUCCESS! Set a and set b are subsets of the union of a and b.
//SUCCESS! Set a and set b are subsets of the union of a and b.
//SUCCESS! Set a and set b are subsets of the union of a and b.
//SUCCESS! Set a and set b are subsets of the union of a and b.
//SUCCESS! The difference set is a subset of y. 
//SUCCESS! The difference set is a subset of y. 
//SUCCESS! The difference set is a subset of y. 
//------------------------------------------------------------
//TESTING EQUAL PROPERTIES
//Should return success. comparing bst3, and bst3: 
//SUCCESS! Sets t and u are equal because they have the same intersection and union
//Should return failure. comparing bst3, and bst4: 
//FAILURE! Sets t and u are not equal because they don't have the same intersection a and union
//------------------------------------------------------------
//TESTING INTERSECTION PROPERTIES
//SUCCESS! u is a subset of the intersection between u and the union of t!
//SUCCESS! u is a subset of the intersection between u and the union of t!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection between t and u after adding a common element is not empty!
//SUCCESS! The intersection of A and B is equal to the intersection of B and A. Proves the commutative property!
//SUCCESS! The intersection of A and B is equal to the intersection of B and A. Proves the commutative property!
//SUCCESS!! The intersection of (A inter B) inter C = A inter (B inter C) upholds the associative property of intersection!!
//SUCCESS!! The intersection of (A inter B) inter C = A inter (B inter C) upholds the associative property of intersection!!
//SUCCESS!! The intersection of (A inter B) inter C = A inter (B inter C) upholds the associative property of intersection!!
//SUCCESS!! Set T inter T is T! Holds true for Idempotent property. Inter can be applied many times without T changing!
//SUCCESS!! Set T inter T is T! Holds true for Idempotent property. Inter can be applied many times without T changing!
//SUCCESS!! Set T inter T is T! Holds true for Idempotent property. Inter can be applied many times without T changing!
//SUCCESS!! Set T inter T is T! Holds true for Idempotent property. Inter can be applied many times without T changing!
//------------------------------------------------------------
//TESTING DIFFERENCE PROPERTIES
//SUCCESS! The difference between set t and set t with added element elt, is the elt.
//SUCCESS! The difference between set t and set t with added element elt, is the elt.
//SUCCESS! The difference between set t and set t with added element elt, is the elt.
//SUCCESS! The difference between set t and set t with added element elt, is the elt.
//SUCCESS! the difference between t and t is the empty set!
//SUCCESS! the difference between t and t is the empty set!
//SUCCESS! the difference between t and t is the empty set!
//SUCCESS! the difference between t and t is the empty set!
//SUCCESS! the difference between t and t is the empty set!
//SUCCESS! the difference between t and t is the empty set!
//------------------------------------------------------------
//TESTING MEMBER PROPERTIES
//SUCCESS!! elt is a member of the difference set!
//SUCCESS!! elt is a member of the difference set!
//SUCCESS!! elt is a member of the difference set!
//SUCCESS!! elt is a member of the difference set!
//SUCCESS!! elt is a member of the union of original set T and set X(which contains elt)
//SUCCESS!! elt is a member of the union of original set T and set X(which contains elt)
//SUCCESS!! elt is a member of the union of original set T and set X(which contains elt)
//SUCCESS!! elt is a member of the union of original set T and set X(which contains elt)
//------------------------------------------------------------
//TESTING UNION PROPERTIES
//SUCCESS! The set A with additional item elt (new set called X), is equal to the union of Difference Set Y  and A!
//SUCCESS! The set A with additional item elt (new set called X), is equal to the union of Difference Set Y  and A!
//SUCCESS! The set A with additional item elt (new set called X), is equal to the union of Difference Set Y  and A!
//SUCCESS! The set A with additional item elt (new set called X), is equal to the union of Difference Set Y  and A!
//SUCCESS! The union of t and u equals the union of u and t! Holds true for commutative property!
//SUCCESS! The union of t and u equals the union of u and t! Holds true for commutative property!
//SUCCESS! The union of t and u equals the union of u and t! Holds true for commutative property!
//SUCCESS! The union of t and u equals the union of u and t! Holds true for commutative property!
//SUCCESS! The union of t and u equals the union of u and t! Holds true for commutative property!
//SUCCESS!! Set T union T is T! Holds true for Idempotent property. Union can be applied many times without T changing!
//SUCCESS!! Set T union T is T! Holds true for Idempotent property. Union can be applied many times without T changing!
//SUCCESS!! Set T union T is T! Holds true for Idempotent property. Union can be applied many times without T changing!
//SUCCESS!! Set T union T is T! Holds true for Idempotent property. Union can be applied many times without T changing!
//BUILD SUCCESSFUL (total time: 3 seconds)