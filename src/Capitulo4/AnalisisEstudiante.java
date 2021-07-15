
package Capitulo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class AnalisisEstudiante {
    public static void main(String[] args) {
        try {
            
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

            int aprobados = 0;
            int reprobados = 0;
            int contador = 1;

            while (contador <=10) {            
                System.out.println("Escriba el resultado (1 = aprobado, 2 = reprobado)");
                int resultado = Integer.parseInt(leer.readLine());
                
                if (resultado == 1) {
                    aprobados += 1;
                } else {
                    reprobados += 1;
                }
                
                contador += 1;
            }
            
            System.out.printf("Aprobados: %s%nReprobados: %s%n", aprobados, reprobados);
            if (aprobados>8) {
                System.out.println("Bono para el instructor");
            }
        } catch (Exception e) {
        }
    }
}
