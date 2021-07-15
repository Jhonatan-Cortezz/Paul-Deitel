
package Capitulo16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Carta {
    public static enum Cara {As, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Diez, Joker, Reina, Rey};
    public static enum Palo {Bastos, Diamantes, Corazones, Espadas};
    
    private final Cara cara;
    private final Palo palo;

    public Carta(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }
    
    //devuelve la cara de la carta
    public Cara getCara(){
        return cara;
    }
    
    public Palo getPalo(){
        return palo;
    }
    
    //devuelve la representacion string de la carta
    public String toString(){
        return String.format("%s de %s", cara, palo);
    }
}

public class MazoDeCartas{
    private List<Carta> lista;
    
    public MazoDeCartas(){
        Carta[] mazo = new Carta[52];
        int cuenta = 0;
        
        for(Carta.Palo palo : Carta.Palo.values()){
            for(Carta.Cara cara : Carta.Cara.values()){
                mazo[cuenta] = new Carta(cara, palo);
                cuenta++;
            }
        }
        
        lista = Arrays.asList(mazo);
        Collections.shuffle(lista);//baraja el mazo
    }
    
    public void imprimirCartas(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-19s%n", lista.get(i), ((i + 1) % 4 == 0) ? "%n" : "");
        }
    }
    
    public static void main(String[] args) {
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
    }
}
