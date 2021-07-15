
package Capituo12;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MarcoCuadroCombinado extends JFrame{
    private final JComboBox<String> imagenesJComboBox;
    
    private final JLabel etiqueta;
    private static final String nombres[] = 
    {"img/est.jpg", "img/github.png", "img/php.jpg", "img/crv.jpg"};
    
    private final Icon[] iconos = {
        new ImageIcon(nombres[0]),
        new ImageIcon(nombres[1]),
        new ImageIcon(nombres[2]),
        new ImageIcon(nombres[3])
    };
    
    public MarcoCuadroCombinado(){
        super("Prueba de JComboBox");
        setLayout(new FlowLayout());
        
        imagenesJComboBox = new JComboBox<String>(nombres);
        imagenesJComboBox.setMaximumRowCount(3); //muestra tres filas
        
        imagenesJComboBox.addItemListener(
            new ItemListener() {//clase interna anonima
                
            //maneja evento de JComboBox
            @Override
            public void itemStateChanged(ItemEvent evento) {
                //determina si esta seleccionado el elemento
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                }
            }
        }
        
        );
        add(imagenesJComboBox);//agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]);//muestra el primer icono
        add(etiqueta);//agrega etiqueta a Jframe
    }
}
