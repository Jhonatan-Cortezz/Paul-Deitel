
package Capitulo15;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaJFileChooser {
    public static void main(String[] args)throws IOException{
        DemoJFieldChoser aplicacion = new DemoJFieldChoser();
        aplicacion.setSize(400, 400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
}
