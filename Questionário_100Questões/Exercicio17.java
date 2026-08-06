package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String phrase = scanner.nextLine();
        phrase = phrase.trim();
        String[] wordInPhrase = phrase.split("\\s+");
        int wordNumber = wordInPhrase.length;

        System.out.printf("Frase digitada: %s\n", phrase);
        System.out.println("Número de palavras: " + wordNumber);

        scanner.close();
    }
}