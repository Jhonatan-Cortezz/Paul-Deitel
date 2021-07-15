
package Capitulo6;

import java.security.SecureRandom;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new  SecureRandom();
        
        for (int i = 1; i <= 20; i++) {
            int cara = 1 + numerosAleatorios.nextInt(6);
            
            System.out.printf("%d ", cara);
            
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
