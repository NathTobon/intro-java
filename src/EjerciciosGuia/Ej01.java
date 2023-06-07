package EjerciciosGuia;
import java.util.Scanner;

/**
 *
 * @author natad
 */
public class Ej01 {
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos del usuario.
        Scanner leer = new Scanner(System.in);
        leer.close();
        // Se crea una variable cadena (String) que se utiliza para leer datos del usuario.
        String nombre;
        //Se muestra un mensaje por pantalla.
        System.out.println("Ingresa tu nombre:");
        // Leemos el nombre de la persona en la variable nombre.
        nombre = leer.next();
        //Mostramos por consola un saludo personalizado.
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
    }
}
