/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a1q1;

import java.util.Scanner;

/**
 *
 * @author messr2578
 */
public class A1Q2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set variables
        int uno =0;
        int dos =0;
        int tres =0;
        //scan in the three numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        uno = in.nextInt();
        System.out.println("enter seccond number");
        dos = in.nextInt();
        System.out.println("enter third number");
        tres = in.nextInt();
        //do the math
        int product =uno*dos*tres; 
        double square = Math.pow(product,2);
        double sqRoot = Math.sqrt(product);
        // output the numbers
        System.out.println("product = " + product);
        System.out.println("product squared = " + square);
        System.out.println("product square rooted = " + sqRoot);
    }
}
