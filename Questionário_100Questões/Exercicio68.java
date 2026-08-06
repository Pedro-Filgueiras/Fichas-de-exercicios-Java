package Questionário_100Questões;

public class Exercicio68 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 4},
            {3, 4, 6}
        };

        System.out.println("Matriz:");
        printMatrix(matrix);

        System.out.println();
        System.out.println("Verificando simetria...");

        int rows = matrix.length;
        boolean isSquare = true;

        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != rows) {
                isSquare = false;
                break;
            }
        }

        if (!isSquare) {
            System.out.println("Matriz deve ser quadrada");
            return;
        }

        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("A matriz É simétrica!");
        } else {
            System.out.println("A matriz NÃO é simétrica!");
        }
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