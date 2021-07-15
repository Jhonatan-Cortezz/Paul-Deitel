
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Factura implements PorPagar{//aqui implementamos nuestra interfaz PorPagar
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("cantidad debe ser > 0");
        }
        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("el precio por articulo debe ser > 0");
        }
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }
    
    public String getNumeroPieza(){
        return numeroPieza;
    } 
    
    public String getDescripcionPieza(){
        return descripcionPieza;
    }
    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser > 0");
        }
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("el precio debe ser > 0.0");
        }
        this.precioPorArticulo = precioPorArticulo;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
                "Factura", "numero de pieza", getNumeroPieza(), getDescripcionPieza(),
                "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
    }
    
    //metodo requerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double obtenerMontoPago(){
        return getCantidad() * getPrecioPorArticulo();
    }
            
}
