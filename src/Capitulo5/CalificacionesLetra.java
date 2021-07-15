
package Capitulo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class CalificacionesLetra {
    public static void main(String[] args) {
        try {
            int total = 0;
            int contadorCalif = 0;
            int aCuenta = 0;
            int bCuenta = 0;
            int cCuenta = 0;
            int dCuenta = 0;
            int fCuenta = 0;
            Scanner entrada = new Scanner(System.in);

            System.out.printf("%s%n%s%n   %s%n    %s%n",
                                "Introduzca las calificaciones en un rango de 0-100.",
                                "Escriba el indicador de fin de archivo para terminar la entrada:",
                                "En Unix/Linux/Mac OS X escriba <Ctrl> d y oprima intro",
                                "En Windows escriba <Ctrl> z y oprima intro");

            while (entrada.hasNext()) {            
                int calificacion = entrada.nextInt();
                total += calificacion;
                ++contadorCalif;
                
                switch(calificacion / 10){
                    case 9:
                    case 10:
                        ++aCuenta;
                        break;
                    
                    case 8:
                        ++bCuenta;
                        break;
                        
                    case 7:
                        ++cCuenta;
                        break;
                        
                    case 6:
                        ++dCuenta;
                        break;
                        
                    default:
                        ++fCuenta;
                        break;
                }
            }
            
            System.out.printf("%nReporte de calificaciones:%n");
            
            if (contadorCalif != 0) {
                double promedio = (double) total / contadorCalif;
                
                System.out.printf("El total de %s calificaciones introducidas es %s%n",
                            contadorCalif, total);
                System.out.printf("El promedio de la clase es %.2f%n", promedio);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "Numero de estudiantes que recibieron cada calificacion:",
                        "A: ", aCuenta,
                        "B: ", bCuenta,
                        "C: ", cCuenta,
                        "D: ", dCuenta,
                        "F: ", fCuenta);
            } else {
                System.out.println("No se introdujeron calificaciones");
            }
        } catch (Exception e) {
        }
    }
    
    
}
