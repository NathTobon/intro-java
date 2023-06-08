package Ejercicios;
import java.util.Scanner;
public class Ej07 {
    public static void main(String[] args) {
        //EJERCICIO 7
        // Pedir una frase. Si la frase es igual a "eureka" el programa lo toma como Correcto, sino Incorrecto.
        System.out.println("Ingrese la frase");
        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();
        read.close();

        if (sentence.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
