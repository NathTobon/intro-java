package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        // EXERCISE 21
        // Check if a 3x3 matrix is contained in a 10x10 matrix.
        int[][] matrixM = new int[10][10];
        int[][] matrixP = new int[3][3];
        fillMatrix(matrixM, 10);
        print2D(matrixM);
        System.out.println("Fill matrix P");
        // Matrix P is filled manually, to test if the program works.
        fillSmallMatrix(matrixP, 3);
        checkMatrix(matrixM, matrixP);
    }

    public static void fillSmallMatrix(int[][] matrixP, int matrixSize) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixP[i][j] = read.nextInt();
            }
        }
        read.close();
    }

    public static void fillMatrix(int[][] matrixM, int matrixSize) {
        Random random = new Random();

        int randomNum;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                randomNum = random.nextInt(99 - (1)) + (1); // int number = random.nextInt(max - min) + min;
                matrixM[i][j] = randomNum;
            }
        }
    }

    // To print square matrix
    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    private static void checkMatrix(int[][] matrixM, int[][] matrixP) {
        int xPosition = 0;
        int yPosition = 0;
        int xFound = 0;
        int yFound = 0;
        boolean matrixFound = false;
        do {
            xPosition = 0;
            yPosition = 0;
            xFound = 0;
            yFound = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == (9) && j == 9) {
                        break;
                    } else if (matrixP[0][0] == matrixM[i][j]) {
                        xFound = i;
                        yFound = j;
                        xPosition = xFound;
                        yPosition = yFound;
                        break;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrixP[i][j] == matrixM[xPosition + i][yPosition + j]) {
                        matrixFound = true;
                    } else {
                        matrixFound = false;
                        break;
                    }
                }
            }

        } while (matrixFound == false);

        if (matrixFound == true) {
            System.out.println("La matriz contenida se encuentra en la posición [" + xFound + "][" + yFound
                    + "] de la matriz principal.");
        } else {
            System.out.println("No se encontró la matriz contenida.");
        }

    }

}
