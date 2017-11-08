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
public class Asignatura_Presencial extends Asignatura {
    private int numero_horas;
    
    public Asignatura_Presencial(String n,String t,double cos,int horas){
        super(n,t,cos);
        setNumero_horas(horas);
}

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public int getNumero_horas() {
        return numero_horas;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Asignatura Presencial: %s\n"
                + "\t\t\t%s\n\t\t\t$%.2f\n\t\t\tNumero Horas: %d", getNombre(),getTipo(),getCosto(),getNumero_horas());
        return cadena;
    }
    
    
}
