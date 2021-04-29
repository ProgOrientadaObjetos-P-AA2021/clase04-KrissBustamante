/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        Scanner leer = new Scanner(System.in);
        String nombre;
        String ciudad;
        int numeroDoctores;
        int numeroEnfermeros;

        System.out.println("Ingrese el nombre del hospital");
        nombre = leer.nextLine();
        System.out.println("Ingrese la ciudad donde se encuentra");
        ciudad = leer.nextLine();
        System.out.println("Ingrese el Numero de Doctores");
        numeroDoctores = leer.nextInt();
        System.out.println("Ingrese el Numero de Enfermos");
        numeroEnfermeros = leer.nextInt();

        Hospital h2 = new Hospital(nombre, ciudad, numeroDoctores,
                numeroEnfermeros);

        System.out.printf("Hospital:%s\n Ciudad: %s\n "
                + "Numero de Doctores:%d\n Numero de Enfermos:%d",
                h2.obtenerNombre(),
                h2.obtenerCiudad(),
                h2.obtenerNumeroDoctores(),
                h2.obtenerNumeroEnfermeros());
    }
}
