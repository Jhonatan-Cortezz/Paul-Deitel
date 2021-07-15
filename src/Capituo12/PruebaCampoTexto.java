/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capituo12;

import javax.swing.JFrame;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaCampoTexto {
    public static void main(String[] args) {
        CampoTextoMarco campoTexto = new CampoTextoMarco();
        campoTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTexto.setSize(350, 100);
        campoTexto.setVisible(true);
    }
}
