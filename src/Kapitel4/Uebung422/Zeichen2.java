/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung422;

/**
 *
 * @author Mario
 */
import java.io.IOException;

/**
 *
 * @author Mario
 */
public class Zeichen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int c = 0;
        int anzahlProZeile = 0;
        int anzahlLeerzeichen = 0;
        
        System.out.println("Bitte eine Folge von Zeichen eingeben ");
        System.out.println("und mit <RETURN> abschliessen");
        
        do
        {
            c = System.in.read();
            
            System.out.println(
                    "ASCII-Code: " + c + " Zeichen: " + (char) c );
            anzahlProZeile += 1;
            if(c == 32) anzahlLeerzeichen += 1;
        }while (c != 10);
        
        System.out.println("Anzahl: " + anzahlProZeile);
        System.out.println("Anzahl der Leerzeichen: " + anzahlLeerzeichen);
    }
}