
package QuintoGUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class DibujoArcoIris extends JPanel{
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    private Color[] colore = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE,
                              Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public DibujoArcoIris(){
        setBackground(Color.WHITE);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int radio = 20;
        
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;
        for (int i = colore.length; i > 0; i--) {
            g.setColor(colore[i - 1]);
            
            g.fillArc(centroX - i * radio,
                    centroY - i * radio,
                    i * radio * 2,i * radio * 2,0, 180);
                    
                    
        }
        
    }
}
