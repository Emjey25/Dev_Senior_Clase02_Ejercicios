package Clase03_Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("ingrese el numero 1");
        var num1 = sc.nextInt();

        System.out.println("ingrese el numero 2");
        var num2 = sc.nextInt();

        System.out.println("ingrese el numero 3");
        var num3 = sc.nextInt();

        var resultGeneral = (num1 + num2 + num3) / 3;

        System.out.println("El promedio de los numeros ingresados es: " + resultGeneral);

        sc.close();

    }

}
