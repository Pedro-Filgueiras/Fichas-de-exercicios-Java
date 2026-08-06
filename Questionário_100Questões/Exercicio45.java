package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] data = {8, 6, 9, 7, 10, 5, 8, 9};
        int totalSum = 0;

        System.out.print("Notas: [");
        for (int i = 0; i < data.length; i++) {
            totalSum += data[i];
            if (i != data.length - 1) { // Se o indíce for diferente do último indíce
                System.out.printf("%d, ", data[i]);
            } else {
                System.out.printf("%d]\n", data [i]);
            }
        }

        float average = (float) totalSum / (float) data.length;

        System.out.println("Soma total: " + totalSum);
        System.out.println("Quantidade de notas: " + data.length);
        System.out.println("Média: " + average);

        scanner.close();
    }
}
