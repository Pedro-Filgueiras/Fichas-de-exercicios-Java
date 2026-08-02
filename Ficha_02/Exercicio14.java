package Ficha_02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a altura do retângulo? ");
        int altura = scanner.nextInt();
        System.out.print("Qual a largura do retângulo? ");
        int largura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        scanner.close();
    }
}
