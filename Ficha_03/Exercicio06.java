package Ficha_03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frase de punição: ");
        String punishmentStatement = scanner.nextLine();
        System.out.print("Quantas vezes ela deve ser escrita? ");
        int writtenTimes = scanner.nextInt();

        for (int i = 0; i < writtenTimes; i ++) {
            System.out.println(punishmentStatement);
        }
        scanner.close();
    }
}
