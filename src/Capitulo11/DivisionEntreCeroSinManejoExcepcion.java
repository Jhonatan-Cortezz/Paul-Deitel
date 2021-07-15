
package Capitulo11;

import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class DivisionEntreCeroSinManejoExcepcion {
    public static int cociente(int numerador, int denominador){
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        
        System.out.println("intorduzca un numerador entero");
        int numerador = explorador.nextInt();
        System.out.println("introduzaca un denominador");
        int denominador = explorador.nextInt();
        
        int resultado = cociente(numerador, denominador);
        System.out.printf("%nResultado: %d / %d = %d%n",
                numerador, denominador, resultado);
    }
}
