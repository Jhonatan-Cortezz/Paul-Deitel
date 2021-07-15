
package Capitulo5;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class SumaPares {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 20; i += 2) {
            total += i;
        }
        System.out.println("La suma es: " + total);
    }
}
