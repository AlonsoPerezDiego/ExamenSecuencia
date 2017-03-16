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
public class Alarma {
    private static int hr, min;
    /**
     * Le da valores a la alarma.
     * @param newHR
     * @param newMin 
     */
    public static void NuevaAlarma(int newHR, int newMin){
        hr = newHR;
        min = newMin;
        Display.mostrarAlarma(hr,min);
    }
    /**
     * Enciende o apaga la alarma.
     */
    public static void AlarmaOnOff(){
        int onOff = Integer.parseInt(JOptionPane.showInputDialog("0: OFF\n1: ON"));
        if(onOff==1){
            
        }
    }
    
    public static void Encendido(){
        Altavoz.ActivarSonido();
    }
}
