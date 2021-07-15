
package Capitulo16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebaBusquedaBinaria {
    public static void main(String[] args) {
        String[] colores = {"rojo", "blanco", "azul", "negro", "amarillo", "morado", "rosado"};
        List<String> lista = new ArrayList<>(Arrays.asList(colores));
        
        Collections.sort(lista);
        System.out.printf("ArrayList ordenado: %s%n", lista);
        
        imprimirResultadosDeBusqueda(lista, "negro");
        imprimirResultadosDeBusqueda(lista, "rojo");
        imprimirResultadosDeBusqueda(lista, "rosado");
        imprimirResultadosDeBusqueda(lista, "aqua");
        imprimirResultadosDeBusqueda(lista, "gris");
        imprimirResultadosDeBusqueda(lista, "verdeAzulado");
    }
    
    private static void imprimirResultadosDeBusqueda(List<String> lista, String clave){
        int resultado = 0;
        
        System.out.printf("%nbuscando: %s%n", clave);
        resultado = Collections.binarySearch(lista, clave);
        
        if (resultado >= 0) {
            System.out.printf("Se encontro en el indice %d%n", resultado);
            
        } else {
            System.out.printf("No se encontro (%d)%n", resultado);
        }
    }
}
