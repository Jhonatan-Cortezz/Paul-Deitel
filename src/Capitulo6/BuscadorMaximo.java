
package Capitulo6;

import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class BuscadorMaximo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Escriba 3 valores de punto flotante");
        System.out.println("valor 1");
        n1 = entrada.nextDouble();
        System.out.println("valor 2");
        n2 = entrada.nextDouble();
        System.out.println("valor 3");
        n3 = entrada.nextDouble();
        
        double resultado = maximo(n1, n2, n3);
        
        System.out.println("El valor maximo es: " + resultado);
    }
    
    public static double maximo(double x, double y, double z){
        double valorMaximo = x;
        
        if (y > valorMaximo) {
            valorMaximo = y;
        }
        if (z > valorMaximo) {
            valorMaximo = z;
        }
        return valorMaximo;
    }
}
