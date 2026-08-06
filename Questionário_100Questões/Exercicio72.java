package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };

        System.out.println("Matriz ordenada:");
        printMatrix(matrix);

        System.out.print("Digite o valor a buscar: ");
        int target = scanner.nextInt();

        System.out.println();
        System.out.printf("Buscando %d na matriz ordenada...%n", target);

        int row = 0;
        int col = matrix[0].length - 1;
        int comparisons = 0;
        String path = "";
        boolean found = false;

        while (row < matrix.length && col >= 0) {
            comparisons++;
            path += "(" + row + "," + col + ") → ";

            if (matrix[row][col] == target) {
                found = true;
                break;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        if (found) {
            System.out.println("Caminho: " + path + "Encontrado!");
            System.out.printf("Valor %d encontrado na posição [%d][%d]%n", target, row, col);
        } else {
            System.out.println("Caminho: " + path + "Não encontrado!");
            System.out.println("Valor não encontrado na matriz.");
        }

        System.out.println("Comparações realizadas: " + comparisons);

        scanner.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d", matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}