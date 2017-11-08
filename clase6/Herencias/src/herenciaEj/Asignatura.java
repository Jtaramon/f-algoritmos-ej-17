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
public class Asignatura {
    private String nombre;
    private String tipo; //("TRONCAL","COMUN")
    private double costo;
    
    public Asignatura (String n,String t,double cos){
        setNombre(n);
        setTipo(t);
        setCosto(cos);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
    
    
    
    
}
