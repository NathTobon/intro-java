package Ejercicios;
import java.util.Scanner;
public class Ej08 {
    public static void main(String[] args) {
        // EJERCICIO 8
        // Porgrama que permita introducir solo frases o palabras de 8 de largo.
        // Si se cumple la entrada, decir "CORRECTO", sino, imprimir "INCORRECTO"
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de longitud 8");
        String sentence = read.nextLine();
        read.close();
        if (sentence.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
