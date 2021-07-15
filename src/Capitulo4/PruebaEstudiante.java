
package Capitulo4;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Jane Green", 93.5);
        Estudiante est2 = new Estudiante("John Blue", 72.75);
        
        System.out.printf("La calificación en letra de %s es: %s%n", est1.getNombre(), est1.obtenerCalificacion());
        System.out.printf("La calificacion en letra de %s es: %s%n", est2.getNombre(), est2.obtenerCalificacion());
    }
}
