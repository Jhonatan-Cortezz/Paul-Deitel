
package SextoGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
/**
 *
 * @author JHONATAN CORTEZ
 */
public class PanelDibujo extends JPanel{
    private SecureRandom numerosAleatorios = new SecureRandom();
    private MiLinea[] lineas;
    
    //construcutor crea un panel con figuras al alzar
    public PanelDibujo(){
        setBackground(Color.WHITE);
        
        lineas = new MiLinea[5 + numerosAleatorios.nextInt(5)];
        //crea lineas
        for(int cuenta = 0; cuenta < lineas.length; cuenta++){
            int x1 = numerosAleatorios.nextInt(300);
            int y1 = numerosAleatorios.nextInt(300);
            int x2 = numerosAleatorios.nextInt(300);
            int y2 = numerosAleatorios.nextInt(300);
            
            Color color = new Color(numerosAleatorios.nextInt(256),
                                    numerosAleatorios.nextInt(256),
                                    numerosAleatorios.nextInt(256));
            
            lineas[cuenta] = new MiLinea(x1, y1, x2, y2, color);
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(MiLinea linea : lineas){
            linea.dibujar(g);
        }
    }
}
