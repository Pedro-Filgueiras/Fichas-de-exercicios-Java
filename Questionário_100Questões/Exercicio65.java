package Questionário_100Questões;

public class Exercicio65 {
    public static void main(String[] args) {

        int[][] matrix = {
            {23, 45, 12},
            {67, 89, 34},
            {56, 78, 91}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println();
        System.out.println("Maior elemento: " + maxValue);
        System.out.println("Posição: linha " + maxRow + ", coluna " + maxCol);
    }
}