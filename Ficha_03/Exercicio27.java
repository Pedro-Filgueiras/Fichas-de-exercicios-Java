package Ficha_03;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String response = "";

        do {
            System.out.println("Azul ou Vermelha? ");
            response = scanner.nextLine();

            if (response.equals("Azul")) {
                System.out.println("Fim da história");
            } else if (response.equals("Vermelha")) {
                System.out.println("Bem-vindo ao mundo real");
            } else {
                System.out.println("Opção Inválida!");
            }
            System.out.println();
        } while (!response.equals("Vermelha"));
        scanner.close();
    }
}
