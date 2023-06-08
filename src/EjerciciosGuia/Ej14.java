package EjerciciosGuia;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
    // EJERCICIO 14
    // Llenar el vector Equipo con los nombres de los compañeros de equipo.
        System.out.println("¿Cuántos compañeros de equipo hay?");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String[] equipo = new String[n];
        String name;
        
        for (int i = 0; i < n; i++){
            System.out.println("Ingrese el nombre de teammate");
            name = read.nextLine();
            equipo[i] = name;  
        }
        read.close();
    }
}
