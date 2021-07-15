
package Capitulo16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmos1 {
    public static void main(String[] args) {
        Character[] letras = {'P', 'C', 'M'};
        List<Character> lista = Arrays.asList(letras);
        System.out.println("Lista contiene");
        imprimir(lista);
        Collections.reverse(lista);
        System.out.printf("%nDespues de llamar a reverse, lista contiene:%n");
        imprimir(lista);
        
        Character[] letrasCopia = new Character[3];
        List<Character> copiaLista = Arrays.asList(letrasCopia);
        
        //copia el contenido de lista a copiaLista
        Collections.copy(copiaLista, lista);
        System.out.printf("%nDespues de copiar, copiaLista contiene:%n");
        imprimir(copiaLista);
        
        //llena la lista con letras R
        Collections.fill(lista, 'R');
        System.out.printf("%nDespues de llamar a fill, lista contiene");
        imprimir(lista);
    }
    
    private static void imprimir(List<Character> refList){
        System.out.print("La lista es: ");
        for(Character elemento : refList){
            System.out.printf("%s ", elemento);
        }
        
        System.out.printf("%nMax: %s", Collections.max(refList));
        System.out.printf("   Min: %s%n", Collections.min(refList));
        
    }
}
