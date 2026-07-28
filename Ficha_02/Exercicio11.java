package Ficha_02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int quantidadeNinjas = 5;
        int somaChakra = 0;

        System.out.println("Digite a quantidade de chakra de 5 ninjas.");

        for (int ninja = 1; ninja <= quantidadeNinjas; ninja++){
            System.out.printf("Digite a quantidade de chakra do %dº ninja: ", ninja);
            int chakra = scanner.nextInt();
            somaChakra += chakra;
        }

        System.out.println("Chakra total: " + somaChakra);
    
    }
}
