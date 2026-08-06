package Questionário_100Questões;

import java.util.Random;

public class Exercicio73 {
    public static void main(String[] args) {

        int size = 5;
        int mineCount = 5;
        char[][] board = new char[size][size];
        boolean[][] mines = new boolean[size][size];

        System.out.printf("Gerando campo minado %dx%d com %d minas...%n", size, size, mineCount);
        System.out.println();

        Random random = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);

            if (!mines[row][col]) {
                mines[row][col] = true;
                placedMines++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mines[i][j]) {
                    board[i][j] = 'M';
                } else {
                    int adjacentMines = countAdjacentMines(mines, i, j, size);
                    if (adjacentMines == 0) {
                        board[i][j] = ' ';
                    } else {
                        board[i][j] = (char) ('0' + adjacentMines);
                    }
                }
            }
        }

        System.out.printf("Campo Minado (%dx%d):%n", size, size);
        System.out.print("  ");
        for (int j = 0; j < size; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Legenda: M=Mina, números=minas adjacentes");
        System.out.println("Total de minas: " + mineCount);
    }

    static int countAdjacentMines(boolean[][] mines, int row, int col, int size) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (i >= 0 && i < size && j >= 0 && j < size) {
                    if (mines[i][j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}