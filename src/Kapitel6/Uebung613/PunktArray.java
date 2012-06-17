/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung613;

/**
 *
 * @author Mario
 */
public class PunktArray {
    Punkt[] array;

    public PunktArray(int anzahl)
    {
        array = new Punkt[anzahl];
        for (int i = 0; i < anzahl; i++)
        {
            array[i] = new Punkt();
        }
    }
    
    public double entfernung(Punkt q1, Punkt q2)
    {
        return Math.sqrt(   (double)
                            (q1.getX() - q2.getX()) *
                            (q1.getX() - q2.getX()) +
                            (q1.getY() - q2.getY()) *
                            (q1.getY() - q2.getY()));
    }
    
    public double maximum()
    {
        double max = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                double aux = entfernung(array[i], array[j]);
                if (aux > max)
                    max = aux;
            }
        }
        return max;
    }
    
}
