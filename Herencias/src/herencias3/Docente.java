/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Carlos Juca
 */
public class Docente extends Persona{
    private double sueldo;
    
    public Docente(String n, String a,  int e,double s){
        super(n,a,e);
        setSueldo(s);
    }
    
    public void setSueldo(double s){
        sueldo = s;   
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
