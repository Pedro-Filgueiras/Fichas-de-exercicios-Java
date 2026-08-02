package Ficha_03;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean[] positions = {false, false, false, true, false};
        boolean playingGame = true;
        int response = 0;

        while (playingGame) {
            System.out.print("Chute um índice de 0-4: ");
            response = scanner.nextInt();
            if (response >= 0 && response <= 4) {
                if (positions[response] == true) {
                    System.out.println("Você acertou");
                    playingGame = false;
                } else {
                    System.out.println("Você errou");
                }
            } else {
            System.out.println("Opção inválida!");}
        }
        scanner.close();
    }
}
