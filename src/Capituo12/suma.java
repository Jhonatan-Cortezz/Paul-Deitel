
package Capituo12;

import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class suma {
    public static void main(String[] args) {
        //ontiene la netrada del usuario
        String primerNumero = JOptionPane.showInputDialog("introduzca el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("introduzca el segundo entero");
        
        //convertimos las entradas String a int
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        
        int suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "La suma es " + suma, "suma de enteros", 
                JOptionPane.PLAIN_MESSAGE);
    }
}
