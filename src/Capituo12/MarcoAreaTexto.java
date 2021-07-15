
package Capituo12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MarcoAreaTexto extends JFrame{
    private final JTextArea areaTexto1;
    private final JTextArea areaTexto2;
    private final JButton botonCopiar;
    
    public MarcoAreaTexto(){
        super("Demostracion Area de texto");
        Box cuadro = Box.createHorizontalBox();
        String demo = "Esta es una cadena de\nDemostracion para\n" + "ilustrar como copiar texto\nde un area de texto a\n" +
                "otra, usando \nevento externo\n";
        
        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1));
        
        botonCopiar = new JButton("Copiar >>>");
        cuadro.add(botonCopiar);
        botonCopiar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto2.setText(areaTexto1.getSelectedText());
            }
        }
        );
        
        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2));
        
        add(cuadro);
    }
}
