package Ficha_03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalKi = 0;

        while (totalKi < 8000) {

            System.out.println("Qual o KI inicial? ");
            int ki = scanner.nextInt();
            totalKi += ki + 100;
            System.out.println("Ki total: " + totalKi);
        }
        System.out.println("MAIS DE 8 MIL!");
        scanner.close();
    }
}
