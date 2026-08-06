package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();
        int currentYear = 2024;

        int birthYear = currentYear - age;

        System.out.printf("Você tem %d anos\n", age);
        System.out.printf("Você nasceu em: %d\n", birthYear);

        scanner.close();
    }
}
