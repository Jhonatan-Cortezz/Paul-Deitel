
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class CalculoArreglo {
    public static void main(String[] args) {
        final int LONGITUD_ARREGLO = 10;
        int[] arreglo = new int[LONGITUD_ARREGLO];
        
        //calcula el valor para cada elemento del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 2 + 2 * i;
        }
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%5d%8d%n", i, arreglo[i]);
        }
    }
}
