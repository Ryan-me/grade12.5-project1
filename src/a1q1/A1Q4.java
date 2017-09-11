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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
         System.out.println("input a number between 1 and 10");
         int numb = in.nextInt();
         String one ="*";
         String two ="**";
         String three ="***";
         String four ="****";
         String five ="*****";
         String six ="******";
         String seven ="*******";
         String eight ="********";
         String nine ="*********";
         String ten ="**********";
             if(numb == 1){
                System.out.println(one);
             }
             if(numb == 2){
                System.out.println(two);
             }
             if(numb == 3){
                System.out.println(three);
             }
             if(numb == 4){
                System.out.println(four);
             }
             if(numb == 5){
                System.out.println(five);
             }
             if(numb == 6){
                System.out.println(six);
             }
             if(numb == 7){
                System.out.println(seven);
             }
             if(numb == 8){
                System.out.println(eight);
             }
             if(numb == 9){
                System.out.println(nine);
             }
             if(numb == 10){
                System.out.println(ten);
             }
         
         }
    }

