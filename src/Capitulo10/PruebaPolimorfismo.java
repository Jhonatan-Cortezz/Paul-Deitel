
package Capitulo10;

import Capitulo9.EmpleadoBaseMasComision;
import Capitulo9.EmpleadoPorComision;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision(
                "Sue", "Jhones", "222-22-2222", 10000, .06);
        
        EmpleadoBaseMasComision empleadoComision = new EmpleadoBaseMasComision(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        //invoca toString en un objeto de la superclase usando variable de la super clase
        System.out.printf("%s %s:%n%n%s%n%n",
                "Llamada a toString de empleadoPorComision con referencia de superclase",
                "A un objeto de la superclase", empleado.toString());
        
        //invoca a toString en un objeto de la subclase, usando variable de la subclase
        System.out.printf("%s %s:%n%n%s%n%n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subclase a un objeto de la subclase",
                empleadoComision.toString());
        
        //EmpleadoPorComision empleado2 = empleadoComision;
        
        
    }
}
