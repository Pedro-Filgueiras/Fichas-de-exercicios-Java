package Ficha_03;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] countrys = new String[4];

        System.out.println("Digite o nome dos países que devem participar: ");
        for (int i = 0; i < countrys.length ;i++ ){
            countrys[i] = scanner.nextLine();
        }

        for (int i = countrys.length - 1; i >= 0; i--) {
            System.out.println(countrys[i]);
        }
        scanner.close();
    }
}
