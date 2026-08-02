package Ficha_03;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notes = new double[4];
        double totalSum = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Insira a %dª nota: " , (i+1));
            notes[i] += scanner.nextDouble();
            totalSum += notes[i];
        }

        double average = totalSum/notes.length;

        System.out.println("Média = " + average);

        scanner.close();
    }
}