/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung452;

/**
 *
 * @author Mario
 */
public class Rechteck {
    private float a, b;

    public Rechteck(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public float getFlaeche()
    {
        return a * b;
    }
}
