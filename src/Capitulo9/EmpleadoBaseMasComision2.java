
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoBaseMasComision2 extends EmpleadoPorComision{
    private double salarioBase;
    
    public EmpleadoBaseMasComision2(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventasBrutas, 
            double tarifaComision, double salarioBase){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("el salario base debe ser > 0.0");
        }
        
        this.salarioBase = salarioBase;
    }
    
    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("el salario base debe ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    //calcula los ingresos
    //este metodo sobreescrirá uno existente
    @Override
    public double ingresos(){
        //no esta permitido tarifaComision y ventasBrutas son private
        return salarioBase + (tarifaComision * ventasBrutas);
    }
    
    @Override
    public String toString(){
        //no esta permitido 
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
                "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
                "numero seguro social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas, 
                "tarifa de comision", tarifaComision,
                "salario base", salarioBase);
    }
}
