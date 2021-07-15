
package JuegoCRAPS;

import java.security.SecureRandom;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Craps {
    
    //instanciamos la clase para generar numeros aleatorio
    private static final SecureRandom numRamdom = new SecureRandom();
    
    //enumeracion constante que representa el estado del juego [la clase ENUM]
    private enum Estado {CONTINUA, GANO, PERDIO};
    
    //tiros comunes del dado
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;
    
    public static void main(String[] args) {
        //variable de instancia para guardar los puntos
        int miPunto = 0;
        
        //la clase enum toma cualquier estado del juego
        Estado estadoJuego;// le damos un nombre a la clase enum
        
        //tiramos los dados
        int sumaDeDados = titarDados();
        
        switch(sumaDeDados){
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANO;
                break;
                
            case DOS_UNOS: case TRES: case DOCE:
                estadoJuego = Estado.PERDIO;
                break;
                
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }
        
        while (estadoJuego == Estado.CONTINUA) {            
            sumaDeDados = titarDados();
            
            if (sumaDeDados == miPunto) {
                estadoJuego = Estado.GANO;
            } else {
                if (sumaDeDados == SIETE) {
                    estadoJuego = Estado.PERDIO;
                }
            }
        }
        
        if (estadoJuego == Estado.GANO) {
            System.out.println("El jugador gana");
        } else {
            System.out.println("El jugador pierde");
        }
    }
    
    public static int titarDados(){
        //tiramos dos veces los dados que arrojan numeros aleatorios
        int dado1 = 1 + numRamdom.nextInt(6);
        int dado2 = 1 + numRamdom.nextInt(6);
        
        //necesitamos ver cunto es la suma de los dos dados
        int suma = dado1 + dado2;
        
        //imprimimos el valor de las dos caras de los dados mas la suma
        System.out.printf("El jugador tiro %d + %d = %d%n", dado1, dado2, suma);
        
        return suma;
    }
    
}
