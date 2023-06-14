package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ej19 {
    public static void main(String[] args) {
        // EXERCISE 19
        // Prove if a matrix is antisymmetric.
        int matrixSize = 3;
        int[][] matrixA = new int[matrixSize][matrixSize];
        int[][] matrixB = new int[matrixSize][matrixSize];
        fillMatrix(matrixA, matrixSize);

        transposeMatrix(matrixA, matrixB, matrixSize);
        System.out.println("Matrix A:");
        print2D(matrixA);
        System.out.println("Matrix B:");
        print2D(matrixB);
        String matrix;
        if (isAntisymmetric(matrixA, matrixB, matrixSize) == true) {
            matrix = "";
        } else {
            matrix = "no ";
        }
        System.out.println("La matriz " + matrix + "es antimétrica.");

    }

    public static void fillMatrix(int[][] matrixA, int matrixSize) {
        Random random = new Random();

        int randomNum;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                randomNum = random.nextInt(1 - (-1)) + (-1); // int number = random.nextInt(max - min) + min;
                matrixA[i][j] = randomNum;
            }
        }
    }

    public static void transposeMatrix(int[][] matrixA, int[][] matrixB, int matrixSize) {
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

    public static boolean isAntisymmetric(int[][] matrixA, int[][] matrixB, int matrixSize) {
        boolean antisymmetric = true;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrixA[i][j] != matrixB[i][j] * (-1)) {
                    antisymmetric = false;
                    break;
                }
            }
        }
        return antisymmetric;
    }

}
