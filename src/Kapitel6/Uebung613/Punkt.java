/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung613;

import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Punkt {
    private int x;
    private int y;

    public Punkt() {
        Scanner eingabe = new Scanner(System.in);
        
        System.out.println("\nGib den x-Wert ein: ");
        x = eingabe.nextInt();
        
        System.out.println("\nGib den y-Wert ein: ");
        y = eingabe.nextInt();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    void print()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
