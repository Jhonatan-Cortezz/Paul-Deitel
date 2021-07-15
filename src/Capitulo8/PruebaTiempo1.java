
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo();
        
        mostrarTiempo("Despues de crear el objeto tiempo", tiempo1);
        System.out.println();
        
        tiempo1.establecerTiempo(13, 27, 6);
        mostrarTiempo("Despues de llamar a establecer tiempo", tiempo1);
        System.out.println();
        
        try {
            tiempo1.establecerTiempo(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepcion: %s%n%n", e.getMessage());
        }
        mostrarTiempo("Despues de llamar a establecerTiempo con valores invalidos", tiempo1);
        
    }
    
    public static void mostrarTiempo(String encabezado, Tiempo t){
        System.out.printf("%s%nTiempo universal: %s%nTiempo estandar: %s%n",
                encabezado, t.aStringUniversal(), t.toString());
    }
}
