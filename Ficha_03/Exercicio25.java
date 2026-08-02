package Ficha_03;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String rossScream = "We were on a break";
        int shoutedTimes = 0;

        System.out.print("Quantas vezes Ross deve gritar? ");
        shoutedTimes = scanner.nextInt();

        for (int i = 0; i < shoutedTimes; i++) {
            System.out.printf("%d: %s\n", (i+1), rossScream);
        }
        scanner.close();
    }
}
