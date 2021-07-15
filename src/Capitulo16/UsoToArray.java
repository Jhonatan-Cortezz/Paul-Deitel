
package Capitulo16;

import java.util.Arrays;
import java.util.LinkedList;


public class UsoToArray {
    public static void main(String[] args) {
        String[] colores = {"negro", "azul", "amarillo"};
        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colores));
        
        enlaces.addLast("rojo");//lo agrega como ultimo elemento
        enlaces.add("rosa");//lo agrega al final
        enlaces.add(3, "verde");//lo agrega como tercer elemento
        enlaces.addFirst("cyan");//lo agrega como primer elemento
        
        
        //obtiene los elementos de LinkedList como un arreglo
        colores = enlaces.toArray(new String[enlaces.size()]);
        
        System.out.println("Colores: ");
        for(String color : colores){
            System.out.println(color);
        }
    }
}
