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
public class Asignatura_Distancia extends Asignatura{
    private int numero_creditos;
    
    public Asignatura_Distancia(String n,String t,double c, int nc){
        super(n,t,c);
        setNumero_creditos(nc);
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    @Override
    public String toString() {
        String cadena = String.format("Asignatura Distancia: %s\n"
                + "\t\t\t%s\n\t\t\t$%.2f\n\t\t\tNumero Creditos: %d", getNombre(),getTipo(),getCosto(),getNumero_creditos());
        return cadena;
    }
    
    
    
}
