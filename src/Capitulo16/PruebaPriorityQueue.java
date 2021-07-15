
package Capitulo16;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Double> cola = new PriorityQueue<>();
        
        //inserta elementos en la cola
        cola.offer(3.2);
        cola.offer(9.8);
        cola.offer(5.4);
        
        System.out.print("Sondeado de cola");
        
        while(cola.size() > 0){
            System.out.printf("%.1f ", cola.peek());
            cola.poll();
            
        }
    }
}
