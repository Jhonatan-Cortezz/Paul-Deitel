
package Capitulo7;

import java.security.SecureRandom;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class TirarDados {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();
        int[] frecuencia = new int[7];
        
        for (int tiro = 1; tiro <= 6000000; tiro++) {
            ++frecuencia[1 + numerosAleatorios.nextInt(6)];
        }
        
        System.out.printf("%s%10s%n", "Cara ", "Frecuencia");
        
        for (int cara = 1; cara < frecuencia.length; cara++) {
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]);
        }
    }
}
