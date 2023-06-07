package EjerciciosGuia;
import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        // EJERCICIO 9
        // Programa que lea 20 números.
        // Si num = 0, entonces se debe salir del bucle.
        // El programa debe calcular y mostrar el resultado de la suma de los números leídos.
        // Los números negativos no deben sumarse.

        Scanner read = new Scanner(System.in);
        int num =  1;
        int contador = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            contador++;
            if (num == 0){
                break;
            } else if (contador > 20){
                break;
            } else if (num > 0) {
                suma = suma + num;
            }  
        } while(true);
        read.close();
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
