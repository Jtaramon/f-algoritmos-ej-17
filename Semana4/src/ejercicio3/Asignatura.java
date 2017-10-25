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
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public Asignatura(Carrera a){
    nombre = "Informatica";
    creditos = 5;
    carrera = a;
}
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    public void establecer_creditos(int n){
        creditos = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
    public void establecer_carrera(Carrera c){
        carrera = c;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }

    @Override
    public String toString() {
        String cadena = String.format("Asignatura\n\tNombre: %s\n"
                + "\tCreditos: %d\n"
                + "\t%s",obtener_nombre(),obtener_creditos(),obtener_carrera());
        return cadena;
    }
    
    
    
    
    
    
}
