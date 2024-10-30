package Clase03_Ejercicios;

import java.util.Scanner;

/*
 * 
 * El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. 
 * Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, 
 * la tarjeta gráfica, la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

  Estás interesado en comprarte un nuevo PC y 
  en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. 
  Sin embargo, el vendedor te descuenta el 10% por pronto pago 
  ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?
 * 
 * 
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor del Pc que deseas comprar: ");
        var precio = scanner.nextDouble();

        System.out.println("Ingresa el porcentaje de descuento: ");
        var descuento = scanner.nextDouble();

        var precioFinal = precio - (precio * descuento / 100);

        System.out.println("El precio final del Pc es: " + precioFinal);

        scanner.close();

    }

}
