
package Capitulo16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PruebaSet {
    public static void main(String[] args) {
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne", "blanco", "cyan", "durazno", "gris", "naranja"};
        List<String> lista = Arrays.asList(colores);
        System.out.printf("List: %s%n", lista);
        
        imprimirSinDuplicados(lista);
    }
    
    private static void imprimirSinDuplicados(Collection<String> valores){
        Set<String> conjunto = new HashSet<>(valores);
        
        System.out.printf("%nLos valores sin duplicar son: ");
        for(String valor : conjunto){
            System.out.printf("%s ", valor);
        }
        System.out.println("");
    }
}
