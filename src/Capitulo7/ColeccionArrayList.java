
package Capitulo7;

import java.util.ArrayList;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class ColeccionArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("rojo");//adunta un elemento a la lista
        elementos.add(0, "amarillo");//inserta amarillo en el indice 0
        
        System.out.print("Mostrar contenido de lista con cilco controlado por contador");
        
        for (int i = 0; i < elementos.size(); i++) {
            System.out.printf(" %s", elementos.get(i));//mostamos el contenido del arrayList
        }
        
        mostrar(elementos, "%nMostra contenido de la lista con for mejorado");
        elementos.add("verde");
        elementos.add("amarillo");
        mostrar(elementos, "Lista con dos nuevos elementos");
        
        elementos.remove("amarillo"); //elimina el primer amarillo
        mostrar(elementos, "eliminar primera instancia de amarillo");
        
        elementos.remove(1);
        mostrar(elementos, "Eliminar segundo elemento de la lista(verde)");
        
        System.out.printf("'rojo'%s esta en la lista%n", elementos.contains("rojo") ?"": "no ");
        System.out.printf("Tamaño: %s%n", elementos.size());
        
    }
    
    public static void mostrar(ArrayList<String> elementos, String encabezado){
        System.out.println(encabezado);
        for(String elemento : elementos){
            System.out.printf(" %s", elemento);
        }
        System.out.println();
    }
}
