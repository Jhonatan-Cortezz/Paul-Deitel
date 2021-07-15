
package Capituo12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MarcoGridLayout extends JFrame implements ActionListener{
    
    private final JButton[] botones;
    private static final String[] nombres = {
            "uno", "dos", "tres", "cuatro", "cinco", "seis"
        };
    private boolean alternar = true;//alterna entre dos esquemas
    private Container contenedor;
    private GridLayout cuadricula1;
    private GridLayout cuadricula2;
    
    public MarcoGridLayout(){
        super("Demostracion GridLayout");
        cuadricula1 = new GridLayout(2, 3, 5, 5);
        cuadricula2 = new GridLayout(3, 2);
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];
        
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta]= new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);//registra componente de escucha
            add(botones[cuenta]);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (alternar) {
            contenedor.setLayout(cuadricula2);
        } else {
            contenedor.setLayout(cuadricula1);
        }
        
        alternar = !alternar;
        contenedor.validate();//redistribuye el contenedor
    }
    
}
