
package Capitulo14;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class CadenaInicioFin {
    public static void main(String[] args) {
        String[] cadenas = {"empezo", "empezando", "termino", "terminando"};
        
        //prueba el metodo startsWith
        for(String cadena : cadenas){
            if (cadena.startsWith("em")) {
                System.out.printf("\"%s\" empieza con \"em\"%n", cadena);
            }
        }
        System.out.println("");
        
        //prueba del metodo startsWith empezando desde la posicion 2 de la cadena
        for(String cadena : cadenas){
            if (cadena.startsWith("pez", 2)) {
                System.out.printf("\"%s\" empieza con \"pez\" en la posicion 2%n", cadena);
            }
        }
        System.out.println("");
        
        //prueba del metodo endWith
        for(String cadena : cadenas){
            if (cadena.endsWith("do")) {
                System.out.printf("\"%s\" termina con \"do\"%n", cadena);
            }
        }
    }
}
