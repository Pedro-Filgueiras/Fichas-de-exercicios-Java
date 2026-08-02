package Ficha_03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número 'alvo' entre 1 e 100");
        int choosenNumber = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (choosenNumber == i) {
                System.out.print("Selvagens a vista! ");
            }
            System.out.printf("%d metros\n", i);
        }

        scanner.close();
    }
}
