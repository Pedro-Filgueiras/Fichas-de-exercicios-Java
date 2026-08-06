package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numberList = {45, 23, 67, 89, 12, 56, 78};
        int highestNumber = 0;
        int positionHighest = 0;

        for (int i = 0; i < numberList.length; i++) {
            if (highestNumber < numberList[i]) {
                highestNumber = numberList[i];
                positionHighest = i;
            }
        }

        System.out.println("Maior elemento: " + highestNumber);
        System.out.println("Posição: " + positionHighest);

        scanner.close();
    }
}