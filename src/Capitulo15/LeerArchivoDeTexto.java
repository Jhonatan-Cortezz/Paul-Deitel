
package Capitulo15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class LeerArchivoDeTexto {
    private static Scanner entrada;
    
    public static void main(String[] args) {
        abrirArchivo();
        leerRegistros();
        cerrarArchivo();
    }
    
    public static void abrirArchivo(){
        try {
            entrada = new Scanner(Paths.get("Clientes.txt"));
        } catch (IOException iOException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
    }
    
    public static void leerRegistros(){
        System.out.printf("%-10s%-15s%-12s%10s%n", "Cuenta", "Primer Nombre", "Apellido Paterno", "Saldo");
        
        try {
            
            while (entrada.hasNext()) {            
                System.out.printf("%-10d%-15s%-12s%15.2f%n", entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado");
        } catch (IllegalStateException illegalStateException){
            System.err.println("Error al leer el archivo");
        }
    }
    
    public static void cerrarArchivo(){
        if (entrada != null) {
            entrada.close();
        }
    }
}
