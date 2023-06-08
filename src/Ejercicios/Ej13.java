package Ejercicios;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        // Se declaran en inicializan las variables a utilizar.
        Scanner read = new Scanner(System.in);
        int squareSize = 0;
        String squareSide = "";
        String c = "*";

        System.out.println("Ingrese el tamaño del cuadrado");
        squareSize = read.nextInt();
        read.close();

        // Se realiza el primer lado horizontal.
        for (int i = 1; i <= squareSize; i++) {
            squareSide = squareSide.concat(c);
            squareSide = squareSide.concat(" ");
        }
        // Se imprime el lado superior.
        System.out.print(squareSide);

        // Se imprimen los lados verticales y los espacios en blanco del medio.
        for (int j = 1; j <= squareSize - 2; j++) {
            System.out.println();
            System.out.print(c); // Se imprime el valor correspondiente al lado vertical izquierdo.
            // Se realiza un ciclo para imprimir el relleno de espacios en blanco, un nuevo
            // ciclo para cada linea.
            for (int k = 1; k <= ((squareSize - 2) * 2); k++) {
                System.out.print(" ");
            }
            System.out.print(" " + c); // Se concatena el último dato, correspondiendo al lado vertical derecho.
        }
        // Se realiza un salto de página y se imprime el lado inferior.
        System.out.println();
        System.out.println(squareSide);
    }

}
