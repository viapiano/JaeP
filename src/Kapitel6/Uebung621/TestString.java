/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung621;

import java.lang.StringBuffer;
/**
 *
 * @author Mario
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Hello";
        System.out.println("Starte Schleife, Bitte warten");
        long startTime = System.currentTimeMillis();
        
        for(int n = 0; n < 10000; n++)
        {
            s += "World";
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Mit dem + Operator braucht man " + (endTime - startTime) + " Millisekunden");
        
        System.out.println("Der zusammengesetzte String hat " + " eine Länge von " + s.length() + " Zeichen\n");
        
        StringBuffer sB = new StringBuffer("Hello");
        System.out.println("Starte Schleife, Bitte warten");
        startTime = System.currentTimeMillis();
        
        for(int n = 0; n < 10000; n++)
        {
            sB.append("World");
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("Mit dem StringBuffer braucht man " + (endTime - startTime) + " Millisekunden");
        
        System.out.println("Der zusammengesetzte String hat " + " eine Länge von " + s.length() + " Zeichen\n");

    }
}
