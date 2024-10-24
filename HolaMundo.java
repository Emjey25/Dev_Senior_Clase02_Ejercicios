import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.print("Hola, ¿cual es tu nombre?");
        var nombre = entrada.nextLine();

        System.out.println(nombre + "\n bienvenido al mundo de la programacion!");

        entrada.close();
    }

}
