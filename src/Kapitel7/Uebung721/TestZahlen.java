/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel7.Uebung721;

/**
 *
 * @author Mario
 */
public class TestZahlen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ZahlenVergelich zV = new ZahlenVergelich();
        
        int a = zV.eingabezahl();
        int b = zV.eingabezahl();
        
        zV.vergleich(a, b);
    }
}
