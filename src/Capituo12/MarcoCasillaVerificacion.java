
package Capituo12;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class MarcoCasillaVerificacion extends JFrame{
    private JTextField campoTexto;
    private JCheckBox negritaJCheckbox;
    private JCheckBox cursivaJCheckBox;
    
    public MarcoCasillaVerificacion(){
        super("Prueba de JCheckBox");
        setLayout(new FlowLayout());
        
        //establece el tipo de letra
        campoTexto = new JTextField("Observe como cambia el estilo de tipo de letra", 27);
        campoTexto.setFont(new Font("serif", Font.PLAIN, 14));
        add(campoTexto);
        
        negritaJCheckbox = new JCheckBox("Negrita");
        cursivaJCheckBox = new JCheckBox("Cursiva");
        add(negritaJCheckbox);
        add(cursivaJCheckBox);
        
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckbox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
        
    }
    
    private class ManejadorCheckBox implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent evento){
            Font tipoLetra = null;
            
            //determina que checkBOx esta seleccinoado
            if (negritaJCheckbox.isSelected() && cursivaJCheckBox.isSelected()) {
                tipoLetra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if(negritaJCheckbox.isSelected()){
                tipoLetra = new Font("Serif", Font.BOLD, 14);
            } else if(cursivaJCheckBox.isSelected()){
                tipoLetra = new Font("Serif", Font.ITALIC, 14);
            } else {
                tipoLetra = new Font("Seirf", Font.PLAIN, 14);
            }
            
            campoTexto.setFont(tipoLetra);
        }
    }
}
