
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoPorHora extends Empleado{
    private double sueldo;
    private double horas;

    public EmpleadoPorHora(double sueldo, double horas, String primerNombre, String spellidoPaterno, String numeroSeguroSocial) {
        super(primerNombre, spellidoPaterno, numeroSeguroSocial);
        if (sueldo < 0.0) {
            throw new IllegalArgumentException("El sueldo por horas debe ser > 0.0");
        }
        
        if ((horas < 0.0 ) || (horas > 168.0)) {
            throw new IllegalArgumentException("La horas trabajdadas deben ser > 0.0 y <=168");
        }
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    /*modificacion para implemenatar la interfaz
    @Override
    public double ingresos(){
        if (getHoras() <= 40) {
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }
    */
    
    @Override
    public double obtenerMontoPago(){
        if (getHoras() <= 40) {
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f", 
                super.toString(), "sueldo por hora", getSueldo(),
                "horas trabajadas", getHoras());
    }
}
