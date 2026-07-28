package Ficha_02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean orochimaru = false;

        while (!orochimaru) {
            System.out.print("Digite o nome de seu inimigo: ");
            String inimigo = scanner.nextLine();

            if (inimigo.equals("Orochimaru")) {
                break;
            }
        }

    }
}
