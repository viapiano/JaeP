/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung441;

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
        Schuh s1 = new Schuh();
        
        s1.print();
        //--------
        Schuh s2 = new Schuh(44);
        
        s2.print();
        //----
        Schuh s3 = new Schuh(41,"Panther");
        
        s3.print();
    }
}
