
package Capituo12;

import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class MarcoSeleccionMultiple extends JFrame{
    private final JList<String> listaJlistColores;//lista para guardar los nombres de los colores
    private final JList<String> listaJlistCopia;//lista en la que se van a copiar los nombres de los colores
    
    private JButton botonJButtonCopiar;//boton para copiar los nombres seleccionados
    private static final String[] nombresColores = {
        "Negro", "Azul", "Cyan", "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
        "Naranja", "Rosa", "Blanco", "Amarillo"
    };
    
    public MarcoSeleccionMultiple(){
        super("Lista de Seleccion Multiple");
        setLayout(new FlowLayout());
        
        listaJlistColores = new JList<String>(nombresColores);
        listaJlistColores.setVisibleRowCount(5);
        listaJlistColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJlistColores));
        
        botonJButtonCopiar = new JButton("Copiar >>>");
        
        //clase interna anonima
        botonJButtonCopiar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //coloca los valores seleccionados en listaJlistCopia
                listaJlistCopia.setListData(listaJlistColores.getSelectedValuesList().toArray(new String[0]));
            }
        }
        );
        
        add(botonJButtonCopiar);
        
        listaJlistCopia = new JList<String>();
        listaJlistCopia.setVisibleRowCount(5);
        listaJlistCopia.setFixedCellWidth(100);//establece la anchura
        listaJlistCopia.setFixedCellHeight(15);//establece la altura
        listaJlistCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJlistCopia));
    }
}
