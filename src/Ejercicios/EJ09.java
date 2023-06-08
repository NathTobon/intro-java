package Ejercicios;
import java.util.Scanner;
public class EJ09 {
    public static void main(String[] args) {
    // EJERCICIO 9
    // Validar si la primera letra de una frase o palabra es "A". Si lo es, decir CORRECTO, sino, decir INCORRECTO.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String sentence = read.nextLine();
        read.close();
        if (sentence.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
