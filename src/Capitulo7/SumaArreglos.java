
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class SumaArreglos {
    public static void main(String[] args) {
        int[] arreglo = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];//suam a total cada uno de los elementos del arreglo en cada iteracion
        }
        
        System.out.printf("Total de los elementos del arreglo: %d%n", total);
    }
}
