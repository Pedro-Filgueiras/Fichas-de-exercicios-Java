package Ficha_03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] goals = new int[5];
        int sumGoals = 0;
        

        for (int i = 0; i < goals.length; i++) {
            System.out.printf("Quantos gols foram marcados no %dº jogo: ", (i+1));
            goals[i] = scanner.nextInt();
            sumGoals += goals[i];
        }
        double mediaGoals = (double) sumGoals/goals.length;

        System.out.printf("Média de gols: " + mediaGoals);

        scanner.close();
    }
}
