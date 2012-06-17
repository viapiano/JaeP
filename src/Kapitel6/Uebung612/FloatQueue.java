/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung612;

/**
 *
 * @author Mario
 */
public class FloatQueue {
    private int lange;
    private int letzte;
    private float[] queue;
    
    public FloatQueue(int lange) {
        queue = new float[lange];
        this.lange = lange;
        letzte = 0;
    }
    
    public void enqueue(float wert)
    {
        if (lange > letzte)
        {
            queue[letzte] = wert;
            letzte += 1;
        }
    }
    
    public float dequeue()
    {
        letzte -= 1;
        return queue[0];
    }
    
    public void queuePrint()
    {
        System.out.println("Alle Elemente von der Liste: ");
        for (int i = 0; i <= letzte; i++)
        {
            System.out.println(queue[i]);
        }
    }
    
    public boolean isEmpty()
    {
        if (letzte == 0)
            return true;
        else
            return false;
    }
    
    public void clear()
    {
        letzte = 0;
    }
    
}
