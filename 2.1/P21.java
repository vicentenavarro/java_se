/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class P21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de las variables locales
        int entero1 = 0, entero2 = 0;
        float real = 0.f;
        String cadena1 = "", cadena2 = "";

        // Creación del objeto Scanner para leer de teclado
        Scanner teclado = new Scanner(System.in);

        // Sentencias para leer dos enteros un float y dos String
        System.out.print("Teclea un entero: ");
        entero1 = teclado.nextInt();
        System.out.print("Teclea otro entero: ");
        entero2 = teclado.nextInt();
        System.out.print("Teclea un float: ");
        real = teclado.nextFloat();
        teclado.nextLine(); // vaciar el buffer de teclado
        System.out.print("Teclea una cadena: ");
        cadena1 = teclado.nextLine();
        System.out.print("Teclea otra cadena: ");
        cadena2 = teclado.nextLine();

        System.out.println("entero1 + entero2 + real = "
                + (entero1 + entero2 + real));
        /*
		 * float suma = real + entero1 + entero2;
		 * System.out.println("entero1 + entero2 + real = "+suma);
         */
        System.out.println("entero mayor es = "
                + (entero1 > entero2 ? entero1 : entero2));
        /*
		 * int mayor = entero1 > entero2 ? entero1 : entero2
		 * System.out.println("entero mayor es = "+"+mayor);
         */
        System.out.println("real /(entero1 % entero2)= "
                + (real / (entero1 % entero2)));

        /*
		 * float division = real /(entero1 % entero2);
		 * System.out.println("real /(entero1 % entero2) = "+division);
         */
        System.out.println("cadena1 + cadena2 = " + cadena1 + cadena2);

        teclado.close();

    }

}
