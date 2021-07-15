
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision(
                "Sue", "Jones", "222-22-2222", 10000, .06);
        
        System.out.println("Informacion del empleado obtenida por los metodos set");
        System.out.printf("%n%s %s%n", "el pirmer nombre es: ", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "Apellido", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "numero de SS", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comision es: ", empleado.getTaarifaComision());
        
        empleado.setVentasBrutas(500);
        empleado.setTarifaComision(.1);
        
        System.out.printf("%n%s:%n%n%s%n", 
                "Informacion actualizada del empleado, obtenida medianta toString", empleado);
    }
}
