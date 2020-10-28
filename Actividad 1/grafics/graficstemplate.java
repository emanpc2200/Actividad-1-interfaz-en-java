/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces.graficas.grafics;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Emanuel P
 */
public class graficstemplate extends JFrame {
    private JPanel pPanel;
    public  graficstemplate(){ //hola que hace
            super("Interfaz basica");
            
            pPanel = new JPanel();
            pPanel.setLocation(0,0);
            pPanel.setBackground(Color.BLUE);
            pPanel.setSize(1200, 700);
            this.add(pPanel);
            
            
            this.setSize(1200 , 700);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
    }
    
}
