package Ficha_03;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int bullets = 10;

        for (int i = bullets; i > 0; i--) {
            System.out.println("Atirar? ");
            scanner.nextLine();
            System.out.printf("Restam: %d balas\n\n", (i-1));
        }

        scanner.close();
    }
}
