
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaEmpleadoStatic {
    public static void main(String[] args) {
        System.out.printf("Empleado antes de instanciar: %d%n", EmpleadoStatic.getCuenta());
        
        EmpleadoStatic e1 = new EmpleadoStatic("Susan", "Baker");
        EmpleadoStatic e2 = new EmpleadoStatic("Bob", "Blue");
        
        System.out.printf("%nEmpleados despues de instanciar%n");
        System.out.printf("mediante e1.getCuenta(): %d%n", e1.getCuenta());
        System.out.printf("mediante e2.getCuenta(): %d%n", e2.getCuenta());
        System.out.printf("mediante Empleado.getCuenta(): %d%n", EmpleadoStatic.getCuenta());
        
        //obtener los nombres de los empleados
        System.out.printf("%nEmpleado 1: %s %s%nEmpleado 2: %s %s%n",
                e1.getNombre(), e1.getApellido(), e2.getNombre(), e2.getApellido());
    }
}
