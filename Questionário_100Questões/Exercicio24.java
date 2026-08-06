package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("O ano de %d é bissexto.\n", year);
        } else {
            System.out.printf("O ano de %d não é bissexto.", year);
        }

        scanner.close();
    }
}
