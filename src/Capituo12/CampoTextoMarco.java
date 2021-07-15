
package Capituo12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class CampoTextoMarco extends JFrame{
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;
    
    public CampoTextoMarco(){
        super("Prueba de JtextField y JpasswordField");
        setLayout(new FlowLayout());
        
        //construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1);
        
        campoTexto2 = new JTextField("Escriba el texto aqui");//con texto predeterminado
        add(campoTexto2);
        
        //construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de Texto no editable", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);
        
        //contruye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia);
        
        //registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
        
    }
    //clase interna privada para el manejador de eventos
    private class ManejadorCampoTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String cadena = "";

            //el usuario oprimio intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1) {
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());
                
            } else if(evento.getSource() == campoTexto2) {//el usuario oprimio intro en el objeto JTextField campoTexto2
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());     
                
            } else if(evento.getSource() == campoTexto3){
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());
                
            } else if(evento.getSource() == campoContrasenia){
                cadena = String.format("campoContrasenia: %s", evento.getActionCommand());     
            }
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}

