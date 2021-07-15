
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        System.out.println("Informacion del empleado obtenida por los metodos set");
        System.out.printf("%n%s %s%n", "el pirmer nombre es: ", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "Apellido", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "numero de SS", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comision es: ", empleado.getTaarifaComision());
        System.out.printf("%s %.2f%n", "Salario base", empleado.getSalarioBase());
        
        empleado.setSalarioBase(1000);
        
        System.out.printf("%n%s:%n%n%s5n",
                "Informacion actulizada del empleado, for toString", empleado.toString());
    }
}
