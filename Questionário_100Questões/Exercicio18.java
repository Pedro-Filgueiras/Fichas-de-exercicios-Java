package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = -1; int count = 0; int totalSum = 0;


        System.out.println("Digite números (0 para parar):");
        while (number != 0) {
            number = scanner.nextInt();
            totalSum += number;
            if (number != 0) {
                count++;
            }
        }

        System.out.println("=== RELATÓRIO ===");
        System.out.println("Números digitados: " + count);
        System.out.println("Soma total: " + totalSum);
        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
