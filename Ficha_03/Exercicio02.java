package Ficha_03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] hero_list = new String[6];

        for (int i = 0; i < hero_list.length; i++) {
            System.out.print("Digite o nome do herói: ");
            hero_list[i] = scanner.nextLine();
        }


        System.out.println("LISTA DE HERÓIS");
        for (String hero : hero_list) {
            System.out.println(hero);
        }
        scanner.close();
    }
}
