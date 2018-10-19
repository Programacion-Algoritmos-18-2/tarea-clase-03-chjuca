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
public class Policia extends Persona{                                           // Se crea el objeto Policia que recibe caracteristicas del objeto persona
    private String rango;                                                       // se crea caracteristicas propias del objeto Policia
    
    public Policia(String n, String a,  int e, String r){                       // Constructor del Objeto policia
        super(n,a,e);                                                           // Se recibe como herencia caracteristicas del objeto Persona
        setRango(r);                                                            // Se llama a la funcion setRango
    }
    public void setRango(String r){                                         
        rango = r;                                                              // Esta funcion da el valor de r a la caracteristica Rango
    }
    
    public String getRango(){                                                   // Funcion devuelve rango
        return rango;
    }
    
    @Override
    public String toString(){                                                   // Se reescribe el metodo toString de la clase Persona
        return String.format("%s - %s", super.toString(), getRango());
    }
}
    

