/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung633;

/**
 *
 * @author Mario
 */
public class Kleingeld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Es gibt die folgenden Muenzen:");
        Muenze[] euroMuenzen = Muenze.values();
        for (int i = 0; i < euroMuenzen.length; i++)
        {
            System.out.println(euroMuenzen[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < euroMuenzen.length; i++)
        {
            switch(euroMuenzen[i])
            {
                case EinCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Kupfer + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }
                case ZweiCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Kupfer + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }
                case FuenfCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Kupfer + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }
                case ZehnCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Messing + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }  
                case ZwanzigCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Messing + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }        
                case FuenzigCent:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.Messing + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }          
                case EinEuro:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.MessingUndNickel + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }  
                case ZweiEuro:
                {
                    System.out.println("Die Muenze " + euroMuenzen[i] + " ist aus " +
                            Metall.MessingUndNickel + " und hat den Wert " + euroMuenzen[i].value()
                            + " Cent");
                    break;
                }                     
            }
        }
    }
}
