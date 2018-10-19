/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        System.out.println("Suedo Mensual/Semanal (1/2): ");
        int opt = scanner.nextInt();
        if (opt == 1) {
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        } else {
            System.out.println("Ingresar or Arreglo/Variables (1/2)");
            opt = scanner.nextInt();
            if (opt == 1) {
                double[] sueldo = new double[4];
                for (int i = 0; i < sueldo.length; i++) {
                    System.out.printf("Ingrese el Sueldo Semana #%d del trabajador: ", i + 1);
                    sueldo[i] = scanner.nextDouble();
                }
                t.agregar_sueldo(sueldo);

            } else {

                System.out.printf("Ingrese el sueldo Semana #1 del trabajador: ");
                double s1 = scanner.nextDouble();
                System.out.printf("Ingrese el sueldo Semana #2 del trabajador: ");
                double s2 = scanner.nextDouble();
                System.out.printf("Ingrese el sueldo Semana #3 del trabajador: ");
                double s3 = scanner.nextDouble();
                System.out.printf("Ingrese el sueldo Semana #4 del trabajador: ");
                double s4 = scanner.nextDouble();
                t.agregar_sueldo(s1, s2, s3, s4);
            }
        }

        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());

    }
}
