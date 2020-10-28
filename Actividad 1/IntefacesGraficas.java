/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces.graficas;

import intefaces.graficas.grafics.graficstemplate;

import javax.swing.SwingUtilities;

/**
 *
 * @author Emanuel P
 */
public class IntefacesGraficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
            graficstemplate principal = new graficstemplate();
            }
        };
       
        
     SwingUtilities.invokeLater(runApplication);
    }
    
}
