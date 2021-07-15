
package Capituo12;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRatom extends JFrame{
    private String detalles;
    private final JLabel barraEstado;
    
    public MarcoDetallesRatom(){
        super("Clics y botones del raton");
        
        barraEstado = new JLabel("Haga Clic en el raton");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton());
        
    }
    
    private class ManejadorClicRaton extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent event){
            int sPos = event.getX();
            int yPos = event.getY();
            
            detalles = String.format("Se hizo clicl %d vez(veces)", event.getClickCount());
            
            if (event.isMetaDown()) {//boton derecho del raton
                detalles += " con el boton derecho del raton";
            } else if(event.isAltDown()){
                detalles += "Con el boton central del raton";
            } else {
                detalles += "Con el boton izquierdo del raton";
            }
            barraEstado.setText(detalles);
        }
    }
}
