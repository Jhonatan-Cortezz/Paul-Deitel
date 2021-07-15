
package Capitulo8;

import java.util.EnumSet;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaEnum {
    public static void main(String[] args) {
        System.out.println("Todos los libros");
        
        //imprime todos los libros en enum Libro
        for(Libro libro : Libro.values()){
            System.out.printf("%-10s%-45s%s%n", libro, libro.getTitulo(), libro.getAnioCopyright());
        }
        
        System.out.printf("%nMostrar un rango de constantes enum:%n");
        
        //imprime los primeros cuatro libros en rango del 1 al 4
        for(Libro libro : EnumSet.range(Libro.JHTP, Libro.CPPHTP)){
            System.out.printf("%.10s%-45s%s%n", libro, libro.getTitulo(), libro.getAnioCopyright());
        }
    }
}
