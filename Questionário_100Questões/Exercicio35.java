package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Números pares de 1 a 100:\n");
        int countLine = 0;
        int countPairs = 0;
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
                countPairs ++;
                countLine ++;
            }
            if (countLine == 10) {
                System.out.println();
                countLine = 0;
            }
        }

        System.out.println();
        System.out.println("Total de números pares: " + countPairs);

        scanner.close();
    }
}
