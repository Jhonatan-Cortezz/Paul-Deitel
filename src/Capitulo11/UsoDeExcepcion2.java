
package Capitulo11;

public class UsoDeExcepcion2 {
 
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
            
            //obtiene la informacion de rastreo de la pila
            StackTraceElement[] elementosRastero = exception.getStackTrace();
            System.out.printf("%nRastreo de la pila de getStackTrace:%n");
            System.out.println("Clase\t\t\tArchivo\t\t\tLiena\tMetodo");
            
            //se obtien la drecripcion de la excepcion
            for(StackTraceElement elemento: elementosRastero){
                System.out.printf("%s\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t", elemento.getLineNumber());
                System.out.printf("%s%n", elemento.getMethodName());
            }
        }
    }
    
    //seguimiento en cadena de excepciones
    public static void metodo1()throws Exception{
        metodo2();
    }
    
    public static void metodo2()throws Exception{
        metodo3();
    }
    
    public static void metodo3()throws Exception{
        throw new Exception("La excepcion se lanzo en metodo 3");
    }
}