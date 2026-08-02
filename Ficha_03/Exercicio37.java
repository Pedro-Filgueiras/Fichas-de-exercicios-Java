package Ficha_03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] positions = new int[3];

        for (int i = 0; i < positions.length; i++) {
            System.out.printf("Qual posição ele se encontra na volta %d: ", (i+1));
            positions[i] = scanner.nextInt();
            if (positions[i] == 1) {
                System.out.println("Mantenha a liderança!");
            } else {
                System.out.println("Use o casco vermelho!");
            }
        }

        System.out.println("Histórico de posições:");
        int rank = 1;
        for (int position : positions) {
            System.out.printf("%dª volta: Posição %d\n", rank, position);
            rank++;
        }

        scanner.close();
    }
}
