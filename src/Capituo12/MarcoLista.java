
package Capituo12;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MarcoLista extends JFrame{
    private final JList<String> listaJListColores;
    private static final String[] nombreColores = {"Negro",
        "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Gris Claro", "Magneta",
        "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};
    private static final Color[] colores = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
        Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
        Color.RED, Color.WHITE, Color.YELLOW
    };
    
    //contructor
    public MarcoLista(){
        super("Prueba de JList");
        setLayout(new FlowLayout());
        
        //lista de nombre de colores
        listaJListColores = new JList<String>(nombreColores);
        //muestra 5 filas a la vez
        listaJListColores.setVisibleRowCount(5);
        
        //no permite selecciones multiples
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //agrega al marco un onjeto JScrollPane que contiene a JList
        add(new JScrollPane(listaJListColores));
        
        
        //Clase anonima para manejar el evento de seleccion de lista
        listaJListColores.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent evento){
                getContentPane().setBackground(colores[listaJListColores.getSelectedIndex()]);
            }
        });
    }  
}
