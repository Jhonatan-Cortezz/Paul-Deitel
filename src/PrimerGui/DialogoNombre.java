
package PrimerGui;

import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class DialogoNombre {
    public static void main(String[] args) {
        //pedir el nombre
        String nombre = JOptionPane.showInputDialog("Cual es su nombre");
        
        //mensaje 
        String Mensaje = String.format("Bienvenido, %s, a la programacion en java!", nombre);
        
        JOptionPane.showMessageDialog(null, Mensaje);
                
    }
}
