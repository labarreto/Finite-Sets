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

    public static int dieRoll() {
        Random randomInts = new Random();
        int side = randomInts.nextInt();
        Math.abs(side);
        int remainder = Math.abs(side % 25);
        return remainder;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //random num testing. 
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());
        System.out.println(dieRoll());

        System.out.println("This should be different");
        System.out.println("HELLO, I'M A FINITE SET.");
    }

}
