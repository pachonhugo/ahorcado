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
        opciones[0]="tablero";
        opciones[0]="scanner";
        opciones[0]="parcial";
        opciones[0]="visible";
    
    }
    
    public String seleccionarpalabra(){
        
        numero=(int) (Math.random()*7+1);
        palabrajugar=opciones[numero];
        return (palabrajugar);
    }
    
    public void tomartalabra(){
 
    
        
        cadena = palabrajugar.toCharArray();
    }

}

