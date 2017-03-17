/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author estudiantes
 */
public class Palabras {
    
    int numero;
    String palabrajugar;
    String[] opciones= new String[5];
    char cadena [];
    
    public void llenararrego(){
        
        opciones[0]="negocio";
        opciones[1]="tablero";
        opciones[2]="scanner";
        opciones[3]="parcial";
        opciones[4]="visible";
    
    }
    
    public String seleccionarpalabra(){
        
        numero=(int) (Math.random()*4+1);
        palabrajugar=opciones[numero];
        return (palabrajugar);
    }
    
}