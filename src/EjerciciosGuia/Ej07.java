package EjerciciosGuia;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        // EJERCICIO 7
        // Fábrica de motores

        Scanner read = new Scanner(System.in);
        read.close();
        System.out.println("Ingrese el número de bomba que necesita");
        int tipoMotor = read.nextInt();

        switch (tipoMotor){
            case 1: 
            System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4: 
            System.out.println("La bomba es una bomba de pasta alimenticia");
            default:
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
