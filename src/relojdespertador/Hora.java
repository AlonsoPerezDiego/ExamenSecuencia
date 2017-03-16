/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

/**
 *
 * @author Diego
 */
public class Hora {
    
    private static int hr, min;
    
    /**
     * Se usa para modificar el valor de la hora.
     * @param newHR
     * @param newMin 
     */
    public static void NuevaHora(int newHR, int newMin){
        hr = newHR;
        min = newMin;
        Display.mostrarHora(hr,min);
    }
    
    /**
     * Devuelve el valor de los minutos.
     * @return 
     */
    public static int getMin(){
        return min;
    }
    /**
     * Devuelve el valor de la hora.
     * @return 
     */
    public static int getHora() {
        return hr;
    }
}
