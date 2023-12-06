/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

import javax.print.DocFlavor.STRING;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String posicion;
        int edad;
        double estatura;
        int jugador = 0;
        String mensajeF = "";

        System.out.println("Ingrese la cantidad de jugadores");
        jugador = entrada.nextInt();

        for (int i = 0; i < jugador; i++) {
              entrada.nextLine();
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador");
            estatura = entrada.nextDouble();

            mensajeF = String.format("%s%s-%s-,edad %d, estatura %.2f\n"
                    
                    ,mensajeF,
                    nombre,
                
                    posicion,
                    edad,
                    estatura);
           
        }

        System.out.printf("lista de jugadores\n%s",mensajeF);

    }
}
