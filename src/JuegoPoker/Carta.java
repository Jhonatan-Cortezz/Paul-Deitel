/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoPoker;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Carta {
    private final String cara;
    private final String palo;

    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }
    
    public String toString(){
        return cara + " de " + palo;
    }
}
