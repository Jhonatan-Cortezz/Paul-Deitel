
package Capitulo13;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelColor extends JPanel{
    //dibuja rectangulos y objetos String en distintos colores
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        //establece nuevo color de dibujo usando valores enteros
        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("RGB actual: "+ g.getColor(), 130, 40);
        
        //establece nuevo color de dibujo usando valores de punto flotante
        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("RGB actual: " + g.getColor(), 130, 65);
        //kdhbf
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("RGB actual: " + g.getColor(), 130, 90);
        
        //muestra los valores RGB individuales
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
        g.drawString("Valores RGB" + color.getRed() + ", " + 
                color.getGreen() + ", " + color.getBlue(), 130, 115);
    }
}
