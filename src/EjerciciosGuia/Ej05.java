/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author natad
 */
public class Ej05 {
    public static void main(String[] args) {
        // EJERCICIO 5 
        // Variables tipo boolean, double y char.
        Scanner read = new Scanner(System.in);
        boolean logico1;
        double decimal1;
        char letra1;
        
        logico1 = read.nextBoolean();
        
        decimal1 = read.nextDouble();
       
        letra1 = read.next().charAt(0);

        read.close();
       
        System.out.println(logico1);
        System.out.println(decimal1);
        System.out.println(letra1);
    }
    
}
