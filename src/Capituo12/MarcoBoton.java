
package Capituo12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame{
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;
    
    public MarcoBoton(){
        super("Prueba de Botones");
        setLayout(new FlowLayout());
        
        botonJButtonSimple = new JButton("Boton Simple");
        add(botonJButtonSimple);
        
        Icon insecto1 = new ImageIcon("img/crv.jpg");
        Icon insecto2 = new ImageIcon("img/crv.jpg");
        botonJButtonElegante = new JButton("Boton elegante", insecto1);
        botonJButtonElegante.setRolloverIcon(insecto2);//para cambiar la imagen al poner el mouse sobre el boton
        
        add(botonJButtonElegante);
        
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    
    
    private class ManejadorBoton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this, 
                    String.format("Usted oprimio: %s", evento.getActionCommand()));
        }
    }
}
