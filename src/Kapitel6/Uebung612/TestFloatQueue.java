/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung612;

/**
 *
 * @author Mario
 */
public class TestFloatQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FloatQueue queue = new FloatQueue(5);
        queue.enqueue(2.45f);
        queue.enqueue(1.29f);
        queue.enqueue(4.31f);
        queue.enqueue(7.85f);
        
        queue.queuePrint();
        
        System.out.println("\nAusgabe der Zahlen: ");
        while (queue.isEmpty() == false)
        {
            float rueckgabe;
            rueckgabe = queue.dequeue();
            System.out.println("Die Zahl war: " + rueckgabe);
        }
        
        queue.enqueue(1.11f);
        queue.queuePrint();
        queue.clear();
        queue.queuePrint();
    }
}
