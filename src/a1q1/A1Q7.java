/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a1q1;

/**
 *
 * @author messr2578
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = 1999;
        double pop = 60000000;
        while(pop <= 100000000){
        pop = pop*(1+(1.4/100));
        year = year + 1;
        if (pop >=100000000){
            System.out.println("the population will exeed 10 billion in " + year);
        }
       }
    }
}
