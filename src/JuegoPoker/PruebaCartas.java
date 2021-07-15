
package JuegoPoker;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaCartas {
    public static void main(String[] args) {
        PaqueteDeCartas miPaquet = new PaqueteDeCartas();
        miPaquet.barajar();
        
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-20s", miPaquet.repartirCart());
            
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
