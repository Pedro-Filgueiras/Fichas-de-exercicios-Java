package Ficha_03;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] carPosition = new int[3];
        int totalDistance = 100;
        boolean carRacing = true;
        int carWinner = 0;

        do {
            for (int i = 0; i < carPosition.length; i++) {

                System.out.printf("Quanto o %dº carro andou? ", (i + 1));
                carPosition[i] += scanner.nextInt();

                if (carPosition[i] >= totalDistance) {
                    carRacing = false;
                    if (carPosition[i] > carPosition[carWinner]) {
                        carWinner = i;
                    }
                }
            }
        } while (carRacing);

        System.out.printf("O vencedor foi o carro do índice: %d", carWinner);

        scanner.close();
    }
}