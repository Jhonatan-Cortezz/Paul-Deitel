
package Capitulo16;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {
    
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();
        
        pila.push(12L);
        System.out.println("Se metio 12L");
        imprimirPila(pila);
        pila.push(34567);
        System.out.println("Se metio 34567");
        imprimirPila(pila);
        pila.push(1.0F);
        System.out.println("Se metio 1.0F");
        imprimirPila(pila);
        pila.push(1234.5678);
        System.out.println("Se metio 1234.5678");
        imprimirPila(pila);
        
        try {
            Number objEliminado = null;
            while (true) {                
                objEliminado = pila.pop();
                System.out.printf("Se saco %s%n", objEliminado);
                imprimirPila(pila);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
    
    private static void imprimirPila(Stack<Number> pila){
        if (pila.isEmpty()) {
            System.out.printf("La pila esta vacia%n%n");
        } else {
            System.out.printf("la pila contiene: %s (cima)%n", pila);
        }
    }
}
