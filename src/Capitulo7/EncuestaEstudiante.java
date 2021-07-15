
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EncuestaEstudiante {
    public static void main(String[] args) {
        int[] respuestas  = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frecuencia = new int[6];
        
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            try {
                ++frecuencia[respuestas[respuesta]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("    respuestas[%d] = %d%n%n", respuesta, respuestas[respuesta]);
            }
        }
        
        System.out.printf("%s%20s%n", "Calificacion", "Frecuencia");
        
        for (int i = 1; i < frecuencia.length; i++) {
            System.out.printf("%6d%20s%n", i, frecuencia[i]);
        }
    }
}
