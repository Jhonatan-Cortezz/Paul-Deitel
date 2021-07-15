
package Capitulo9;

/**
 *buena practica de ingenieria de software
 * @author JHONATAN CORTEZ
 */
public class PruebaEmpleadoBaseMasComisionGoogEn {
    public static void main(String[] args) {
        EmpleadoBaseMasComisionGoodEn empleado = new EmpleadoBaseMasComisionGoodEn(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        System.out.println("Informacion del empleado obtenida por los metodos set");
        System.out.printf("%n%s %s%n", "el pirmer nombre es: ", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "Apellido", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "numero de SS", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comision es: ", empleado.getTarifaComision());
        System.out.printf("%s %.2f%n", "Salario base", empleado.getSalarioBase());
        
        empleado.setSalarioBase(1000);
        
        System.out.printf("%n%s:%n%n%s5n",
                "Informacion actulizada del empleado, for toString", empleado.toString());
    }
}
