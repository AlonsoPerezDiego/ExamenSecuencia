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
public class RelojDespertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select;
        do{
            select = Integer.parseInt(JOptionPane.showInputDialog("1:SetHora\n2:setAlarma\n3encenderAlarma"));
            switch(select){
                case 1: Modo.SetHR();
                        break;
                case 2: Modo.SetAlarma();
                        break;
                case 3: Alarma.AlarmaOnOff();
                        break;
           }
        }while(select>3);
    }
    
}
