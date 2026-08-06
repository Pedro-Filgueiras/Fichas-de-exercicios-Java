package Questionário_100Questões;

import java.util.Random;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.print("Escolha: 1-Pedra, 2-Papel, 3-Tesoura: ");
        int choice = scanner.nextInt();

        int choiceWinner = -1;

        if (computerChoice == choice) {
            choiceWinner = 0;
        } else if ((computerChoice == choice + 1) || (computerChoice == 1 && choice == 3)) {
            choiceWinner = computerChoice;
        } else {
            choiceWinner = choice;
        }

        System.out.println("Você escolheu: " + choice);
        System.out.println("Computador escolheu: " + computerChoice);
        if (choiceWinner == 0) {
            System.out.println("Resultado: Empate.");
        } else if (choiceWinner == computerChoice) {
            System.out.println("Resultado: Computador ganhou!");
        } else {
            System.out.println("Resultado: Você ganhou!");
        }



        scanner.close();
    }
}
