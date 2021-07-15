
package Cueta;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        if(saldo>0.0)
            this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double montoDeposito){
        if (montoDeposito>0.0) {
            saldo = saldo + montoDeposito;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
