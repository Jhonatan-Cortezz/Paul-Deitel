
package Capituo12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MarcoBorderLayout extends JFrame implements ActionListener{
    
    private final JButton botones[];
    private static final String nombres[] = {"Ocultar Norte", "Ocultar sur", "Ocultar Este",
        "Ocultar Oeste", "Ocultar Centro"
    };
    private final BorderLayout esquema;
    
    public MarcoBorderLayout(){
        super("Demostracion de Border Layout");
        esquema = new BorderLayout(5, 5);//espacios de 5 pixeles
        setLayout(esquema);
        botones = new JButton[nombres.length];
        
        //crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }

    //maneja los eventos de boton
    @Override
    public void actionPerformed(ActionEvent e) {
        //comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        for(JButton boton: botones){
            if (e.getSource() == boton) {
                boton.setVisible(false);
            } else {
                boton.setVisible(true);
            }
            esquema.layoutContainer(getContentPane());
        }
    }
    
}
