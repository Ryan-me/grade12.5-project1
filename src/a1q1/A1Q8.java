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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // setiup the vairiables
        double m = 1000000;
        int t = 0;
        int dnr = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("input original ammount");
        double P = in.nextDouble();
        double x = P*2;
        double e = x+(x*.014);
        System.out.println("input interest rate in a %");
        double r = in.nextDouble();
        r = r/100;
        // calculate the ammounts
        while (true){
            P= (1+r)*P;
            
            t = t + 1;
            // display when the number doubles
            if(x <= P && dnr <1){
                System.out.println(P);
                System.out.println("the ammount doubles in  "+ t + " years");
                dnr = 1;
            }
            // display when the number reaches 1 million
            if(P >= m){
                System.out.println(P);
                System.out.println("the ammount will be one million in "+ t+ " years");
                break;
            }
        }
    }
}
