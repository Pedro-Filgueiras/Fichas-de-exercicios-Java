package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        float div = (float) firstNumber / (float) secondNumber;

        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, sum);
        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, sub);
        System.out.printf("%d × %d = %d\n", firstNumber, secondNumber, mult);
        System.out.printf("%d ÷ %d = %.2f\n", firstNumber, secondNumber, div);

        scanner.close();
    }
}
