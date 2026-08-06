package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        if (age < 16 && age >= 0) {
            System.out.printf("Com %d anos, você é menor de idade.", age);
        } else if (age >= 18) {
            System.out.printf("Com %d anos, você é maior de idade.", age);
        } else {
            System.out.println("Esse valor não é válido.");
        }

        scanner.close();
    }
}