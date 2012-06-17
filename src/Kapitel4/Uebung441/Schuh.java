/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung441;

/**
 *
 * @author Mario
 */
public class Schuh {

    public Schuh()
    {
        System.out.println("KONSTRUKTOR OHNE PARAMETER WURDE AUFGERUFT");
    }
    
    public Schuh(int groesse, String hersteller) {
        this.groesse = groesse;
        this.hersteller = hersteller;
        System.out.println("KONSTRUKTOR MIT 2 PARAMETERN WURDE AUFGERUFT");
    }
        
    public Schuh(int groesse) {
        this.groesse = groesse;
        System.out.println("KONSTRUKTOR MIT 1 PARAMETERN WURDE AUFGERUFT");
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModellbezeichnung() {
        return modellbezeichnung;
    }

    public void setModellbezeichnung(String modellbezeichnung) {
        this.modellbezeichnung = modellbezeichnung;
    }
    private int groesse;
    private String hersteller, modellbezeichnung;
 
    public void print()
    {
        System.out.println("Grösse: " + getGroesse());
        System.out.println("Hersteller: " + getHersteller());
        System.out.println("Modellbezeichnung: " + getModellbezeichnung());
    }
}