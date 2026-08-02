package Ficha_02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual equipamento você quer? (1-Kunai, 2-Shuriken)");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Kunai equipada");
        } else if (escolha == 2) {
            System.out.println("Shuriken equipada");
        } else {
            System.out.println("Mãos vazias");
        }

        scanner.close();
    }
}
