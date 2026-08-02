package Ficha_03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a energia inicial de Eleven: ");
        int initialEnergy = scanner.nextInt();
        int energyLoss = initialEnergy;

        while (energyLoss > 0) {
            if (energyLoss == 20) {
                System.out.println("PERIGO!");
            }
            System.out.println("Energia atual: " + energyLoss);
            energyLoss -= 10;
        }
        System.out.println("Energia totalmente esgotada!");
        scanner.close();
    }
}
