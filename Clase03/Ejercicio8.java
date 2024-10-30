package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * 
 * Crea un programa que calcule el área y 
 * el perímetro de un rectángulo. Solicita al usuario la longitud y el ancho del rectángulo.
 */

public class Ejercicio8 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del rectángulo: ");
        var longitud = scanner.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo: ");
        var ancho = scanner.nextDouble();

        var area = longitud * ancho;
        var perimetro = 2 * (longitud + ancho);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        scanner.close();

    }
}
