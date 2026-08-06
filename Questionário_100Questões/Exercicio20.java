package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.printf("O número %d é negativo", number);
        } else if (number > 0) {
            System.out.printf("O número %d é positivo", number);
        } else {
            System.out.printf("O número %d não é nem positivo nem negativo", number);
        }

        scanner.close();
    }
}
