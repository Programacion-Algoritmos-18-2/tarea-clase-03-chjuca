/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                                // Metodo main
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);                       // Se instancia el objeto Estudiante y se envian parametros
        System.out.println(e);                                                              // presenta el ojeto e
        
        Docente d = new Docente("Luis", "Alvarez", 33, 1000); // falta implementar          // Se instancia el objeto Docente y se envian paramero
        System.out.println(d);
        
        Policia p = new Policia("ALEX", "MENDOZA", 33, "Cabo"); // falta implementar        // Se instancia el objeto Policia y se envia parametros
        System.out.println(p);
        
    }
    
}
