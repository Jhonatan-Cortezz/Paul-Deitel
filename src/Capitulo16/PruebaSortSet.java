
package Capitulo16;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortSet {
    public static void main(String[] args) {
        String[] colores = {"amarillo", "verde", "negro", "carne", "gris", "blanco", "naranja", "rojo", "verde"};
        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));
        
        System.out.print("conjunto ordenado: ");
        imprimirConjunto(arbol);
        
        //obtiene subconjunto mediante headset con base en naranja
        System.out.print("headSet (\"naranja\"): ");
        imprimirConjunto(arbol.headSet("naranja"));
        
        //tailset
        System.out.print("tailSet (\"naranja\"): ");
        imprimirConjunto(arbol.tailSet("naranja"));
        
        //obtiene los elementos primero y ultimo
        System.out.printf("primero: %s%n", arbol.first());
        System.out.printf("ultimo: %s%n", arbol.last());
    }
    
    private static void imprimirConjunto(SortedSet<String> conjunto){
        for(String s : conjunto){
            System.out.printf("%s ", s);
        }
        System.out.println("");
    }
}
