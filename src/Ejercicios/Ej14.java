package Ejercicios;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        // EJERCICIO 14
        // Aplicación de cambio de divisas con funciones.

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euroQuantity = read.nextDouble();
        System.out.println("¿A cuál moneda desea cambiar? Ingrese el nombre de la modena (ej: dolar, yen o libra)");
        String currency = read.next();
        read.close();
        currency = currency.toLowerCase();

        switch (currency) {
            case "dolar", "dólar":
                toDollar(euroQuantity);
                break;
            case "yen":
                toYen(euroQuantity);
                break;
            case "libra":
                toPound(euroQuantity);
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
        }
    }

    public static void toDollar(double euroQuantity) {
        double total = euroQuantity * 1.28611;
        System.out.println("Cambio a dólar: " + total);
    }

    public static void toYen(double euroQuantity) {
        double total = euroQuantity * 129.852;
        System.out.println("Cambio a yen: " + total);
    }

    public static void toPound(double euroQuantity) {
        double total = euroQuantity * 0.86;
        System.out.println("Cambio a libra: " + total);
    }

}
