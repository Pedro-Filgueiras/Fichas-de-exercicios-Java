package Ficha_03;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float[] playerSpeed = new float[5];

        for (int i = 0; i < playerSpeed.length; i++) {
            System.out.printf("Digite a velocidade do %d jogador: ", (i+1));
            playerSpeed[i] = scanner.nextFloat();
        }

        for (float player : playerSpeed) {
            if (player > 0) {
                System.out.println("Jogador eliminado");
            } else {
                System.out.println("Jogador vivo");
            }
        }
        scanner.close();
    }
}
