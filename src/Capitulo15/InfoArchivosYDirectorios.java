
package Capitulo15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class InfoArchivosYDirectorios {
    public static void main(String[] args)throws IOException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba el nombre del archivo o direcotrio");
        Path ruta = Paths.get(entrada.nextLine());
        
        if (Files.exists(ruta)) {
            System.out.printf("%n%s existe%n", ruta.getFileName());
            System.out.printf("%s es un directorio%n", Files.isDirectory(ruta) ? "Es" : "No es");
            System.out.printf("%s es una ruta absoluta%n", ruta.isAbsolute() ? "Es" : "No es");
            System.out.printf("fecha de ultima modificacion: %s%n", Files.getLastModifiedTime(ruta));
            System.out.printf("Tamaño: %s%n", Files.size(ruta));
            System.out.printf("Ruta: %s%n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());
            
            if (Files.isDirectory(ruta)) {
                System.out.printf("%nContenido del directorio:%n");
                //objeto para iterar a traves del contenido del directorio
                DirectoryStream<Path> flujoDirectory = Files.newDirectoryStream(ruta);
                
                for(Path p : flujoDirectory){
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("No existe " + ruta);
        }
    }
}
