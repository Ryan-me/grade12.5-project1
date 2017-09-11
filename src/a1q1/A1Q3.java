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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set vairiables
        int total =0;
        double ticketsNumb=0;
        int ticket = 35;
        int food = 0;
        int dj = 0;
        int rent = 0;
        int deco = 0;
        int staff = 0;
        int misc = 0;
        //scan in the prices
        Scanner in = new Scanner(System.in);
        System.out.println("How much does the food cost");
        food = in.nextInt();
        System.out.println("How much does the dj cost");
        dj = in.nextInt();
        System.out.println("How much does the hall rental cost");
        rent = in.nextInt();
        System.out.println("How much do the hall decorations cost");
        deco = in.nextInt();
        System.out.println("How much does the staff cost");
        staff = in.nextInt();
        System.out.println("How much does the rest of the stuff cost");
        misc = in.nextInt();
        
        total = food + dj + rent + deco + staff + misc;
        ticketsNumb = total / ticket;
        
        System.out.println("the number of tickets it requires to break even "+ ticketsNumb);

    }
}
