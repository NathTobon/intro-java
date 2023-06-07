package Ejercicios;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        // EJERCICIO 6
        // Determinar si un número es par o par
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese número");
        float num6 = read.nextFloat();
        read.close();
        
        if (num6 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
}
