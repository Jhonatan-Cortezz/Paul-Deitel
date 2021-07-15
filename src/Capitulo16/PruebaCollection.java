
package Capitulo16;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PruebaCollection {
    public static void main(String[] args) {
        //agrega los elementos en el arreglo colores  a la lista
        String[] colores = {"Magenta", "Rojo", "Blanco", "Azul", "Cyan"};
        List<String> lista = new ArrayList<String>();
        
        //agrega el color al final de la lista
        for(String color : colores){
            lista.add(color);
        }
        
        //agrega elementos en el arreglo eliminaColores a eliminarLista
        String[] eliminaColores = {"Rojo", "Blanco", "Azul"};
        List<String> eliminarLista = new ArrayList<String>();
        for(String color : eliminaColores){
            eliminarLista.add(color);
        }
        
        //imprime en pantalla el contenido de la lista
        System.out.println("ArrayList");
        for (int cuenta = 0; cuenta < lista.size(); cuenta++) {
            System.out.printf("%s ", lista.get(cuenta));
        }
        
        //elimina de la lista los colores contenidos en eliminarLista
        eliminarColores(lista, eliminarLista);
        
        //imprime en pantalla el nuevo contenido de la lista
        System.out.printf("%n%nArrayList despues de llamar a eliminarColores:%n");
        for(String color : lista){
            System.out.printf("%s ", color);
        }
        System.out.println("\n");
    }
    
    //metodo que elimina de coleccion1 los colores especificados en colesccion2
    private static void eliminarColores(Collection<String> coleccin1, Collection<String> coleccion2){
        //obtiene el iterador
        Iterator<String> iterator = coleccin1.iterator();
        
        //itera miestra la coleccin tenga elementos
        while (iterator.hasNext()) {            
            if (coleccion2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
