/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung412;

/**
 *
 * @author Mario
 */
public class Fakultaet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 3;

        System.out.println(fakultaetBerechne(n));
    }

    private static int fakultaetBerechne(int n) 
    {
        if(n <= 1)
        {
            return 1;
        }else
        {
            return n * fakultaetBerechne(n-1);
        }
    }


}
