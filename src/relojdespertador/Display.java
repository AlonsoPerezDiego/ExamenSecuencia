/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Display {
    
    /**
     * Muestra la hora.
     * @param hr
     * @param min 
     */
    public static void mostrarHora(int hr, int min){
        JOptionPane.showMessageDialog(null, hr + ":" + min);
    }
    /**
     * Muestra la alarma.
     * @param hr
     * @param min 
     */
    public static void mostrarAlarma(int hr, int min){
        JOptionPane.showMessageDialog(null, hr + ":" + min);
    }
}
