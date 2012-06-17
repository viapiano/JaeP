/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung452;

import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Flaecheberechnung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===Flaechenprogramm===\n");
        System.out.println("Wert für das Quadrat: ");
        Quadrat q = new Quadrat(scanner.nextFloat());
        System.out.println("Flaeche: " + q.getFlaeche());
        
        System.out.println("Wert für das Rechteck: ");
        Rechteck r = new Rechteck(scanner.nextFloat(), scanner.nextFloat());
        System.out.println("Flaeche: " + r.getFlaeche());
    }
}
