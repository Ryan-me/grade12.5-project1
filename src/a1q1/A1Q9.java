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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int loop = 0;
        int[] numb = new int[11];
        Scanner in = new Scanner(System.in);
        while (loop <= 9){
            System.out.println("input a word");
            String word = in.nextLine();
            numb[loop] = word.length();
            loop = loop + 1;
            
        }
        while (true){
            int tot = numb[0]+numb[1]+numb[2]+numb[3]+numb[4]+numb[5]+numb[6]+numb[7]+numb[8]+numb[9]+numb[10];
            int ave =  tot/10;
            System.out.println("the average word length is "+ ave);
            break;
        }
    }
}
