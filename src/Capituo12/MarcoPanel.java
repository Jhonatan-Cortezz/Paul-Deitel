
package Capituo12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoPanel extends JFrame{
    private final JPanel panelBotones;
    private final JButton[] botones;
    
    public MarcoPanel(){
        super("Demostracion Panel");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));
        
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]);
        }
        
        add(panelBotones, BorderLayout.SOUTH);
    }
}
