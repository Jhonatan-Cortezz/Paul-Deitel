
package Capitulo13;

import java.awt.BorderLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColorChoser extends JFrame{
    private final JButton cambiarColorbuButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel coloreJPanel;
    
    //establece la GUI
    public ColorChoser(){
        super("Uso de JColorChooser");
        
        //crea un objeto JPanel para mostrar color
        coloreJPanel = new JPanel();
        coloreJPanel.setBackground(color);
        
        //establece cambiarColorJButton y registra su manejador de eventos
        cambiarColorbuButton = new JButton("Cambiar color");
        cambiarColorbuButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(ColorChoser.this, "Seleccione un color", color);
                if (color == null) {
                    color = Color.LIGHT_GRAY;
                }
                coloreJPanel.setBackground(color);
            }
        }
        );
        add(coloreJPanel, BorderLayout.CENTER);
        add(cambiarColorbuButton, BorderLayout.SOUTH);
        
        setSize(400, 130);
        setVisible(true);
        
    }
}
