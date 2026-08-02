package Ficha_02;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String fullName = scanner.nextLine();

        System.out.println(fullName.charAt(0));
        scanner.close();
    }
}
