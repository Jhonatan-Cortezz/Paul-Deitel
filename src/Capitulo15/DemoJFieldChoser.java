
package Capitulo15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DemoJFieldChoser extends JFrame{
    private final JTextArea areaSalida;
    
    public DemoJFieldChoser()throws IOException{
        super("Demo de JFieldChoser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida));
        
        analizarRuta();
    }
    
    public void analizarRuta()throws IOException{
        Path ruta = obtenerRuraArchivoDirectorio();
        
        if (ruta != null && Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", ruta.getFileName()));
            builder.append(String.format("%s un directorio%n", Files.isDirectory(ruta) ? " Es" : " no es"));
            builder.append(String.format("%s una ruta absoluta%n", ruta.isAbsolute() ? " Es" : " no es"));
            builder.append(String.format("Ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)));
            builder.append(String.format("Tamaño: %s%n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s%n", ruta));
            builder.append(String.format("Ruta Absoluta: %s%n", ruta.toAbsolutePath()));
            
            //muestra en pantalla el listado del directorio
            if (Files.isDirectory(ruta)) {
                builder.append(String.format("%nContenido del directorio:%n"));
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);
                
                for(Path p : flujoDirectorio){
                    builder.append(String.format("%s%n", p));
                }
            }
            
            areaSalida.setText(builder.toString());
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName()+ " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Path obtenerRuraArchivoDirectorio(){
        JFileChooser selectorDeArchivos = new JFileChooser();
        selectorDeArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorDeArchivos.showOpenDialog(this);
        
        //si damos click en cancelar
        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }
        return selectorDeArchivos.getSelectedFile().toPath();
    }
}
