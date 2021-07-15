
package Capituo12;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener{
    private String linea1 = "";
    private String linea2 = "";
    private String linea3 = "";
    private JTextArea areaDeTexto;
    
    public MarcoDemoTeclas(){
        super("Demostreacion de los eventos de pulsacion de teclas");
        
        areaDeTexto = new JTextArea(10, 15);
        areaDeTexto.setText("Oprima cualquier tecla en el teclado");
        areaDeTexto.setEnabled(false);
        areaDeTexto.setDisabledTextColor(Color.BLACK);
        add(areaDeTexto);
        
        addKeyListener(this);//permite al marco procesar los eventos de teclas        
    }
    
    @Override
    public void keyPressed(KeyEvent evento){
        linea1 = String.format("Tecla oprimida: %s", KeyEvent.getKeyText(evento.getExtendedKeyCode()));
        establecerLineas2y3(evento);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        linea1 = String.format("Tecla oprimida: %s", e.getKeyChar());
        establecerLineas2y3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
       linea1 = String.format("Tecla liberada : %s",KeyEvent.getKeyText(e.getKeyCode()));
       establecerLineas2y3(e);
    }
    
    private void establecerLineas2y3(KeyEvent evento){
        linea2 = String.format("Esta tecla %s es una tecla de accion", (evento.isActionKey() ? "" : "no "));
        
        String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());
        
        linea3 = String.format("Teclas modificadoras oprimidas: %s", (temp.equals("") ? "ninguna" : temp));//oprime modificadoras
        areaDeTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3));
    }
    
}
