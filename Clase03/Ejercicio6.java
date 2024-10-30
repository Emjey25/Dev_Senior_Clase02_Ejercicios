package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * 
 * En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo. Por otro lado, 
 * las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes de septiembre.

Para aprovechar la temporada de rebajas he salido de compras. 
He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?
 * 
 * 
 */

public class Ejercicio6 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        /*
         * double precioDes = 34;
         * double Descuento = 15;
         */

        System.out.println("ingrese el precio con  descuento");
        int precio = scanner.nextInt();

        System.out.println("ingrese el descuento");
        int descuento = scanner.nextInt();

        double Result = precio / (1 - (descuento / 100.0));

        System.out.println("El precio original es: " + Result);

        scanner.close();

    }
}
