/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel4.Uebung463;

/**
 *
 * @author Mario
 */
public class Konverter
{
   public float CelsiusToFahrenheit (float celsius) 
   {
      float fahrenheit = (celsius * 1.8f) + 32;	  
      return fahrenheit;
   }
   
   public float FahrenheitToCelsius (float fahrenheit)
   {
      float celsius = (fahrenheit - 32) * 5/9;
      return celsius;
   }
}