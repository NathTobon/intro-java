package EjerciciosGuia;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
       // EJERCICIO 11
       //Encriptar una frase que termine que punto.

       Scanner read = new Scanner(System.in);
       System.out.println("Ingrese una frase");
       String sentence = read.nextLine();
       read.close();
       int sentenceSize = sentence.length();
       //Determinar que la frase termina en punto.
       String lastChar = String.valueOf(sentence.charAt(sentenceSize-1));
       System.out.println(lastChar);

       if (!lastChar.equals(".")){
        System.out.println("La frase ingresada no es válida. Termine la frase en punto \".\"");
       } else {
        String encryptedSentence = "";
        String letter = "";
        char c;
        for (int i = 0; i < sentenceSize;i++){
            c = sentence.charAt(i);
            letter = String.valueOf(c);
            letter = letter.toLowerCase();
            letter = encrypt(letter);
            encryptedSentence = encryptedSentence.concat(letter);
        }
        System.out.println(encryptedSentence); 
       }
    }

public static String encrypt (String letter){
    switch (letter){
        case "a": 
            letter = "@";
            break;
        case "e": 
            letter = "#";
            break;
        case "i": 
            letter = "$";
            break;
        case "o": 
            letter = "%";
            break;
        case "u": 
            letter = "*";
            break;     
    }
   return letter;
}
}