/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung611;

/**
 *
 * @author Mario
 */
public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stackRef = new Stack(5);
        stackRef.push(7);
        stackRef.push(3);
        stackRef.push(4);
        stackRef.push(9);
        stackRef.push(1);
        
        stackRef.stackPrint();
        
        System.out.println("\nAusgabe der Zahlen: ");
        while(stackRef.isEmpty() == false)
        {
            int rueckgabe;
            rueckgabe = stackRef.pop();
            System.out.println("Die Zahl war " + rueckgabe);
        }
    }
}
