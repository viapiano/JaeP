/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung442;

/**
 *
 * @author Mario
 */
public class TestPunkt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punkt2 p1, p2, p3;
        
        p1 = new Punkt2();
        p2 = new Punkt2(5);
        p3 = new Punkt2(10, 100);
        
        System.out.println("PUNKT 1: " + p1.getX() + ", " + p1.getY() );
        System.out.println("PUNKT 2: " + p2.getX() + ", " + p2.getY() );
        System.out.println("PUNKT 3: " + p3.getX() + ", " + p3.getY() );
    }
}
