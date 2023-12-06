/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaFinal = " ";
        for (int i = 1; i <= 10; i++) {
            ;
            cadenaFinal = String.format("%s%d", cadenaFinal, i);
            //hacermos una cadena utilizando el valor de i en el momento de esa manera al pasar al sigiente for, 
            //estos no cambiaran y se seguira sumando en la cadena creada 
        }

        for (int i = 1; i < 11; i++) {
            cadenaFinal = String.format("%s%d", cadenaFinal, i);

        }
        System.out.printf("%s", cadenaFinal);

    }

}
