package EjerciciosGuia;
import java.util.Scanner;
public class Ej06 {
      public static void main(String[] args) {
           // EJERCICIO 6
        // COMPARAR DOS NUMEROS INGRESADOS POR EL USUARIO

        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        int numero1 = read.nextInt();
        int numero2 = read.nextInt();
        read.close();
        
        if (numero1 > 25 && numero2 > 25){
            System.out.println("Ambos números son mayores a 25.");
        } else if (numero1 > 25 || numero2 > 25){
            System.out.println("Alguno de los números es mayor a 25.");
        } else{
            System.out.println("Ninguno de los números es mayor a 25.");}
        
      }
}
