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
public class Docente extends Persona{                                           // Se crea el objeto DOcente que recibe caracteristicas del objeto persona
    private double sueldo;                                                      // Se crea caracteristicas propias del objeto Docente
    
    public Docente(String n, String a,  int e,double s){                        // Constructor del Objeto Docente
        super(n,a,e);                                                           // Se recibe como herencia caracteristicas del objeto Persona
        setSueldo(s);                                                           // Se llama a la funcion setSueldo
    }
    
    public void setSueldo(double s){                                            // Esta funcion da el valor de s a la caracteristica sueldo
        sueldo = s;                                                                 
    }
    
    public double getSueldo(){                                                  // Funcion devuelveSueldo
        return sueldo;
    }
    
    @Override
    public String toString(){                                                   // Se reescribe el metodo toString de la clase Persona
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
