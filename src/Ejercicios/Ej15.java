package Ejercicios;

public class Ej15 {
    public static void main(String[] args) {
        // EJERCICIO 15
        // Se rellena un vector con los 100 primeros numeros enteros, y se muestran por
        // pantalla en orden descendente.

        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(numeros[i]);
        }
    }
}
