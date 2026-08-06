package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        
        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        while (age < 0 || age > 120) {
            System.out.print("Idade Inválida! Digite novamente: ");
            age = scanner.nextInt();
        }

        System.out.printf("Idade válida registrada: %d anos", age);

        scanner.close();
    }
}
