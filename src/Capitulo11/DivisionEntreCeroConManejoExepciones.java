
package Capitulo11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class DivisionEntreCeroConManejoExepciones {
    
    //como lanzar una excepcion cuado ocurre una division entre cero
    public static int cociente(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        
        boolean continuarCiclo = true;//determina si necesita mas datos de entrada
        
        do {            
            try {
                System.out.println("Introduzca un numero entero");
                int numerador = explorador.nextInt();
                System.out.println("introduzca un denominador entero");
                int denominador = explorador.nextInt();
                
                int resultado = cociente(numerador, denominador);
                System.out.printf("%nResultado: %d / %d = %d%n",
                        numerador, denominador, resultado);
                continuarCiclo = false; //operacion exitosa termina ciclo
                
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nExcepcion: %s%n", inputMismatchException);
                explorador.nextLine();//descarta entrada para que el usuario intente otra vez
                System.out.println("Debe introducir enteros, intente denuevo%n%n");
            }catch (ArithmeticException arithmeticException){
                System.err.printf("%nExcepcion: %s%n", arithmeticException);
                System.out.printf("Cero es un denominador invalido intente denuevo");
            }
            
        } while (continuarCiclo);
    }
}
