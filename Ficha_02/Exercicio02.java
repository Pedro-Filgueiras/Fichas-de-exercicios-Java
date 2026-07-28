package Ficha_02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float bandana = 45.50f;

        System.out.print("Quantas bandanas deseja comprar? (Bandana: $45.50 Ryos) ");
        int quantidadeComprada = scanner.nextInt();

        float precoTotal = bandana * quantidadeComprada;

        System.out.printf("O preço total é: %.2f", precoTotal);

    }
}
