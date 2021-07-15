
package Capituo12;

import javax.swing.JFrame;


public class RastreadorRaton {
    public static void main(String[] args) {
        MarcoRasteradorRaton marcoRasteradorRaton = new MarcoRasteradorRaton();
        marcoRasteradorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRasteradorRaton.setSize(300, 100);
        marcoRasteradorRaton.setVisible(true);
    }
}
