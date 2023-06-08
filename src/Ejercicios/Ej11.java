package Ejercicios;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        // EJERCICIO 11
        // Pedir dos números positivos por teclado.
        // Se establece un menú de 5 opciones: (1. Sumar, 2. Restar, 3. Multiplicar, 4.
        // Dividir, 5. Salir)
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros positivos.");
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("El número o números ingresados no son váldos");
        } else {
            int option = 0;
            String outOption = "";
            do {
                System.out.println("MENÚ");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija opción:");
                option = read.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("El resultado es: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("El resultado es: " + substract(num1, num2));
                        break;
                    case 3:
                        System.out.println("El resultado es: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("El resultado es: " + divide(num1, num2));
                        break;
                    case 5:
                        System.out.println("¿Está seguro de que desea salir del programa?(S/N)");
                        outOption = read.next();
                        outOption = outOption.toUpperCase();
                        break;
                }
            } while (!outOption.equals("S"));

        }
        read.close();
    }

    // add, subtract, multiply, divide.
    public static int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public static int substract(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }

    public static int multiply(int num1, int num2) {
        int total = num1 * num2;
        return total;
    }

    public static double divide(int num1, int num2) {
        double total = (double) num1 / (double) num2;
        return total;
    }
}
