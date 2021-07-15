
package Capitulo16;

import Capitulo8.Tiempo2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamineto3 {
    public static void main(String[] args) {
        List<Tiempo2> lista = new ArrayList<>();
        
        lista.add(new Tiempo2(6, 24, 34));
        lista.add(new Tiempo2(18, 14, 58));
        lista.add(new Tiempo2(6, 05, 34));
        lista.add(new Tiempo2(12, 14, 58));
        lista.add(new Tiempo2(6, 24, 22));
        
        System.out.printf("Elementos del arreglo desordenado:%n%s%n", lista);
        
        //ordena usando un comparador
        Collections.sort(lista, new ComparardorTiempo());
        
        System.out.printf("Elementos de la lista ordenados:%n%s%n", lista);
    }
}
