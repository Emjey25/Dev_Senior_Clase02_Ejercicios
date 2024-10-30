package Clase03_Ejercicios;

/*
 * En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )"
 * utilizando las instrucciones necesarias.
 * 
 * ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
 * Explique por que la otra calculadora genera un resultado diferente.
 * 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int resultado = 6 / 2 * (1 + 2);
        System.out.println(resultado);
    }
}

// Para mi la acorde al resultado de la operacion es muy sujetivo
// ya que en este caso el computador o la laptop opera de izquierda a derecha y
// para el son los parentesis que se resuelven primero en este caso (1+2) , pero
// en la calculadora se resuelve primero la division y luego la suma, por lo que
// el resultado es diferente segun las leyes de jerarquia matematica por eso el
// resultado de las operaciones son distintos.
