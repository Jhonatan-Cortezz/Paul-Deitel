
package Capitulo5;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.printf("%d ", i);
        }
        
        System.out.printf("%n se uso continue para omitir imprimir 5%n");
    }
}
