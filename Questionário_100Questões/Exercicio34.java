package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Não é possível fatorial negativo!");
            
        } else {
            
            int fatorialResult = 1;
            System.out.printf("Calculando fatorial de %d:\n", number);
            System.out.printf("%d! = ", number);

            for (int i = number; i > 0; i--) {
                fatorialResult *= i;

                if (i > 1) {
                    System.out.printf("%d x ", i);
                } else {
                    System.out.printf("%d = ", i);
                }
            }
            System.out.print(fatorialResult);
        }

        scanner.close();
    }
}