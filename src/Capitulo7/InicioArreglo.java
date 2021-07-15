
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class InicioArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[10];//areglo de 10 elementos
        
        System.out.printf("%s%8s%n", "indice", "valor");
        
        //recorrido del arrego para imprimirlo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%5d%8d%n", i, arreglo[i]);
        }
    }
}
