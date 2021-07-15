
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaDatosPaquete {
    public static void main(String[] args) {
        DatosPaquete datos = new DatosPaquete();
        
        System.out.printf("Despues de instanciar:%n%s%n", datos);
        
        datos.numero = 77;
        datos.cadena = "Adios";
        
        System.out.printf("%nDespues de modificar valores:%n%s%n", datos);
    }
}

class DatosPaquete{
    int numero;
    String cadena;
    
    public DatosPaquete(){
        numero = 0;
        cadena = "Hola";
    }
    
    public String toString(){
        return String.format("numeo: %d; cadena %s", numero, cadena);
    }
}
