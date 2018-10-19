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
public class Persona {                                                      // Se crea el Obejto Persona
    
    protected String nombre;                                                // Se crea la caracteristica nombre de tipo cadena
    private String apellido;                                                // Se crea la caracteristaca apellido de tipo cadena
    private int edad;                                                       // Se crea la cararcteristica edad de tipo entero
    
    public Persona(String n, String a,  int e){                             // Constructor del Objeto Persona
        setNombre(n);                                                       // Se llama a la funcion setNombre
        setApellido(a);                                                     // Se llama a la funcion setAoellido
        setEdad(e);                                                         // Se llama a la funcion setEdad
    }
    
    public void setNombre(String n){                                        // Esta funcion da el valor de n a la caracteristica nombre
        nombre = n;
    }
    
    public void setApellido(String n){                                      // Esta funcion da el valor de n a la caracteristica apellido
        apellido = n;
    }
    
    public void setEdad(int n){                                             // Esta funcion da el valor de n a la caracteristica edad
        edad = n;
    }
    
    public int getEdad(){                                                   // Funcion devuelve edad
        return edad;
    }
    
    public String getNombre(){                                              // Funcion devuelve nombre
        return nombre;
    }
    
    public String getApellido(){                                            // Funcion devuelve Apellido
        return apellido;
    }
    
    @Override
    public String toString(){                                               // Se reescribe el metodo toString del objeto
        return String.format("Nombre: %s - Apellido %s - Edad %d", 
                getNombre(), getApellido(), getEdad());
    }
    
    
}
