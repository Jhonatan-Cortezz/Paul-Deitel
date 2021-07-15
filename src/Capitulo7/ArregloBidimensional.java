
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class ArregloBidimensional {
    public static void main(String[] args) {
        int[][] arreglo1 = {{1,2,3}, {4,5,6}};
        int[][] arreglo2 = {{1,2}, {1}, {4,5,6}};
        
        System.out.println("Los valores en arreglo1 por filas son");
        imprimirArreglo(arreglo1);
        
        System.out.printf("%nLos valores en arreglo2 por filas son%n");
        imprimirArreglo(arreglo2);
    }
    
    //imprime filas y columnas de un arreglo bidimensional
    public static void imprimirArreglo(int[][] arreglo){
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int columnas = 0; columnas < arreglo[fila].length; columnas++) {
                System.out.printf("%d ", arreglo[fila][columnas]);
            }
            System.out.println();
        }
    }
}
