
package Capitulo13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setFont(new Font("Serif", Font.BOLD, 12 ));
        g.drawString("Serif 12 puntos, negrita.", 20, 50);
        
        g.setFont(new Font("Monospaced", Font.ITALIC, 24 ));
        g.drawString("Monospaced 24 puntos, negrita.", 20, 70);
        
        g.setFont(new Font("SansSerif", Font.PLAIN, 14 ));
        g.drawString("SansSerif 14 puntos, negrita.", 20, 90);
        
        g.setColor(Color.red);
        g.setFont(new Font("serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + " puntos, negrita cursiva.", 20, 110);
    }
}
