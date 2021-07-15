
package Capitulo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PromedioClase {
    public static void main(String[] args) {
        try {
            
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int total = 0; //inicializala suma de calificaciones

            int contadorCalificaciones = 1;//inicia el contador de las calificaciones

            while (contadorCalificaciones<=10) {            
                System.out.println("Escriba la calificacion " + contadorCalificaciones);
                int calificacion = Integer.parseInt(read.readLine());

                total += calificacion;//suma calificacion al total
                contadorCalificaciones += 1;//incrementa el contador
            }
            
            int promedio = total/10;
            System.out.printf("El total de las 10 calificaciones es: %d%n", total);
            System.out.printf("El promedio de la clase es: %d%n", promedio);
        } catch (Exception e) {
        }
    }
}
