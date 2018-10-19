/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargas;

import java.util.Scanner;           // Importamos el Scanner

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {                                    // Inicio del Main

        Scanner scanner = new Scanner(System.in);                               // Inicializamos un Objeto Scanner
        Trabajador t = new Trabajador();                                        // Asociamos la vaiable t con el Objeto Trabajador

        System.out.println("Número de nombres del trabajador 1 o 2");           // Presentamos un Objeto en pantalla
        int numero_nombres = scanner.nextInt();                                 // Al variable numero_nombre almacena lo leido en teclado
        scanner.nextLine();                                                     // Limpiamos el Scanne

        if (numero_nombres == 1) {                                              // If para determinar si se ingresara 1 nombre o 2
            System.out.println("Ingrese el nombre del trabajador");             // Presenta un mensaje en Pantalla
            String nombre = scanner.nextLine();                                 // La variabale nombre Lee de Teclado
            t.agregar_nombres(nombre);                                          // Llamamos a la funcion agregar nombre de la clase trabajador
        } else {                                                                // Sino
            System.out.println("Ingrese el nombre uno del trabajador");         // Presentamos un mensaje en pantalla
            String nombre1 = scanner.nextLine();                                // Leemos nombre1
            System.out.println("Ingrese el nombre dos del trabajador");         // Presentamos un mensaje en pantalla
            String nombre2 = scanner.nextLine();                                // Leemos nombre2
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");               // Presenta un Mensaje
        String apellidos = scanner.nextLine();                                  // leemos la variable apellidos
        t.agregar_apellidos(apellidos);                                         // Llamos a la funcion agregar_apellidos

        System.out.println("Suedo Mensual/Semanal (1/2): ");                    // Presentamos un mensaje en Pantalla
        int opt = scanner.nextInt();                                            // Leemos la variable opt de teclado
        if (opt == 1) {                                                         // Pregunta para determinar si opt es = a 1
            System.out.println("Ingrese el sueldo del trabajador");             // Presenta un Mensaje
            double sueldo = scanner.nextDouble();                               // Leemos la variable Sueldo de teclado
            t.agregar_sueldo(sueldo);                                           // Llamamos a la variable agregar_sueldo de teclado
        } else {                                                                // Sino
            System.out.println("Ingresar por Arreglo/Variables (1/2)");         // Prentamos un Mnesaj en Pantalla
            opt = scanner.nextInt();                                            // Leemos la variable opt de teclado
            if (opt == 1) {                                                     // Si opt == 1
                double[] sueldo = new double[4];                                // creamos un arriglo sueldo de tipo double con 4 elementos
                for (int i = 0; i < sueldo.length; i++) {                       // For que recorrera el arreglo creado
                    System.out.printf("Ingrese el Sueldo Semana #%d del trabajador: ", i + 1);          //Presentamos un mensaje en pantalla
                    sueldo[i] = scanner.nextDouble();                           // Leemos la el elemento en la posicion i de teclado
                }
                t.agregar_sueldo(sueldo);                                       // Llamamos a la funcion agregar_sueldo

            } else {                                                                        //Sino

                System.out.printf("Ingrese el sueldo Semana #1 del trabajador: ");          //Presenta un mensaje en Pantalla
                double s1 = scanner.nextDouble();                                           // Leemos una variable
                System.out.printf("Ingrese el sueldo Semana #2 del trabajador: ");
                double s2 = scanner.nextDouble();
                System.out.printf("Ingrese el sueldo Semana #3 del trabajador: ");
                double s3 = scanner.nextDouble();
                System.out.printf("Ingrese el sueldo Semana #4 del trabajador: ");
                double s4 = scanner.nextDouble();
                t.agregar_sueldo(s1, s2, s3, s4);                                           // Llamamos a la funcion agregar_sueldo
            }
        }

        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());       // Presentamos los Datos

    }
}
