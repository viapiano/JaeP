/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung451;

import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Durchschnitt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
        float a = scaner.nextFloat();
        float b = scaner.nextFloat();
        float c = scaner.nextFloat();
        System.out.println("Durchschnitt: " + (a + b + c)/3 );
    }
}
