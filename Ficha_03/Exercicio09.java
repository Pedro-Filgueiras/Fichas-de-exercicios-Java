package Ficha_03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int response = 0;

        do {
            System.out.println("Dormammu, eu vim barganhar!");
            System.out.print(" 1 - Recusar, 2 - Aceitar: ");
            response = scanner.nextInt();
            System.out.println();
        } while (response != 2);
        scanner.close();
    }
}
