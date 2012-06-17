/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung432;

/**
 *
 * @author Mario
 */
public class TestSchuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Schuh s = new Schuh();
        
        s.setGroesse(42);
        s.setHersteller("Mike");
        s.setModellbezeichnung("Air Ultramatic");
        
        s.print();
    }
}
