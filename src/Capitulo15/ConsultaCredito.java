
package Capitulo15;

import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class ConsultaCredito {
    private final static OpcionMenu[] opciones = OpcionMenu.values();
    
    public static void main(String[] args) {
        OpcionMenu tipoCuenta = obtenerSolicitud();
        
        while (tipoCuenta != OpcionMenu.FIN) {            
            
            switch(tipoCuenta){
                case SALDO_CERO:
                    System.out.printf("%nCuentas con saldos de cero:%n");
                    break;
                    
                case SALDO_CREDITO:
                    System.out.printf("%nCuentas con saldos con credito:%n");
                    break;
                    
                case SALDO_DEBITO:
                    System.out.printf("%nCuentas con saldos con debito:%n");
                    break;                        
            }
            
            leerRegistros(tipoCuenta);
            tipoCuenta = obtenerSolicitud();
        }
        
    }
    
    
    private static OpcionMenu obtenerSolicitud(){
        int solicitud = 4;
        
        //muestra opciones de solicitud
        System.out.printf("%nEscriba solicitud%n%s%n%s%n%s%n%s%n",
                " 1 - Lista de cuentas con saldos cero",
                " 2 - Lista de cuentas con saldos con credito",
                " 3 - Listas de cuentas con saldos con debito", 
                " 4 - Terminar programa");
        
        try {
            Scanner entrada = new Scanner(System.in);
            do {                
                System.out.printf("%nR/:");
                solicitud = entrada.nextInt();
            } while ((solicitud < 1) || (solicitud > 4));
        } catch (NoSuchElementException e) {
            System.err.println("entrada invalida");
        }
        
        return opciones[solicitud -1];
    }
    
    //lee los datos del archivo y muestra los registros solo del tipo apropiado
    private static void leerRegistros(OpcionMenu tipoCuenta){
        try (Scanner entrada = new Scanner(Paths.get("clientes.txt"))){
            while (entrada.hasNext()) {                
                int numeroCuenta = entrada.nextInt();
                String primerNombre = entrada.next();
                String apellido = entrada.next();
                double saldo = entrada.nextDouble();
                
                if (debeMostrar(tipoCuenta, saldo)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", numeroCuenta, primerNombre, apellido, saldo);
                } else {
                    entrada.nextLine();
                }
            }
        } catch (Exception e) {
        }
    }
    
    private static boolean debeMostrar(OpcionMenu tipoCuenta, double saldo){
        if ((tipoCuenta == OpcionMenu.SALDO_CREDITO) && (saldo < 0)) {
            return true;
        } else if ((tipoCuenta == OpcionMenu.SALDO_DEBITO) && (saldo > 0)) {
            return true;
        } else if((tipoCuenta == OpcionMenu.SALDO_CERO) && (saldo == 0)){
            return true;
        }
        return false;
    }
}
