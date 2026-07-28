package Ficha_02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int totalNumeros = 20;

        for (int i = 1; i <= totalNumeros; i++) {
            if (i%3 == 0) {
                continue;
            } else {
                System.out.printf("%d\n", i);
            }
        }
        
    }
}
