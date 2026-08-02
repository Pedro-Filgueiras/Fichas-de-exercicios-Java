package Ficha_03;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int episode = 1;
        String response = "";

        while (episode < 1100 && !response.equals("s")) {
            System.out.println("Episódio Atual = " + episode);
            System.out.print("Achamos o One Piece? (s/n) ");
            response = scanner.nextLine();
            episode += 50;
        }

        scanner.close();
    }
}
