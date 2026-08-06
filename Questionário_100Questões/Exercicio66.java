package Questionário_100Questões;

public class Exercicio66 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d", matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int sum = 0;
        String calculation = "";

        for (int i = 0; i < matrix.length; i++) {
            int diagonalValue = matrix[i][i];
            sum += diagonalValue;

            if (calculation.isEmpty()) {
                calculation += diagonalValue;
            } else {
                calculation += " + " + diagonalValue;
            }
        }

        System.out.println();
        System.out.println("Diagonal principal: " + calculation + " = " + sum);
    }
}