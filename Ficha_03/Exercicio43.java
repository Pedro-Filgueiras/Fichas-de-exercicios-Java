package Ficha_03;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int pushups = 0;

        System.out.print("Quantas flexões você aguenta? ");
        pushups = scanner.nextInt();

        for (int i = 0; i < pushups; i += 10) {
            System.out.println("Flexões: " + i);
        }

        scanner.close();
    }
}
