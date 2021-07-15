
package Capitulo16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmos2 {
    public static void main(String[] args) {
        String[] colores = {"rojo", "blanco", "amarillo", "azul"};
        List<String> lista1 = Arrays.asList(colores);
        ArrayList<String> lista2 = new ArrayList<>();
        
        lista2.add("negro");
        lista2.add("rojo");
        lista2.add("verde");
        
        
        System.out.print("Antes de addAll lista2 contiene: ");
        for(String s : lista2){
            System.out.printf("%s ", s);
        }
        
        Collections.addAll(lista2, colores);
        
        System.out.printf("%nDespues de addAll, lista2 contiene: ");
        for(String s : lista2){
            System.out.printf("%s ", s);
        }
        
        //obtiene la frecuencia del rojo
        int frecuencia = Collections.frequency(lista2, "rojo");
        System.out.printf("%nFrecuencia de rojo en lista2: %d%n", frecuencia);
        
        //comprueba si lista1 y lista2 tiene elementos en comun
        boolean desuncion = Collections.disjoint(lista1, lista2);
        System.out.printf("lista1 y lista2 %s elementos en comun%n", (desuncion ? "no tienen" : "tienen"));
    }
}
