package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String mysteriousWord = "JAVA";
        int attempts = 6;
        String correctLetters = "";

        while (attempts > 0) {
            
            System.out.print("Palavra: ");
            for (int i = 0; i < mysteriousWord.length(); i++) {
                char currentChar = mysteriousWord.charAt(i);
                if (correctLetters.contains(String.valueOf(currentChar))) {
                    System.out.printf("%c ", currentChar);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();

            boolean won = true;
            for (int i = 0; i < mysteriousWord.length(); i++) {
                if (!correctLetters.contains(String.valueOf(mysteriousWord.charAt(i)))) {
                    won = false;
                    break;
                }
            }

            if (won) {
                System.out.println("Parabéns! Você venceu!");
                break;
            }

            System.out.println("Tentativas restantes: " + attempts);
            System.out.println();
            System.out.print("Letra: ");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));


            if (mysteriousWord.contains(String.valueOf(response))) {
                if (!correctLetters.contains(String.valueOf(response))) {
                    correctLetters += response;
                }
            } else {
                System.out.println("Letra não encontrada!");
                attempts--;
            }

            if (attempts == 0) {
                System.out.println("Você perdeu! A palavra era: " + mysteriousWord);
            }
        }

        scanner.close();
    }
}