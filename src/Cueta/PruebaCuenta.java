
package Cueta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaCuenta {
    public static void main(String[] args) {
        try {
            
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

            Cuenta miCuenta1 = new Cuenta("Jane Green", 50.00);
            Cuenta miCuenta2 = new Cuenta("Jhon Blue", -7.53);

            System.out.printf("Saldo de %s: $%.2f%n", miCuenta1.getNombre(), miCuenta1.getSaldo());
            System.out.printf("Saldo de %s: $%.2f%n", miCuenta2.getNombre(), miCuenta2.getSaldo());
            
            System.out.println("Escriba el monto a depositar para cuenta1");
            double montoDeposito = Double.parseDouble(leer.readLine());
            System.out.printf("%nsumando %.2f al saldo de la cuenta1%n%n", montoDeposito);
            miCuenta1.depositar(montoDeposito);
            
            System.out.printf("Saldo de %s: $%.2f%n", miCuenta1.getNombre(), miCuenta1.getSaldo());
            System.out.printf("Saldo de %s: $%.2f%n%n", miCuenta2.getNombre(), miCuenta2.getSaldo());
            
            System.out.print("Escriba el monto a depositar para cuenta2");
            montoDeposito = Double.parseDouble(leer.readLine());
            System.out.printf("%nsumando %.2f al saldo de la cuenta2%n%n", montoDeposito);
            miCuenta2.depositar(montoDeposito);
            
            System.out.printf("Saldo de %s: $%.2f%n", miCuenta1.getNombre(), miCuenta1.getSaldo());
            System.out.printf("Saldo de %s: $%.2f%n", miCuenta2.getNombre(), miCuenta2.getSaldo());
            //System.out.printf("El nombre en el objeto cuenta es %n%s%n", miCuenta.getNombre());
        } catch (Exception e) {
        }
    }
}
