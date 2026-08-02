package Ficha_02;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println();
        String palindrome = scanner.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(palindrome);
        
        sb.reverse();

        if (sb.toString().equals(palindrome)) {
            System.out.println("Essa palavra é Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
        scanner.close();
    }
}
