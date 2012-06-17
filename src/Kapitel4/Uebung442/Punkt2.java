/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung442;

/**
 *
 * @author Mario
 */
public class Punkt2 {
    private int x;
    private int y;
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punkt2(int x, int y) 
    {
        System.out.println("Konstruktor mit zwei Parametern: ");
        System.out.println("x = " + x + ", y = " + y);
        this.x = x;
        this.y = y;
    }

    public Punkt2(int x) 
    {
        System.out.println("Konstruktor mit einem Parameter: x = " + x);
        this.x = x;
        this.y = 0;
    }
    
    public Punkt2() 
    {
        System.out.println("Konstruktor ohne Parameter");
        x = 0;
        y = 0;
    }
    
}
