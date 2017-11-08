/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Juan Ramón
 */
public final class Profesor extends Persona {
    private double sueldo;
    
    
    public void setEdad(int e){
        if (e<30) {
            edad=30;
        }else{
            edad=e;
        }
    }
    
    public Profesor(){
        super ("Juan","Ramon",19);
    }
    
    public Profesor(double s){
        super("Juan","Ramon",19);
        setSueldo(s);
    }
    
    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        setSueldo(s);
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double s) {
        sueldo = s;
    }
    
}
