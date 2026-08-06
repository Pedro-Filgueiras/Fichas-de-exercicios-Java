package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();
        int highestNumber = 0;
        int lowestNumber = 0;

        if (firstNumber >= secondNumber) {
            highestNumber = firstNumber;
            lowestNumber = secondNumber;
        } else {
            highestNumber = secondNumber;
            lowestNumber = firstNumber;
        }

        boolean hasLeftovers = true;
        int result = 0;

        System.out.printf("Calculando MDC de %d e %d:\n", firstNumber, secondNumber);
        while (hasLeftovers) {

            int times = highestNumber / lowestNumber;

            result = highestNumber % lowestNumber;
            System.out.printf("%d = %d x %d + %d\n", highestNumber, lowestNumber, times, result);
            
            if (result == 0) {
                break;
            } else {
                highestNumber = lowestNumber;
                lowestNumber = result;
            }

        }

        System.out.printf("MDC(%d, %d): ", firstNumber, secondNumber);
        System.out.println(lowestNumber);

        

        scanner.close();
    }
}
