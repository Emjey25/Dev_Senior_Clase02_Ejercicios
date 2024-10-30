package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * Carmen ha ido al cine y ha gastado una cantidad de dinero. 
 * Antes de salir de casa tenía 23€ y cuando ha vuelto le quedaban 12,75€. 
 * ¿Cuánto dinero ha gastado en el cine?
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.println("Carmen introduce tu monto de Dinero antes de salir al cine:");
        var dineroCarmen = entrada.nextDouble();

        System.out.println("Carmen introduce el monto de dinero que te quedo:");
        var dineroRestante = entrada.nextDouble();

        var resultado = dineroCarmen - dineroRestante;

        System.out.println("Carmen gastó en el cine: " + resultado + " Euros ");

        entrada.close();
    }

}
