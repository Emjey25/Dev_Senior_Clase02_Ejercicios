package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * 
 * En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen.
 * Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que 
 * el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?
 * 
 * En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
 * 
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.print("Escribe el precio de la porción de 100 gramos: ");
        var precioPorcion = entrada.nextDouble();

        var precioKilo = precioPorcion * 10;

        System.out.println("El precio por kilo es: " + precioKilo);

        entrada.close();

    }

}
