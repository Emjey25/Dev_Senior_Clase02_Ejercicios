package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que solicite al usuario dos números y luego realice las operaciones de 
 * suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola.
 */

public class Ejercicio7 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer  número entero: ");
        var numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        var numero2 = entrada.nextInt();

        var result = numero1 + numero2;
        var result2 = numero1 - numero2;
        var result3 = numero1 * numero2;
        var result4 = numero1 / numero2;

        System.out.println("La suma de los números es: " + result);
        System.out.println("La resta de los números es: " + result2);
        System.out.println("La multiplicación de los números es: " + result3);
        System.out.println("La división de los números es: " + result4);

        entrada.close();

    }
}
