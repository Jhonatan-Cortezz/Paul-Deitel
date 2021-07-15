
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    double ola;
    String hola;
    String aa = "";
    boolean r = true;
    double suma = ola + 4;

    //este es un comentario 
    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifaComision, String primerNombre, String spellidoPaterno, String numeroSeguroSocial) {
        super(ventasBrutas, tarifaComision, primerNombre, spellidoPaterno, numeroSeguroSocial);
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario debe ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario debe ser > 0.0");
        }
        this.salarioBase = salarioBase;
    }
    /*
    @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();//sobre escribe el metodo de la super clase
        //suma salario base de esta clase a los ingresos de la superclase EmpleadoPorComision
    }
    */
    @Override
    public double obtenerMontoPago(){
        return getSalarioBase() + super.obtenerMontoPago();//sobre escribe el metodo de la super clase
        //suma salario base de esta clase a los ingresos de la superclase EmpleadoPorComision
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", 
                "Con salario base", super.toString(),
                "salario base", getSalarioBase());
    }
}
