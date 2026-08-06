package Questionário_100Questões;

import java.util.Random;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        
        int playerChoice = 0;

        int attempts = 1;

        while (attempts <= 7) {
            System.out.printf("Tentativa %d: ", attempts);
            playerChoice = scanner.nextInt();

            if (playerChoice == randomNumber) {
                System.out.printf("Parabéns! Você acertou o número %d em %d tentativas!", randomNumber, attempts);
                break;
            } else {
                if (playerChoice > randomNumber) {
                    System.out.println("Muito alto");
                } else {
                    System.out.println("Muito baixo!");
                }
                attempts++;
            }
        }

        scanner.close();
    }
}
