
package Capitulo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EstudianteCentinela {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

            //inicializamos el total y ek conotador
            int total = 0;
            int contadorCalificaciones = 0;
            System.out.println("Escriba la calificación o -1 para terminar");
            int calificacion = Integer.parseInt(leer.readLine());
            
            //iniciamos el bucle hasta recibir el -1
            while (calificacion != -1) {                
                total += calificacion;
                contadorCalificaciones += 1;
                
                System.out.println("Escriba la calificacion o -1 para terminar");
                calificacion = Integer.parseInt(leer.readLine());
            }
            
            if (contadorCalificaciones != 0) {
                double promedio = (double) total / contadorCalificaciones;
                
                System.out.printf("%nEl total de las %s calificaiones introducidas es de: %s%n", 
                        contadorCalificaciones, total);
                System.out.printf("El promedion de la clase es: %.2f%n", promedio);
            } else {
                System.out.println("No se introdujeron calificaciones");
            }
            
        } catch (Exception e) {
        }
    }
}
