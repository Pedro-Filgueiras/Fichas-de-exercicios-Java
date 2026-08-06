package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par", number);
        } else {
            System.out.printf("O número %d é ímpar", number);
        }

        scanner.close();
    }
}