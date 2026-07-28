package Ficha_02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu jutsu: ");
        String jutsu = scanner.nextLine();

        System.out.printf("JUTSU ATIVADO! %s!", jutsu.toUpperCase());
    }
}
