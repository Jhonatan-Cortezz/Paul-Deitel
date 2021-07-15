
package Capitulo14;

import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Validacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer nombre");
        String primerNombre = scanner.nextLine();
        System.out.println("Escriba el apellido");
        String apellido = scanner.nextLine();
        System.out.println("Escriba la dirección");
        String direccion = scanner.nextLine();
        System.out.println("Escriba la ciudad");
        String ciudad = scanner.nextLine();
        System.out.println("Escriba el estado");
        String estado = scanner.nextLine();
        System.out.println("Escriba el codigo postal");
        String cp = scanner.nextLine();
        System.out.println("Escriba el telefono");
        String telefono = scanner.nextLine();
        
        System.out.println("\nValidar Resultado");
        
        if (!ValidacionEntrada.validarPrimerNombre(primerNombre)) {
            System.out.println("Primer nombre invalido");
        } else if(!ValidacionEntrada.validarApellido(apellido)){
            System.out.println("Apellido invalido");
        } else if(!ValidacionEntrada.validarDireccion(direccion)){
            System.out.println("Direccion invalida");
        } else if(!ValidacionEntrada.validarCiudad(ciudad)){
            System.out.println("Ciudad invalida");
        } else if(!ValidacionEntrada.validarEstado(estado)){
            System.out.println("Estado Invalido");
        } else if (!ValidacionEntrada.validarCP(cp)) {
            System.out.println("codigo postal Invalido");
        } else if (!ValidacionEntrada.validarTelefono(telefono)) {
            System.out.println("numero de telefono invalido");
        } else {
            System.out.println("La entrada es correcta");
        }
    }
}
