package Questionário_100Questões;

public class Exercicio64 {
    public static void main(String[] args) {

        int[][] matrix = {
            {5, 8, 12},
            {15, 3, 7},
            {9, 11, 6}
        };

        System.out.println("Matriz:");
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d", matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Soma de todos os elementos: " + sum);
    }
}