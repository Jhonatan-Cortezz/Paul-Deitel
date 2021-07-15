
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoBaseMasComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa comision debe ser >0.0 y <1.0");
        }
        
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
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
    
    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario debe ser >=0.0");
        }
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    //calcula los ingresos
    public double ingresos(){
        return salarioBase + (tarifaComision * ventasBrutas);
    }
    
    @Override//indica que este metodo sobrescirbe el emtodo de una superclase
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
                "empleado por comision con sueldo base ", primerNombre, apellidoPaterno,
                "Numero de seguro social ", numeroSeguroSocial,
                "Ventas brutas ", ventasBrutas,
                "Tarifa comision ", tarifaComision,
                "salario base", salarioBase);
    }
    
}
