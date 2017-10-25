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
public class Principal {
    public static void main(String[] args) {
        Carrera c = new Carrera();
        c.Establecer_Nombre("Informatica");
        c.Establecer_Modalidad("Distancia");
        System.out.println(c);
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.Obtener_Modalidad());
        
        Carrera c3 = new Carrera ("Semipresencial","Informatica");
        System.out.println(c3.Obtener_Modalidad());
        c3.Establecer_Modalidad("Distancia");
        System.out.println(c3.Obtener_Modalidad());
        c3.Establecer_Modalidad(c3.Obtener_Modalidad().toUpperCase());
        System.out.println(c3.Obtener_Modalidad());
    }
    
}
