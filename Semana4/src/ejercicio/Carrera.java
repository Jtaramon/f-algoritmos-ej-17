/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Juan Ramón
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    //Constructores
    public Carrera (){
        modalidad = "distancia";
    }
    public Carrera (String md){
        modalidad = md;
    }
    public Carrera (String md,String x){
        modalidad = md;
        nombre=x;
    }
    
    // Metodos

    public void Establecer_Modalidad(String mod) {
        modalidad = mod;
    }

    public String Obtener_Modalidad() {
        return modalidad;
    }

    public void Establecer_Nombre(String nb) {
        nombre = nb;
    }

    public String Obtener_Nombre() {
        return nombre;
    }
    
}
