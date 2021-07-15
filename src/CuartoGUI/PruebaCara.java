
package CuartoGUI;

import javax.swing.JFrame;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaCara {
    public static void main(String[] args) {
        DibujarCara panel = new DibujarCara();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(230, 250);
        aplicacion.setVisible(true);
    }
}
