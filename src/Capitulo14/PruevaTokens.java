
package Capitulo14;

import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruevaTokens {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escriba un enunciado y oprima intro");
        String enunciado = scaner.nextLine();
        
        //procesamineto
        String[] tokens = enunciado.split(" ");
        System.out.printf("Numero de elementos: %d%nLos tokens son:%n", tokens.length);
        
        for(String token : tokens){
            System.out.println(token);
        }
    }
}
