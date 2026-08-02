package Ficha_03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] musicList = {"Happier", "Friends", "Girls Like You", "Alone", "Another Love"};

        for (String music : musicList) {
            System.out.println("Tocando agora: " + music);
        }
        scanner.close();
    }
}
