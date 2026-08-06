package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float firstNumber = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operation = scanner.nextLine().charAt(0);
        System.out.print("Digite o segundo número: ");
        float secondNumber = scanner.nextFloat();
        scanner.nextLine();

        float result = 0;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
        
            case '-':
                result = firstNumber - secondNumber;
                break;

            case '*':
                result = firstNumber * secondNumber;
                break;

            case '/':
                if (secondNumber == 0) {
                    System.out.println("Erro. Não é possível dividir por 0.");
                    break;
                }
                result = firstNumber / secondNumber;
                break;

            default:
                break;
        }

        if (secondNumber != 0) {
            System.out.printf("Resultado: %.1f %c %.1f = %.1f", firstNumber, operation, secondNumber, result);
        }

        scanner.close();
    }
}
