/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung632;

/**
 *
 * @author Mario
 */
public class Rechenmaschine
{
   private Operation op;
   private double arg1;
   private double arg2;
   
   public void setOp (Operation op)
   {
      this.op = op;
   }
   
   public void setArgs (double arg1, double arg2)
   {
      this.arg1 = arg1;
      this.arg2 = arg2;
   }
   
   public void ausfuehren()
   {
      System.out.println ("Die Operation " + op + " ergibt fuer die Argumente " + arg1 +
                          " und " + arg2 + " das \nErgebnis " + op.eval (arg1,arg2));
   }
   
   public static void main (String[] args)
   {
      // Neues Objekt dieser Klasse anlegen
      Rechenmaschine r = new Rechenmaschine();
      
      // Argumente setzen
      r.setArgs (2.0, 3.0);
      
      // Alle Operationen testen
      Operation[] alleOps = Operation.values();
      for (int i = 0; i < alleOps.length; i++) 
      {
         Operation tmpOp = alleOps [i];
         r.setOp (tmpOp);
         r.ausfuehren();         
      }
   }
}