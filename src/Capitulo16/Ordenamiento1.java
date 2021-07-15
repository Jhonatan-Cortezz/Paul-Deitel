
package Capitulo16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Ordenamiento1 {
    public static void main(String[] args) {
        String[] palos = {"Corazones", "Bastos", "Diamantes", "Espadas"};
        
        //crea y muestra un list que contiene los elementos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desordenado: %s%n", lista);
        
        Collections.sort(lista);//ordena arrayList
        System.out.printf("Elementos del arreglo ordenado %s%n", lista);
    }
}
