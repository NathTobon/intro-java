package Ejercicios;

import java.util.Scanner;
// For debugging (1): import java.util.Arrays;

public class Ej17 {
    public static void main(String[] args) {
        // EJERCICIO 17
        // Recorre un vector de n enteros, y se contabiliza cuántos son de 1 digito, de
        // 2 digitos, hasta 5 digitos.

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, n);
        // For debugging (2): System.out.println(Arrays.toString(numbers));
        int[] countedDigits = new int[5];
        searchDigits(numbers, n, countedDigits);
        printResult(countedDigits);
        read.close();
    }

    // Filling the array with random numbers until 10000 (one hundred thousand)
    // minus 1 (one). In other words, up until 99999.
    public static void fillArray(int[] numbers, int n) {
        int randomNum;
        for (int i = 0; i < n; i++) {
            randomNum = (int) Math.floor((Math.random() * 100000));
            numbers[i] = randomNum;
        }
    }

    // Searching for the numbers, and counting the digits. After that, saving the
    // result in its respective array value.
    public static void searchDigits(int[] numbers, int n, int[] countedDigits) {
        String str;
        for (int i = 0; i < n; i++) {
            str = "" + numbers[i];
            if (str.length() == 1) {
                countedDigits[0]++;
            } else if (str.length() == 2) {
                countedDigits[1]++;
            } else if (str.length() == 3) {
                countedDigits[2]++;
            } else if (str.length() == 4) {
                countedDigits[3]++;
            } else if (str.length() == 5) {
                countedDigits[4]++;
            }
        }
    }

    // Printing the results
    private static void printResult(int[] countedDigits) {
        String numName = "";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                numName = "un dígito";
            } else if (i == 1) {
                numName = "dos dígitos";
            } else if (i == 2) {
                numName = "tres dígitos";
            } else if (i == 3) {
                numName = "cuatro dígitos";
            } else if (i == 4) {
                numName = "cinco dígitos";
            }
            System.out.println("Números de " + numName + ": " + countedDigits[i]);
        }
    }

}
