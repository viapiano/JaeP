/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung622;

/**
 *
 * @author Mario
 */
public class Parser
{
   private String ganzerPfad;

   private char pathSeparator;

   private Parser(String str, char sep)
   {
      ganzerPfad = str;
      pathSeparator = sep;
   }

   private String extension()
   {
      return ganzerPfad.substring (ganzerPfad.indexOf (".", 0) + 1);
   }

   private String dateiname()
   {
      return ganzerPfad.substring (ganzerPfad.lastIndexOf (pathSeparator) + 1,
            ganzerPfad.indexOf(".", 0));
   }

   private String verzeichnis()
   {
      return ganzerPfad.substring (0, ganzerPfad.lastIndexOf (pathSeparator));
   }

   public static void main (String[] args)
   {
      Parser myHomePage = new Parser (
            "C:\\Eigene Daten\\Javatest\\Beispiel.java", '\\');
      System.out.println ("Extension:   " + myHomePage.extension());
      System.out.println ("\nDateiname:   " + myHomePage.dateiname());
      System.out.println ("\nVerzeichnis: " + myHomePage.verzeichnis());
   }
}
