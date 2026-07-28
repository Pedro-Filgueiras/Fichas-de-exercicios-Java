package Ficha_02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nível de chakra? (0 a 100)");
        int nivelChakra = scanner.nextInt();

        if (nivelChakra <= 100 && nivelChakra >= 90) {
            System.out.println("Kage");
        } else if (nivelChakra <= 89 && nivelChakra >= 70) {
            System.out.println("Jounin");
        } else if (nivelChakra <= 69 && nivelChakra >= 50) {
            System.out.println("Chunin");
        } else if (nivelChakra <= 49 && nivelChakra >= 0) {
            System.out.println("Genin");
        } else {
            System.out.println("Valor não permitido na escala");
        }
    }
}
