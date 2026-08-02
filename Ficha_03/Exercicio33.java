package Ficha_03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String response = "";
        
        do {
            System.out.print("Digite o nome do feitiço: ");
            response = scanner.nextLine();

            if (!response.equals("Wingardium Leviosa")) {
                System.out.println("Você vai furar o olho de alguém");
            } else {
                System.out.println("Parabéns");
            }
        } while (!response.equals("Wingardium Leviosa"));
        scanner.close();
    }
}
