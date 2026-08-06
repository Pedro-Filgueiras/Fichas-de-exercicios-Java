package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.printf("Bem-vindo(a) à Vila da Folha, %s!", name);

        scanner.close();
    }
}
