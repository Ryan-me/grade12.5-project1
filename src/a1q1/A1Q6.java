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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set vary
        System.out.println("Enter a number between 50 and 100 to stop at");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        int start= 100;
        while (start>= numb){
            start = start - 5;
            if(start-5 <= numb){
                System.out.println(start);
                break;
            }
        }
    
    
    
    
    
    
    }
   
}

