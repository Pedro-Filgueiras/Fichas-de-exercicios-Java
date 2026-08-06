package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        int totalPrime = 0;

        for (int i = 2; i <= number; i++) { // Para cada número menor do que o número digitado
            boolean isPrime = true;
            for (int j = 2; j < i; j++) { // Testar se o número é divisível por outro número sem ser ele mesmo e 1
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%d ", i);
                totalPrime++;
            }
        }
        System.out.printf("\nTotal de primos encontrados: %d", totalPrime);

        scanner.close();
    }
}
