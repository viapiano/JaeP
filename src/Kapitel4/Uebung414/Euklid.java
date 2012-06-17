/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung414;

/**
 *
 * @author Mario
 */
public class Euklid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 24;
        int b = 9;
        
        System.out.println(ggT(a,b));
        
    }
    
    public static int ggT(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }else
        {
            return ggT(b, a % b);
        }
    }
}
