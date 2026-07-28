package Ficha_02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Time 7 (Kakashi)");
                break;
            
            case 2:
                System.out.println("Time 8 (Kurenai)");
                break;

            case 3:
                System.out.println("Time 10 (Asuma)");
                break;

            default:
                System.out.println("Time desconhecida");
                break;
        }

    }
}
