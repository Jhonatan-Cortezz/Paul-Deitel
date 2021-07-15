

package SegundoGUI;
import java.awt.Graphics; 
import javax.swing.JPanel;
public class PanelDibujo extends JPanel {
    // dibuja una x desde las esquinas del panel   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth(); 
        int altura = getHeight(); 
        g.drawLine(0, 0, anchura, altura);
        g.drawLine(0, altura, anchura,0);
    }
}
