
package Capitulo13;

import javax.swing.JFrame;

public class MostrarColores {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Uso de colores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanelColor panelColor = new JPanelColor();
        frame.add(panelColor);
        frame.setSize(400, 180);
        frame.setVisible(true);
        
    }
}
