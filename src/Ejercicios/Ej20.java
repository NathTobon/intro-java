package Ejercicios;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        // EXERCISE 20
        // Check if 3x3 square is magic or not.
        // The user inputs the possible magic square.
        int matrixSize = 3;
        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.println("Ingrese los valores de la matriz por teclado");
        fillMatrix(matrix, matrixSize);
        // Verify if the numbers introduced are different, and between 1 and 9.
        boolean matrixNumbers = isCorrect(matrix, matrixSize);
        if (matrixNumbers == true) {
            boolean magicMatrix = isMagic(matrix, matrixSize);
            if (magicMatrix == true) {
                System.out.println("La matrix es mágica.");
            } else {
                System.out.println("La matriz no es mágica.");
            }
        } else {
            System.out.println(
                    "La matriz ingresada no es correcta. Verifique que los numeros se encuentren entre 1 y 9, y que los numeros sean distintos.");
        }
    }

    public static void fillMatrix(int[][] matrix, int matrixSize) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = read.nextInt();
            }
        }
        read.close();
    }

    public static boolean isCorrect(int[][] matrix, int matrixSize) {
        boolean ret = true; // Ret for return

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] < 10 && matrix[i][j] > 0) {
                    for (int k = 0; k < matrixSize; k++) {
                        for (int l = 0; l < matrixSize; l++) {
                            if (i != k && j != l) {

                                if (matrix[i][j] == matrix[k][l]) {
                                    ret = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    ret = false;
                    break;
                }
            }
        }

        return ret;
    }

    public static boolean isMagic(int[][] matrix, int matrixSize) {
        // Defining variables
        boolean magic = false;
        int column, columnTotal, row, rowTotal, diag1Total, diag2Total;
        // Initializating variables
        column = 0;
        columnTotal = 0;
        row = 0;
        rowTotal = 0;
        diag1Total = 0;
        diag2Total = 0;
        // Double for cycle for matrix
        for (int i = 0; i < matrixSize; i++) {
            column = 0;
            row = 0;
            for (int j = 0; j < matrixSize; j++) {
                column = column + matrix[j][i]; // Adding the column
                row = row + matrix[i][j]; // Addind the row
                if (i == j) {
                    diag1Total = diag1Total + matrix[i][j]; // Adding the principal diagonal total
                }
                if (i + j == matrixSize - 1) {
                    diag2Total = diag2Total + matrix[i][j]; // Adding the secondary diagonal total
                }

            }
            rowTotal = rowTotal + row; // Adding rows
            columnTotal = columnTotal + column;
        }
        // Checking if all the totals are the same. If they are, magic is true. If not,
        // it stays being false.
        if (((rowTotal / matrixSize) == row) && ((columnTotal / matrixSize) == column)) {
            if ((row == column) && (row == diag1Total) && (row == diag2Total) && (diag1Total == diag2Total)) {
                magic = true;
            }
        }

        return magic;
    }

}
