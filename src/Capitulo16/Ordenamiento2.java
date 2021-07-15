
package Capitulo16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento2 {
    public static void main(String[] args) {
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};
        List<String> lista = Arrays.asList(palos);
        
        System.out.printf("Elementos del arreglo desordenado: %s%n", lista);
        
        //ordena de forma descendente
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos de la lista ordenados: %s%n", lista);
    }
}
