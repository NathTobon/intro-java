package Ejercicios;

public class Ej05 {
     public static void main(String[] args) {
          // EJERCICIO 5 
        // Recibe num y sale el doble, el triple y la raíz cuadrada de ese número
       // int num5 = read.nextInt();
        int num5 = 5;
        int doble5 = num5 * 2;
        int triple5 = num5 * 3;
        // double numd5 = num5;
        double numd5 = Double.valueOf(num5);
        double raiz5 = Math.sqrt(numd5);
        System.out.println("Doble: " + doble5);
        System.out.println("Triple: " + triple5);
        System.out.println("Raiz cuadrada: " + raiz5);
     }
}
