//buena practica de ingenieria de software
package Capitulo9;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoBaseMasComisionGoodEn extends EmpleadoPorComisionGoodEn{
    private double salarioBase;

    public EmpleadoBaseMasComisionGoodEn(String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        
        if (salarioBase < 0.0 ) {
            throw new IllegalArgumentException("El salario debe ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }
    
    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    //sobre escribira el metodo ingreso de la calse EmpleadoPorComisionGoodEn
    @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();//con super invocamos al metodo de la superClase
    }
    
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f", "con sueldo base",
                super.toString(), "Sueldo base", getSalarioBase());
    }
}
