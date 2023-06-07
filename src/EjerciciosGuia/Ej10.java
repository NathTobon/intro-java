package EjerciciosGuia;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        // EJERCICIO 10
        // Un programa que lea 4 números entre 1 y 20.
        // Imprimir el número, seguido de tantos asteriscos como indique su valor.
        Scanner read = new Scanner(System.in);
        int contador = 0;
        int num = 1;
        // Declaración de vector
        int[] numeros = new int[4];
        // Bucle do, para guardar las números en el vector numeros
        do {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            numeros[contador] = num;
            contador++;
        } while(contador <= 3);
        read.close();
        // Se establece la variable asteriskValue que guardará el valor de cada posición del vector. Es decir, cada número ingresado, uno por uno.
        int asteriskValue = 0;
        // Un primer bucle For para recorrer el arreglo.
        for (int i = 0; i < 4; i++){
            asteriskValue = numeros[i];
            System.out.print(asteriskValue + " "); // Se imprime el valor del asterisco, sin linea y con un espacio para separar del resto.
            String asterisks = "";
            // Un segundo bucle For para imprimir los asteriscos, hasta el valor guardado.
            for (int j = 0; j < asteriskValue; j++){
                asterisks = asterisks + "*"; // Se guarda la línea de asteriscos, a medida que se va haciendo el bucle.
            }
            System.out.print(asterisks); // Se imprimen los astericos, sin linea.
            System.out.println(""); // Se imprime un salto de línea.
        }
    }
    
}
