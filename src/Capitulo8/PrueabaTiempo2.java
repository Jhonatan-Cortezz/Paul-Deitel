
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PrueabaTiempo2 {
    
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21, 34);
        Tiempo2 t4 = new Tiempo2(12, 25, 42);
        Tiempo2 t5 = new Tiempo2(t4);
        
        System.out.println("Se construyo con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2, se especifico hora, minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especifico hora y minuto, segundo predeterminado", t3);
        mostrarTiempo("t4 Se especifico hora, minuto y segundo ", t4);
        mostrarTiempo("t5 se especifico el objeto Tiempo2 llamado t4", t5);
        
        //intento de inicializar t6 con valores invalidos
        try {
            Tiempo2 t6 = new Tiempo2(27, 74, 99);
            
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepcion al inicializar t6: %s%n", e.getMessage());
        }
    }
    
    public static void mostrarTiempo(String encabezado, Tiempo2 t){
        System.out.printf("%s%n   %s%n   %s%n",
                encabezado, t.aStringUniversal(),t.toString());
    }
}
