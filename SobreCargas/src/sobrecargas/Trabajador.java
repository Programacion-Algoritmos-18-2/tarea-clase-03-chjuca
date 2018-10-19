/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargas;

/**
 *
 * @author reroes
 */
public class Trabajador {                                                       // Creamos un Objeto Trabajado con 3 caracteristicas
    private String nombres;                                                     // Caracteristica Nombre de tipo cadena
    private double sueldo_mensual;                                              // Caracteristica sueldo_mensual de tipo double
    private String apellidos;                                                   // Caracteristica apellido de tipo cadena
    
    public void agregar_nombres(String n){                                      // Funcion agregar_nombre (recibe un parametro)
        nombres = n;                                                            // caracteristica nombre= a el parametro
    }
    
    public void agregar_nombres(String n1, String n2){                          // Funcion agregar_nombre (recibe 2 parametro)
        nombres = String.format("%s-%s", n1, n2);                               // caracteristica nombre= String de los parametros enviados
    }
    
    
    public void agregar_sueldo(double sueldo){                                  // Funcion agregar_sueldo (recibe 1 parametro)
        sueldo_mensual = sueldo;                                                // caracteristica sueldo_mensual=a el parametro
    }
    public void agregar_sueldo(double[] sueldo){                                // Funcion agregar_sueldo (recibe 1 parametro tipo arreglo)
        for (int i = 0; i < sueldo.length; i++) {                               // For que recorrela el arreglo AAnterior
            sueldo_mensual=sueldo_mensual +sueldo[i];                           // Se suma todos los elementos del arreglo
        }
    }
    public void agregar_sueldo(double s1,double s2,double s3,double s4){        // Funcion agregar_sueldo (recibe 4 parametros)
        sueldo_mensual=s1+s2+s3+s4;                                             // Caracteristica sueldo_ensual = a la suma de los parametrs enviados
    }
    
        
    public void agregar_apellidos(String n){                                    // Funcion agregar_apellidos(recibe 1 parametro)
        apellidos = n;                                                          // Caracteristica apellido = al parametro
    }
    
    public String obtener_nombres(){                                            // Funcion para obtner la caracteristica nombre
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;                                                       // Funcion para obtener lacaracteristica apellido
    }
    
    public double obtener_sueldo_mensual(){                                     // Funcion para obtener el sueldo_mensual
        return sueldo_mensual;
    }
    
    public String presentar_datos(){                                            // Funcion para presentar datos
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}
