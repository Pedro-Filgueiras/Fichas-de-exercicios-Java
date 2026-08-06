package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci (15 termos):");

        int[] fibonacciList = new int[15];

        for (int i = 0; i < fibonacciList.length; i++) {    
            if (i == 0) {
                fibonacciList[i] = 0;
            } else if (i == 1) {
                fibonacciList[i] = 1;
            } else {
                fibonacciList[i] = fibonacciList[i-1] + fibonacciList[i-2];
            }
            System.out.printf("%d ", fibonacciList[i]);
        }

        scanner.close();
    }
}
