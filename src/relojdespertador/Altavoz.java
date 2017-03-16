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
public class Altavoz {
    private static int parar=0;
    /**
     * Hace sonar la alarma
     */
    public static void ActivarSonido(){
        while(parar==0);
        JOptionPane.showInputDialog("Ring Ring");
        PararAlarma();
    }
    /**
     * para la alarma
     */
    public static void PararAlarma(){
        parar = Integer.parseInt(JOptionPane.showInputDialog("0:seguir\n1:parar"));
    }
}
