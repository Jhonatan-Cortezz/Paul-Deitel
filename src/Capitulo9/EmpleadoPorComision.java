
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoPorComision extends Object{
    /*
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;//porcentaje de comision
    */
    protected final String primerNombre;
    protected final String apellidoPaterno;
    protected final String numeroSeguroSocial;
    protected double ventasBrutas;
    protected double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        //validamos 
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor a 0");
        }
        
        if (tarifaComision < 0.0 || tarifaComision > 1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    
    //devuelve el primer nombre
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    //devuelve apellido
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    //setter
    public void setVentasBrutas(double ventasBrutas){
        if (ventasBrutas <= 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }
    
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    //establece la tarifa de comision
    public void setTarifaComision(double tarifaComision){
        if (tarifaComision <=0.0 || tarifaComision >=1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0 y < 1");
        }
        this.tarifaComision = tarifaComision;
    }
    
    public double getTaarifaComision(){
        return tarifaComision;
    }
    
    //calcula los ingresos
    public double ingresos(){
        return tarifaComision * ventasBrutas;
    }
    
    //devuelve representacion String del objeto empleado
    @Override//indica que este metodo sobrescirbe el emtodo de una superclase
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
                "empleado por comision ", primerNombre, apellidoPaterno,
                "Numero de seguro social ", numeroSeguroSocial,
                "Ventas brutas ", ventasBrutas,
                "Tarifa comision ", tarifaComision);
    }
    
}
