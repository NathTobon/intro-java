/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author natad
 */
public class Ej04 {
    public static void main(String[] args) {
        // EJERCICIO 4
        // Grados centígrados a Fahrenheit
        System.out.println("Escriba los grados centígrados");
        //double gradoNum = read.nextDouble();
        double gradoNum = 32;
        double gradoF = 32 + (9 *(gradoNum / 5));
        System.out.println("Grados Fahrenheit: " + gradoF);
    }
}
