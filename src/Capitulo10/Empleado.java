
package Capitulo10;

/**
 *Clase abstracta
 * @author JHONATAN CORTEZ
 */
public abstract class Empleado implements PorPagar{//modificamos esta clase para implementar la interfaz
    private final String primerNombre;
    private final String spellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String spellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.spellidoPaterno = spellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSpellidoPaterno() {
        return spellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    
    //devuelve representacion String de objeto Empleado
    @Override
    public String toString(){
        return String.format("%s %s%nnumero de seguro social: %s", 
                getPrimerNombre(), getSpellidoPaterno(), getNumeroSeguroSocial());
    }
    
    //metodo abstracto sobreescrito por las subclases concretas
    //public abstract double ingresos();//no hay implementacion 
    //declaramos este metodo como abstracto para indicar que cada subclase 
    //debe declarar una implementacion especifica para calcular el ingreso
}
