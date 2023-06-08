package Ejercicios;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        // EJERCICIO 10
        // Ingresar un valor límite positivo.
        // Solicitar números, y sumarlos, hasta que la suma supere el límite inicial.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor límite");
        int limitValue = read.nextInt();

        if (limitValue < 0) {
            System.out.println("Dato inválido.");
        } else { 
            int total = 0;
            int num = 0;
            while (total <= limitValue) {
                System.out.println("Ingrese un número, para sumarlo");
                num = read.nextInt();
                total = total + num;
            }
            read.close();
            System.out.println("El total es: " + total);
        }
    }
}
