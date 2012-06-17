/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung462;

/**
 *
 * @author Mario
 */
public class Rechner
{
   public int addition (int a, int b) 
   {
      return a + b;
   }
   
   public int subtraktion (int a, int b)
   {
      return a - b;
   }
   
   public int multiplikation (int a, int b)
   {
      return a * b;
   }
   
   public float division (int a, int b) 
   {
      return a / b;
   }

   public float zinseszinsen(float ak, float z, int lz) 
   {
       float a = 1 + z/100;
       return ak * this.potenz(a, lz);
   }

   public float potenz(float basis, int potenz)
   {
      float tmp = 1;
      for (int i = 1; i <= potenz; i = i + 1)
      {
         tmp = tmp * basis;
      }
      return tmp;
   }
}
