/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

/**
 *
 * @author Juan Ramón
 */
public class Titulo {
    String nombre;
    String nombre_universidad;
    
    public void establecer_nombre (String n){
        nombre=n;
    }
    public String obtener_nombre (){
        return nombre;
    }
    
    public void establecer_nombre_universidad (String nu){
        nombre_universidad = nu;
    }
    public String obtener_nombre_universidad (){
        return nombre_universidad;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s",
                obtener_nombre(),obtener_nombre_universidad());
        return cadena;
    }
    
    
    
    
}
