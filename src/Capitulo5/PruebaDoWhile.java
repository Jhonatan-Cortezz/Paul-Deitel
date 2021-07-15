
package Capitulo5;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        
        do {            
            System.out.printf("%s ", contador);
            ++contador;
        } while (contador <= 10);
        System.out.println();
    }
}
