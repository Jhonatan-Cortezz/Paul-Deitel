
package Capitulo7;

import java.util.Arrays;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class ManipulacionesArreglos {
    public static void main(String[] args) {
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        //ordenamos el arreglo de forma ascendente
        Arrays.sort(arregloDouble);
        System.out.printf("%narregloDouble");
        
        for(double valor : arregloDouble){
            System.out.printf("%.1f", valor);
        }
        
        int[] arregloIntLleno = new int[10];
        //llena el arreglo con 7 elementos
        Arrays.fill(arregloIntLleno, 7);
        mostrarArreglo(arregloIntLleno, "arregloIntLleno");
        
        
        int[] arregloInt = {1, 2, 3, 4, 5, 6};
        int[] copiaArregloInt = new int[arregloInt.length];
        //copia arregloInt en el arreglo copiaArreglo
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
        mostrarArreglo(arregloInt, "arregloInt");
        mostrarArreglo(copiaArregloInt, "copiaArregloInt");
        
        //compara si arregloInt y arregloCopia son iguales
        boolean b = Arrays.equals(arregloInt, copiaArregloInt);
        System.out.printf("%n%narregloInt %s copiaArregloInt%n", (b ? "==" : "!="));
        
        //compara si arregloInt y arregloLleno son iguales
        boolean c = Arrays.equals(arregloInt, arregloIntLleno);
        System.out.printf("%narregloInt %s copiaArregloIntLleno%n", (c ? "==" : "!="));
        
        //busca en arregloInt el valor de 5
        int ubicacion = Arrays.binarySearch(arregloInt, 5);
        
        if (ubicacion >= 0) {
            System.out.printf("Se encontro el 5 en el elemento %d de arregloInt%n", ubicacion);
        } else {
            System.out.println("No se encontro el 5 en arregloInt%n");
        }
        
        ubicacion = Arrays.binarySearch(arregloInt, 8763);
        if (ubicacion >= 0) {
            System.out.printf("Se encontro el 8763 en el elemento %d de arregloInt%n", ubicacion);
        } else {
            System.out.println("No se encontro el 8763 en arregloInt%n");
        }
        
    }
    
    public static void mostrarArreglo(int[] arreglo, String descripcion){
        System.out.printf("%n%s: ", descripcion);
        for(int valor : arreglo){
            System.out.printf("%d ", valor);
        }
    }
}
