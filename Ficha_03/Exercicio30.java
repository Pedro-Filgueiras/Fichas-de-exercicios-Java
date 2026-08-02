package Ficha_03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        int lowestScore = 0;
        int highestScore = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Digite a %dª nota: ", (i + 1));
            scores[i] = scanner.nextInt();

            if (scores[i] <= 10 && scores[i] >= 0) {
                if (i == 0) {
                    lowestScore = scores[i];
                    highestScore = scores[i];
                }

                if (scores[i] > highestScore) {
                    highestScore = scores[i];
                }
                if (scores[i] < lowestScore) {
                    lowestScore = scores[i];
                }
            }

        }

        for (int score : scores) {
            System.out.printf("%s ", score);
        }
        System.out.println();
        System.out.printf("Menor nota: %d | Maior nota: %d", lowestScore, highestScore);

        scanner.close();
    }
}
