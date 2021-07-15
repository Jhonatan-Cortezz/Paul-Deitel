
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        LibroCalificaciones miLibroCalificacinoes = new LibroCalificaciones("SIS21 Introduccion a la programacion en Java", 
                arregloCalif);
        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n",
                miLibroCalificacinoes.getNombreDelCurso());
        miLibroCalificacinoes.procesarCalificaciones();
    }
}
