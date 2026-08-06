package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contando de 1 a 10: ");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d " , i);
        }

        scanner.close();
    }
}
