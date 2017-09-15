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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int loop = 0;
        int i= 9999999;
        int[] numb = new int[i];
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("input a word (type exit to stop)");
            String word = in.nextLine();
            if (word.equals("exit")){
                System.out.println("you have entered "+ loop + " words");
                break;
            }
            loop = loop +1;
        }
    }
}
