package Ejercicios;

import java.util.Scanner;

public class Ej12 {
    // EJERCICIO 12
    // Simulador de dispositivo RS232, que lee cadenas enviadas por el usuario.
    // Las cadenas correctas son: maximo 5 caracteres de largo, primer caracter "X"
    // y {ultimo "O"}. Las cadenas distintas son incorrectas.
    // Se marca el final de los envíos de secuencias con: "&&&&&" (5)
    // Al final, se imprime un informe con la cantidad de lecturas correctas e
    // incorrectas recibidas.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = "";
        String finalInput = "&&&&&";
        int inputCorrect = 0;
        int inputIncorrect = 0;

        while (!input.equals(finalInput)) {
            System.out.println("Ingrese cadena");
            input = read.next();

            if (input.equals(finalInput)) {
                break;
            } else if (input.length() == 5 && input.substring(0, 1).equals("X") && input.substring(4, 5).equals("O")) {
                inputCorrect++;
            } else {
                inputIncorrect++;
            }
        }
        read.close();
        System.out.println("INFORME");
        System.out.println("Entradas correctas: " + inputCorrect);
        System.out.println("Entradas incorrectas: " + inputIncorrect);
        System.exit(0);
    }
}
