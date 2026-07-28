package Ficha_02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Qual sua missão favorita? ");
        String missao = scanner.nextLine();

        System.out.printf("O ninja %s, de %d anos, deseja completar a missão %s", nome, idade, missao);

        scanner.close();
    }
}