package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que convierta una temperatura 
 * dada en grados Celsius a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
 */

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        System.out.println("La temperatura en grados Kelvin es: " + kelvin);

        sc.close();
    }

}
