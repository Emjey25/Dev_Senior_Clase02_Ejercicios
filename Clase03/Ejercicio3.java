package Clase03_Ejercicios;

import java.util.Scanner;

/*
 El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi y 
 Louisiana desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. 
 Debido a los altos niveles de nitrógeno y fósforo que traen estas aguas los peces mueren en grandes cantidades.
Para evitar que mueran cientos y cientos de peces, 
la ONG Salvemos los peces de colores ha decidido
 poner en cuarentena a 284 peces rojos y 163 peces azules en un gigantesco acuario, 
 para devolverlos al mar cuando estén curados. ¿Cuántos peces hay en total dentro del acuario?
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.println("escribe el numeor de peces rojos");
        var pecesRojos = entrada.nextInt();

        System.out.println("escribe el numeor de peces azules");
        var pecesAzules = entrada.nextInt();

        var resultado = pecesRojos + pecesAzules;

        System.out.println("El numero total de peces es: " + resultado + " Salvamos los peces.jpg");

        entrada.close();

    }

}
