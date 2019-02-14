/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalla.naval;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author JuanCaCha
 */
public class PintarTableros extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(10, 240, 30, 30);
        g.drawRect(460, 240, 30, 30);
    }
}
