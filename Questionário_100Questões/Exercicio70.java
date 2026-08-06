package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio70 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;
        int totalMoves = 0;

        while (!gameOver) {
            printBoard(board);
            System.out.println();
            System.out.println("Jogador da vez: " + currentPlayer);
            System.out.print("Jogador " + currentPlayer + ", digite linha e coluna (0-2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Posição inválida! Tente novamente.");
                System.out.println();
                continue;
            }

            if (board[row][col] != ' ') {
                System.out.println("Posição já ocupada! Tente novamente.");
                System.out.println();
                continue;
            }

            board[row][col] = currentPlayer;
            totalMoves++;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println();
                System.out.println("Jogador " + currentPlayer + " venceu!");
                gameOver = true;
            } else if (totalMoves == 9) {
                printBoard(board);
                System.out.println();
                System.out.println("Empate!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                System.out.println();
            }
        }

        scanner.close();
    }

    static void printBoard(char[][] board) {
        System.out.println("Tabuleiro:");
        System.out.println("   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j != 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("  -----------");
            }
        }
    }

    static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}