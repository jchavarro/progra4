/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalla.naval;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author JuanCaCha
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista ventana = new Vista();
        ventana.setVisible(true);
        JPanel panel = new JPanelMatriz();
        panel.setVisible(true);
        panel.setLocation(50, 50);
        panel.setSize(700, 700);
        ventana.add(panel);
        ventana.validate();
        ventana.repaint();
    }
    
}
