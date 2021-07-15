
package Capituo12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MarcoFlowLayout extends JFrame{
    private final JButton botonJbuttonIzquierda;
    private final JButton botonJbuttonDerecha;
    private final JButton botonJbuttonCentro;
    
    private final FlowLayout esquema;//objeto esquema
    private final Container contenedor; //contenedor para establecer esquema
    
    public MarcoFlowLayout(){
        super("Demostracion de FlowLayout");
        
        esquema = new FlowLayout();
        contenedor = getContentPane();//obtiene contenedor para esquema
        setLayout(esquema);
        
        botonJbuttonIzquierda = new JButton("Izquierda");
        add(botonJbuttonIzquierda);//agrega el boton al marco
        botonJbuttonIzquierda.addActionListener(
                new ActionListener(){
                    //procesa el evento de botonJbuttonIzquierda
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        esquema.setAlignment(FlowLayout.LEFT);
                        esquema.layoutContainer(contenedor);
                    }
                }
        );
        
        botonJbuttonCentro = new JButton("Centro");
        add(botonJbuttonCentro);//agrega el boton al marco
        botonJbuttonCentro.addActionListener(
                new ActionListener(){
                    //procesa el evento de botonJbuttonIzquierda
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        esquema.setAlignment(FlowLayout.CENTER);
                        esquema.layoutContainer(contenedor);
                    }
                }
        );
        
        botonJbuttonDerecha = new JButton("Derecha");
        add(botonJbuttonDerecha);//agrega el boton al marco
        botonJbuttonDerecha.addActionListener(
                new ActionListener(){
                    //procesa el evento de botonJbuttonIzquierda
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        esquema.setAlignment(FlowLayout.RIGHT);
                        esquema.layoutContainer(contenedor);
                    }
                }
        );
        
    }
            
}
