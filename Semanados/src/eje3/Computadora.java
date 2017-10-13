/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;


/**
 *
 * @author Juan Ramón
 */
public class Computadora {
    
    private double velocidad_procesador;
    
    public void establecer_velopro(double velo) {
        if (velo > 5) {
            velocidad_procesador = 5;
        }else{
            velocidad_procesador = velo;
        }
        
      
                
    }
    public double obtener_velopro (){
        
        return velocidad_procesador;
    }
    @Override
    public String toString(){
        String cadena = String.format("Computador con\nvelocidad: %.1f", obtener_velopro());
        //String cadena2 = String.format("Computador con\nvelocidad%f", velocidad_procesador);
        return cadena;
    }
    
}
 