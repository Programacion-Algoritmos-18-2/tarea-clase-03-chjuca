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
public class Estudiante extends Persona{                                        // Se crea el objeto Estudiante que recibe caracteristicas del objeto persona
    private double matricula;                                                   // se crea caracteristicas propias del objeto Estudiante
    
    public Estudiante(String n, String a, int e, double mat){                   // Constructor del Objeto Estudiante
        super(n, a, e);                                                         // Se recibe como herencia caracteristicas del objeto Persona
        setMatricula(mat);                                                      // Se llama a la funcion setMatricula
    }
    
    @Override
    public void setNombre(String n){                                            // Esta funcion da el valor de n a la caracteristica nombre y la convierte en mayuscula
        nombre = n.toUpperCase();    
    }
    
    public void setMatricula(double mat){                                       // Esta funcion da el valor de mat a la caracteristica matricula
        matricula = mat;
    }
    
    public double getMatricula(){                                               // Funcion devuelve matricula
        return matricula;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override
    public String toString(){                                                   // Se reescribe el metodo toString de la clase Persona
    
        return String.format("%s - %.2f", super.toString(), getMatricula());
    }
}
