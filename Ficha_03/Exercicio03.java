package Ficha_03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int totalTime = 5;
        int totalRing = 0;

        System.out.print("Digite quantos anéis o sonic coleta por segundo: ");
        int ring_per_second = scanner.nextInt();
        

        for (int segundos = 0; segundos < totalTime; segundos ++) {
            totalRing += ring_per_second;
            System.out.printf("Passo %d\n", (segundos+1));
            System.out.println("Total acumulado: " + totalRing);
            System.out.println();
        }
        scanner.close();
    }
}
