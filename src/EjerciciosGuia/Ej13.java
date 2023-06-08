package EjerciciosGuia;
import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) {
        // EJERCICIO 13
        // Crear un vector llamado Equipo, cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato, de tal manera que permita alojar sus nombres más adelante.
        System.out.println("¿Cuántos compañeros de equipo hay?");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.close();
        String[] equipo = new String[n];
        equipo[0] = "a";
    }
}
