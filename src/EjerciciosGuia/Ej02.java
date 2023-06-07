/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

/**
 *
 * @author natad
 */
public class Ej02 {
    public static void main(String[] args) {
        // EJERCICIO 1 Y 2
        // Declarando variables y asignándoles datos
        byte byte1 = 126;
        short short1 = 32000;
        int numero = 1;
        long numLong = 2^62;
        float decimalFlotante = 0.6f;
        double decimal = 0.5;
        boolean logico = false;
        char letra = 'a'; // Con comillas simples
        String letraOFrase = "a";

        System.out.print("" + byte1 + short1 + numero + numLong + decimalFlotante + decimal + letra + letraOFrase);
        System.out.print("" + logico);
    }
}
