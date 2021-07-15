package Capitulo16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaList {
    public static void main(String[] args) {
        String[] colores = {"negro", "amarillo", "verde", "azul", "violeta", "plateado"};
        List<String> lista1 = new LinkedList<>();
        
        for(String color : colores){
            lista1.add(color);
        }
        
        String[] colores2 = {"dorado", "blanco", "cafe", "azul", "gris", "plateado"};
        List<String> lista2 = new LinkedList<>();
        
        for(String color : colores2){
            lista2.add(color);
        }
        
        lista1.addAll(lista2);//concatena las listas
        lista2 = null;//libera los recursos
        imprimirLista(lista1);
        
        convertirCadenaAMayuscula(lista1);
        imprimirLista(lista1);
        
        System.out.printf("%nEliminando elementos 4a 6..");
        eliminarLista(lista1, 4, 7);
        imprimirLista(lista1);
        imprimirListaInversa(lista1);
    }
    
    private static void imprimirLista(List<String> lista){
        System.out.printf("%nLista:%n");
        
        for(String color : lista){
            System.out.printf("%s ", color);
        }
        System.out.println("");
    }
    
    private static void convertirCadenaAMayuscula(List<String> lista){
        ListIterator<String> iterador = lista.listIterator();
        while (iterador.hasNext()) {
            String color = iterador.next();//obtiene el elemento
            iterador.set(color.toUpperCase());//convierte a mayusculas
        }
    }
    
    //obtiene sublista y utiliza el metodo clear para eliminar los elementos de la misma
    private static void eliminarLista(List<String> lista, int inicion, int fin){
        lista.subList(inicion, fin).clear();
    }
    
    //imprime la lista inversa
    private static void imprimirListaInversa(List<String> lista){
        ListIterator<String> iterator = lista.listIterator(lista.size());
        
        System.out.printf("%nLista inversa:%n");
        
        while (iterator.hasPrevious()) {            
            System.out.printf("%s ", iterator.previous());
        }
    }
}
