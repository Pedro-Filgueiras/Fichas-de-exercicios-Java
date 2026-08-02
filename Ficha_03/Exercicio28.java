package Ficha_03;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] gemColors = new String[6];

        for (int i = 0; i < gemColors.length; i++) {
            gemColors[i] = "Desconhecido";
        }
        
        for (String gem : gemColors){
            System.out.printf("%s, ", gem);
        }

        System.out.println();
        System.out.print("Qual a cor da Joia da Mente? ");
        gemColors[2] = scanner.nextLine();

        for (String gem : gemColors){
            System.out.printf("%s, ", gem);
        }

        scanner.close();
    }
}
