
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision, String primerNombre, String spellidoPaterno, String numeroSeguroSocial) {
        super(primerNombre, spellidoPaterno, numeroSeguroSocial);
        
        if (tarifaComision <= 0.0 || tarifaComision >=1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1");
        }
        
        if (ventasBrutas < 0.0 ) {
            throw new IllegalArgumentException("Las ventas brutas deben ser > 0");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser > 0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >=1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1");
        }
        this.tarifaComision = tarifaComision;
    }
    
    /*
    @Override
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }
    */
    @Override
    public double obtenerMontoPago(){
        return getTarifaComision()* getVentasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "Empleado por comision", super.toString(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comision", getTarifaComision());
    }
    
}
