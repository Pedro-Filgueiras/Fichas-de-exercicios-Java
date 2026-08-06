package Questionário_100Questões;

public class Exercicio63 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int value = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value++;
            }
        }

        System.out.println("Matriz 3x3:");
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