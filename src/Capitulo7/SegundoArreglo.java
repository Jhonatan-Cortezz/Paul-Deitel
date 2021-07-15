
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class SegundoArreglo {
    public static void main(String[] args) {
        int[] arreglo = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        System.out.printf("%s%s8%n", "Indice", "Valor");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%5d%8d%n", i, arreglo[i]);
        }
    }
}
