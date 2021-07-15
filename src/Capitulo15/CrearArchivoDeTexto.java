
package Capitulo15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class CrearArchivoDeTexto {
    private static Formatter salida;
    
    public static void main(String[] args) {
        abrirArchivo();
        agregarRegistros();
        cerrarArchivo();
    }
    
    public static void abrirArchivo(){
        try {
            salida = new Formatter("Clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permiso de escritura denegado. Terminado.");
            System.exit(1);          
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error al abrir el archivo. Terminado.");
            System.exit(1);
        }
    }
    
    //agrega registros al archivo
    public static void agregarRegistros(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Escriba numero de cuenta, nombre, apellido y saldo.",
                "Para terminar la entrada escribe el indicador de fin de archivo");
        
        while(!entrada.hasNext("fin")){//itera hasta encontrar el indicador de fin
            try {
                salida.format("%d %s %s %.2f%n", entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo. Terminado");
                break;
            } catch (NoSuchElementException elementException){
                System.err.println("Entrada invalida, intente de nuevo");
                entrada.nextLine();
            }
            System.out.print("? ");
        }
    }
    
    public static void cerrarArchivo(){
        if (salida != null) {
            salida.close();
        }
    }
}
