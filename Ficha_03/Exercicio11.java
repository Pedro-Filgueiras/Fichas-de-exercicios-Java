package Ficha_03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] items = new String[9];

        System.out.println("Digite items para as posições 0, 1 e 2: ");
        for (int i = 0; i < items.length; i++) {
            if (i == 0 || i == 1 || i == 2) {
                items[i] = scanner.nextLine();
            } else {
                items[i] = null;
            }
        }
        
        System.out.println("Seus equipamentos:");
        for (String item : items) {
            System.out.printf("%s " ,item);
        }

        scanner.close();
    }
}
