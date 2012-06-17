/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung431;

/**
 *
 * @author Mario
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vorname;
        String name;
        Person schoettle;
        
        schoettle = new Person();
        schoettle.setName("Schoettle");
        schoettle.setVorname("Lothar");
        
        name = schoettle.getName();
        vorname = schoettle.getVorname();
        
        System.out.println("Vorname: " + vorname);
        System.out.println("Name: " + name);
    }
}
