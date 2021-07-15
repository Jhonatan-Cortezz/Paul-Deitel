
package Capituo12;

import javax.swing.JFrame;

public class DemoPanel extends JFrame{
    public static void main(String[] args) {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(500, 250);
        marcoPanel.setVisible(true);
    }
}
