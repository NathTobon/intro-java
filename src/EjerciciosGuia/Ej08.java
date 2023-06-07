package EjerciciosGuia;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        // EJERCICIO 8
        // Valida si una nota está entre 0 y 10. Si no está, la nota se pedirá de nuevo.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        int nota = read.nextInt();
        while ((nota <= 0) || (nota >= 10)){
            System.out.println("La nota ingresada es incorrecta. Intente nuevamente.");
            nota = read.nextInt();
        }
        read.close();
        System.out.println("La nota ingresada es válida.");    
    }
}
