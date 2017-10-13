/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author Juan Ramón
 */
public class Computadora {

    private double velocidad_procesador;

    public void establecer_velopro(double velo) {
        
        velocidad_procesador = velo;
                
    }
    public double obtener_velopro (){
        
        return velocidad_procesador;
    }
}
