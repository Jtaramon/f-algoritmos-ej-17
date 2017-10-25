/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Juan Ramón
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    
    
   
    public Carrera(String n, String md){
        modalidad = n;
        nombre = md;
    }
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecer_modalidad(String n){
        modalidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Carrera: %s\n\tModalidad: %s\n",
                obtener_nombre(),obtener_modalidad());
        return cadena;
    }

}
    

