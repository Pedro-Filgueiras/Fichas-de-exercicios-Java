package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        int result = 0;

        System.out.printf("=== TABUADA DO %d ===\n", number);
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }

        scanner.close();
    }
}
