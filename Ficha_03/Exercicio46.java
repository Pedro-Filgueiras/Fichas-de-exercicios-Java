package Ficha_03;

public class Exercicio46 {
    public static void main(String[] args) {
        
        char[] tictactoe = {'X', 'O', '\0', 'X', '\0'};
        int emptySpace = 0;

        for (int i = 0; i < tictactoe.length; i++) {
            if (tictactoe[i] ==  '\0') {
                emptySpace++;
            }
        }

        System.out.printf("Existem %d espaços vazios", emptySpace);

    }
}
