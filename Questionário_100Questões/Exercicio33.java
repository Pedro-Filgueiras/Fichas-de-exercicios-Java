package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contagem regressiva:");
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("\nZERO!");

        scanner.close();
    }
}
