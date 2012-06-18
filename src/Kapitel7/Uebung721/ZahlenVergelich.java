/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel7.Uebung721;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class ZahlenVergelich {
    public int eingabezahl()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gib einen Wert ein: ");
            return scanner.nextInt();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return -1;
    }
    
    public void vergleich(int a, int b)
    {
        if (a == b)
        {
            System.out.println("Die zahlen sind gleich!");
        }else if (a > b)
        {
            System.out.println("Die Zahl " + a + " ist größer als die Zahl " + b );
        }else
        {
            System.out.println("Die Zahl " + b + " ist größer als die Zahl " + a );
        }
    }
            
}
