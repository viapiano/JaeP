/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung413;

/**
 *
 * @author Mario
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        int b = 1;
        int c;
        
        for(int i = 0; i < 20; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        
    }
}
