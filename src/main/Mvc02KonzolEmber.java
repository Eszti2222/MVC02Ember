
package main;

import modell.EmberModell;
import nezet.CuiNezet;
import vezerlo.CuiVezerlo;

public class Mvc02KonzolEmber {

    
    public static void main(String[] args) {
        /* az a furah úgy kell létehozni a modellt , h nem ismerem a
            a nézetbene megadott 
        */
        
        EmberModell modell = new EmberModell(nezet.getNev(),getKor());
        CuiNezet nezet = new CuiNezet();
        CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
    }
    
}
