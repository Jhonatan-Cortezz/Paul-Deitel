
package JuegoPoker;

import java.security.SecureRandom;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PaqueteDeCartas {
    private Carta[] paquete;//arreglo de objetos carta
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    
    //generar numeros aleatorios
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    
    public PaqueteDeCartas(){
        String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve",
                            "Diez", "Joker", "Reina", "Rey"};
        String[] palos = { "Corazones", "Diamantes", "Treboles", "Espadas"};
        
        
        paquete = new Carta[NUMERO_DE_CARTAS];
        cartaActual = 0;
        
        for (int i = 0; i < paquete.length; i++) {
            paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
        }
    }
    
    public void barajar(){
        cartaActual = 0;
        
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    public Carta repartirCart(){
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }
    
}
