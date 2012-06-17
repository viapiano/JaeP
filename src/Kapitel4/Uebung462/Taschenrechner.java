/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung462;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class Taschenrechner
{
   public static void main (String[] args) 
   {
      Scanner eingabe = new Scanner(System.in);
      int a, b, auswahl, prgEnde;
      float ergebnis;
      Rechner rechner = new Rechner();
      
      do
      {
         System.out.println ("\n=======================");
         System.out.println ("Einfacher Taschenrechner");
         System.out.println ("=========================\n");
         System.out.println ("\nFolgende Operationen sind "
                             + "verfuegbar:");
         System.out.println ("Addition...............[1]");
         System.out.println ("Subtraktion............[2]");
         System.out.println ("Multiplikation.........[3]");
         System.out.println ("Division...............[4]");
         System.out.println ("Zinseszinsen...........[5]");
         System.out.print ("Treffen Sie Ihre Auswahl: ");
         auswahl = eingabe.nextInt();
         if (auswahl <= 4)
         {
            System.out.print ("Bitte geben Sie die "
                            + "erste Zahl ein: ");
            a = eingabe.nextInt();
            System.out.print ("Bitte geben Sie die "
                            + "zweite Zahl ein: ");
            b = eingabe.nextInt();

            if (auswahl == 1) 
            {
                ergebnis = rechner.addition(a, b);
                System.out.println 
                ( a + " + " + b + " = " + ergebnis);
            }
            else if (auswahl == 2)
            {
                ergebnis =rechner.subtraktion(a, b);
                System.out.println 
                ( a + " - " + b + " = " + ergebnis);
            }
            else if (auswahl == 3)
            {
                ergebnis = rechner.multiplikation(a, b);
                System.out.println 
                ( a + " * " + b + " = " + ergebnis);
            }
            else if (auswahl == 4)
            {
                ergebnis = rechner.division(a, b);
                System.out.println 
                ( a + " / " + b + " = " + ergebnis);
            }
         }
         else
         {
             System.out.println("Anfanskapital: ");
             float ak = eingabe.nextFloat();
             System.out.println("Zusatz: ");
             float z = eingabe.nextFloat();
             System.out.println("Laufzeit der Verzinsung nach N ganzen Jahren: ");
             int lz = eingabe.nextInt();
             ergebnis = rechner.zinseszinsen(ak, z, lz);
             System.out.println("Zinseszinsen: " + ergebnis);
         }
         if (auswahl > 5)
         {
            System.out.println 
               ("\nUnbekannte Auswahl getroffen !");
         }
         System.out.println 
               ("\nWollen Sie den Taschenrechner beenden?");
         System.out.print ("So geben Sie '0' ein: ");
         prgEnde = eingabe.nextInt();
      }while (prgEnde != 0);
   }
}