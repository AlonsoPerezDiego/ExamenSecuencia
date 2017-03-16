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
public class Modo {
    private static int hora, minut;
    /**
     * Llama a los metodos para cambiar valores.
     */
    public static void SetHR(){
        masHora();
        masMin();
        Hora.NuevaHora(hora, minut);
    }
    /**
     * Modifica la hora.
     */
    public static void masHora(){
        int cont;
        do{
            cont = Integer.parseInt(JOptionPane.showInputDialog("0: añadir h\n1: parar"));
            if(cont==0){
                if(hora==59){
                    hora=0;
                }else{
                    hora++;
                }
            }
        }while(cont==0);
    }
    /**
     * Modifica los minutos
     */
    public static void masMin(){
        int cont;
        do{
            cont = Integer.parseInt(JOptionPane.showInputDialog("0: añadir m\n1: parar"));
            if(cont==0){
                if(minut==59){
                    hora=0;
                }else{
                    minut++;
                }
            }
        }while(cont==0);
    }
    
    public static void SetAlarma(){
        masHora();
        masMin();
        Alarma.NuevaAlarma(hora, minut);
    }
}
