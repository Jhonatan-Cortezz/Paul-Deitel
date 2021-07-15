
package Capitulo11;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class UsodeExcepciones {
    
    public static void main(String[] args) {
        try {
            lanzarExcepciones();
        } catch (Exception e) {
            System.err.println("la excepcion se manejo en main");
        }
        
        noLanzaExcepcion();
    }
    
    
    
    public static void lanzarExcepciones()throws Exception{
        try {
            //lanza una excepcion y la atrapa de inmediato
            System.out.println("Metodo lanza excepcion");
            throw new Exception();
        } catch (Exception exception) {
            System.err.println("La excepcion se manejo en el metodo lanzaexcepcion");
        } finally {
            System.err.println("se ejecuto finally en lanzaExcepcion");
        }
        
    }
    
    public static void noLanzaExcepcion(){
        try {
            System.out.println("Metodo no lanza Excepcion");
        } catch (Exception exception) {
            System.err.println(exception);
        } finally {//siempre se ejecuta
            System.err.println("Se ejecuta finally en noLanzaExcepcion");
        }
        System.out.println("fin del metodo no lanza excepcion");
    }
}
