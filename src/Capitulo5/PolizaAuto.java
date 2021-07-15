
package Capitulo5;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PolizaAuto {
    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean esEstadoSinCulpa(){
        boolean estadoSinCulpa;
        
        switch(getEstado()){
            case "MA": case "NJ": case "NY": case "PA":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
        }
        
        return estadoSinCulpa;
    }
}
