package EjerciciosGuia;
import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        // EJERCICIO 12
        // Procedimiento isMultiple, que reciba dos números del usuario, y valide si el primero es múltiplo del segundo.
        // Debe imprimir si el primer número es múltiplo del segundo, o decir que no son múltiplos.

        Scanner read = new Scanner(System.in);
        System.out.println("CÁLCULO DE MÚLTIPLOS");
        System.out.println("Escriba dos números, para comparar si el primero es múltiplo del segundo");

        int num1 = read.nextInt();
        int num2 = read.nextInt();
        read.close();

        isMultiple(num1, num2);
    }
    
    public static void isMultiple (int num1, int num2){

        if (num2%num1 == 0) {
            System.out.println("El segundo número es múltiplo del primero");
        } else {
            System.out.println("No son múltiplos");
        }

    }
}
