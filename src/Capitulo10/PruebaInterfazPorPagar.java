
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375);
        objetosPorPagar[1] = new Factura("56789", "Llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado(800, "John", "Smith", "111-11-1111");
        objetosPorPagar[3] = new EmpleadoAsalariado(1200.00, "Lisa", "Barnes", "888-88-8888");
        
        System.out.println("Factura y Empleado porcesado de forma polimorfica");
        
        for(PorPagar porPagarActual : objetosPorPagar){
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
        }
    }
}
