/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung631;

/**
 *
 * @author Mario
 */
public class WochentagAusgabe {

    public enum WochenTag {MONTAG, DIENSTAG, MITTWOCH,
                           DONNERSTAG, FREITAG, SAMSTAG, SONNTAG }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for ( WochenTag wt : WochenTag.values())
        {
            System.out.println(wt + " ist der " + (wt.ordinal() + 1) + ". Tag der Woche");
        }
    }
} 
