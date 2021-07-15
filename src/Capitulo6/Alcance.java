
package Capitulo6;

/**
 *
 * @author JHONATAN CORTEZ
 */
//vermos como es el alcance de una variable o metodo dependiendo de su declaracion
public class Alcance {
    //este campos es accesible para todos los metodos de esta clase
    private static int x = 1;
    
    public static void main(String[] args) {
        int x = 5;
        
        System.out.printf("La x local en main es %s%n", x);
        
        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();
        
        System.out.printf("%nLa x local en main es %s%n", x);
    }
    
    
    public static void usarVariableLocal(){
        int x = 25;//se inicializa cada vez que este metodo es invocado
        
        System.out.printf("%nla x local al entrar al metodo usarVariableLocal es %s%n", x);
        ++x;
        System.out.printf("la x local antes de salir del metodo usarVariableLocal es %d%n", x);
    }
    
    public static void usarCampo(){
        System.out.printf("%nel campo x al entrar al metodo usarCampo es %d%n", x);
        x *=10;
        System.out.printf("%nel campo x antes de salir del metodo usarCampo es %d%n", x);
    }
}
