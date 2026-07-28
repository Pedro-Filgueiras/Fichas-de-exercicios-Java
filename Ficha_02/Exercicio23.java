package Ficha_02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a frase ninja: ");
        String fraseNinja = scanner.nextLine();
        
        int contador = 0;

        for (int i = 0; i < fraseNinja.length(); i++) {
            contador += 1;
        }
        System.out.println("O total de caracteres é: " + contador);
    }
}
