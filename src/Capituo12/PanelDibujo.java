
package Capituo12;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
    //lista de referencias poit
    private final ArrayList<Point> puntos = new ArrayList<>();
    public PanelDibujo(){
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent event){
                        puntos.add(event.getPoint());
                        repaint();
                    }
                }       
        );
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(Point punto : puntos){
            g.fillOval(punto.x, punto.y, 4, 4);
        }
    }
}
