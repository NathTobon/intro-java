package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        // EJERCICIO 16
        // Se rellena un vector tamaño n con valores aleatorios.
        // Se le pide al usuario un número, para buscar en el vector.
        // El programa muestra la posición del número y si se encuentra repetido.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] numerosAleatorios = new int[n];
        fillArray(numerosAleatorios, n);
        System.out.println("Ingrese el número que desea buscar en el vector");
        int targetNum = read.nextInt();
        int timesFound = searchInArray(numerosAleatorios, n, targetNum);
        if (timesFound == 0) {
            System.out.println("El número ingresado no se encuentra en el vector.");
        } else {
            int[] targetPosition = new int[timesFound];
            searchPosition(numerosAleatorios, n, targetNum, targetPosition);
            if (timesFound == 1) {
                System.out.println("El número fue hallado " + timesFound + " vez dentro del vector. En la posición: "
                        + Arrays.toString(targetPosition));
            } else {
                System.out.println("El número fue hallado " + timesFound
                        + " veces dentro del vector. En las posiciones: " + Arrays.toString(targetPosition));
            }
        }
        read.close();
    }

    public static void fillArray(int[] numerosAleatorios, int n) {
        int randomNum;
        for (int i = 0; i < n; i++) {
            randomNum = (int) (Math.random() * 10 + 1);
            numerosAleatorios[i] = randomNum;
        }
    }

    public static int searchInArray(int[] array, int n, int target) {
        int timesFound = 0;
        for (int i = 0; i < n; i++) {
            if (target == array[i]) {
                timesFound++;
            }
        }
        return timesFound;
    }

    private static void searchPosition(int[] array, int n, int targetNum,
            int[] targetPosition) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (targetNum == array[i]) {
                targetPosition[index] = i;
                index++;
            }
        }
    }

}
