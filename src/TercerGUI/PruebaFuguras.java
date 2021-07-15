
package TercerGUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaFuguras {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos\n" +
                                                     "Escriba 2 para dibujar Ovalos");
        
        int opcion = Integer.parseInt(entrada);
        
        FigurasOvalos panel = new FigurasOvalos(opcion);
        
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    }
}
