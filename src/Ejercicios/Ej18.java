package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ej18 {
    public static void main(String[] args) {
        // EJERCICIO 18
        // Fill a 4x4 matrix with random numbers. Transpose it. Go from matrix A to
        // matrix B.
        int matrixSize = 4;
        int[][] matrixA = new int[matrixSize][matrixSize];
        int[][] matrixB = new int[matrixSize][matrixSize];
        fillMatrix(matrixA, matrixSize);
        transposeMatrix(matrixA, matrixB, matrixSize);
        System.out.println("Matrix A:");
        print2D(matrixA);
        System.out.println("Matrix B:");
        print2D(matrixB);

    }

    private static void fillMatrix(int[][] matrixA, int matrixSize) {
        Random random = new Random();
        int randomNum;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                randomNum = random.nextInt(9 - (-9)) + (-9); // int number = random.nextInt(max - min) + min;
                matrixA[i][j] = randomNum;
            }
        }
    }

    private static void transposeMatrix(int[][] matrixA, int[][] matrixB, int matrixSize) {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixB[j][i] = matrixA[i][j];
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

}
