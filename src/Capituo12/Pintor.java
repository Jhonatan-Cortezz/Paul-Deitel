
package Capituo12;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Pintor {
    public static void main(String[] args) {
        JFrame aplicacion = new JFrame("Un programa simple de dibujo");
        
        PanelDibujo panel = new PanelDibujo();
        aplicacion.add(panel, BorderLayout.CENTER);
        
        aplicacion.add(new JLabel("Arrastre el raton para dibujar"), BorderLayout.SOUTH);
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(500, 250);
        aplicacion.setVisible(true);
    }
}
