
package Capitulo16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConteoTipoPalabras {
    
    public static void main(String[] args) {
        Map<String, Integer> miMap = new HashMap<>();
        crearMap(miMap);
        mostrarMapa(miMap);
    }
    
    private static void crearMap(Map<String, Integer> mapa){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String entrada = scanner.nextLine();
        
        //divide la entrada en tokens
        String[] tokens = entrada.split(" ");
        
        for(String token : tokens){
            String palabra = token.toLowerCase();//obtiene una palabra en minuscula
            
            //si el mapa contiene la palabra
            if (mapa.containsKey(palabra)) {
                int cuenta = mapa.get(palabra);
                mapa.put(palabra, cuenta + 1);
            } else {
                mapa.put(palabra, 1);
            }
        }
    }
    
    private static void mostrarMapa(Map<String, Integer> mapa){
        Set<String> claves = mapa.keySet();
        
        //ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        System.out.printf("%nEl mapa contiene:%nClave/t/tValor%n");
        
        for(String clave : clavesOrdenadas){
            System.out.printf("%-10s%10s%n", clave, mapa.get(clave));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", mapa.size(), mapa.isEmpty());
    }
}
