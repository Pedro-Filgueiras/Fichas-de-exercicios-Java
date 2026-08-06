package Questionário_100Questões;

public class Exercicio67 {
    public static void main(String[] args) {

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = original.length;
        int cols = original[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.printf("Matriz original (%dx%d):%n", rows, cols);
        printMatrix(original);

        System.out.println();
        System.out.printf("Matriz transposta (%dx%d):%n", cols, rows);
        printMatrix(transposed);
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