/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung633;

/**
 *
 * @author Mario
 */
public enum Muenze {
    EinCent(1),
    ZweiCent(2),
    FuenfCent(5),
    ZehnCent (10),
    ZwanzigCent(20),
    FuenzigCent(50),
    EinEuro(100),
    ZweiEuro (200);

    private int wert;
    
    Muenze(int wert) {
        this.wert = wert;
    }
    
    public int value()
    {
        return wert;
    }
}
