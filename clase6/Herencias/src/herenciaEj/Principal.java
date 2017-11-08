/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEj;

/**
 *
 * @author Juan Ramón
 */
public class Principal {
    public static void main(String[] args) {
        Asignatura_Presencial a1 = new Asignatura_Presencial("Programacion","Comun",100,180);
        Asignatura_Distancia d1 = new Asignatura_Distancia("Literatura","Troncal",300,6);
        
        System.out.println(a1);
        System.out.println(d1);
    }
    
}
