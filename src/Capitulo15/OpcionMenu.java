
package Capitulo15;

/**
 *
 * @author JHONATAN CORTEZ
 */
public enum OpcionMenu {
    //declara el contenido del tipo enum
    SALDO_CERO(1),
    SALDO_CREDITO(2),
    SALDO_DEBITO(3),
    FIN(4);
    
    private final int valor;
    
    //constructor
    private OpcionMenu(int valor){
        this.valor = valor;
    }
}
