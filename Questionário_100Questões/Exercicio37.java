package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        System.out.printf("Verificando se %d é primo...", number);
        System.out.print("Testando divisores: ");

        if (number <= 1) {
            System.out.println("Esse número não é primo!");
        }

        boolean isPrime = number > 1;

        if (isPrime) {
            System.out.print("Testando divisores: ");
            for (int i = 2; i < number; i++) {
                System.out.printf("%d ", i);
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("O número é primo!");
        } else {
            System.out.println("Esse número não é primo!");
        }

        scanner.close();
    }
}