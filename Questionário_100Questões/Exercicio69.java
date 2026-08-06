package Questionário_100Questões;

public class Exercicio69 {
    public static void main(String[] args) {

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        System.out.printf("Matriz A (%dx%d):%n", rowsA, colsA);
        printMatrix(matrixA);

        System.out.println();
        System.out.printf("Matriz B (%dx%d):%n", rowsB, colsB);
        printMatrix(matrixB);
        System.out.println();

        if (colsA != rowsB) {
            System.out.println("Não é possível multiplicar: colunas de A devem ser iguais às linhas de B");
            return;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }

        System.out.printf("Matriz C = A × B (%dx%d):%n", rowsA, colsB);
        printMatrix(result);
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}