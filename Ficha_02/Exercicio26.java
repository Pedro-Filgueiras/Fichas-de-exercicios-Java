package Ficha_02;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        if (frase.contains("Akatsuki")) {
            System.out.println("PERIGO DETECTADO");
        }
        scanner.close();
    }
}
