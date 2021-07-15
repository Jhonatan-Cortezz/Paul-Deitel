
package PrimerGui;

import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EjercicioGui {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Introduzaca el numero 1");

        int n1 = Integer.parseInt(numero1);
        String numero2 = JOptionPane.showInputDialog("Escriba el segundo numero");
        int n2 = Integer.parseInt(numero2);

        int suma = n1 + n2;
        String mensaje = String.format("La suma de, %s, mas %s es %s", n1, n2,  suma);
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
}
