package Ficha_03;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        char[] letters = {'A' , 'T', 'C', 'G'};

        int response = 0;

        while (response != -1) {
            System.out.print("Escolha um índice (0-3): ");
            response = scanner.nextInt();

            if (response == -1) {
                break;
            }

            if (response >= 0 && response < letters.length) {
                System.out.println(letters[response]);
            } else {
                System.out.println("Índice inválido!");
            }
        }
        scanner.close();
    }
}
