package Ficha_02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock Lee quer fazer flexões, quantas flexões ele deve fazer? ");
        int quantidadeFlexoes = scanner.nextInt();

        for (int i=0; i<quantidadeFlexoes; i++) {
            System.out.println("Flexão "+ (i+1));
        }

        scanner.close();
    }
}
