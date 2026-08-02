package Ficha_03;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] notes = new int[10];
        int response = 0;
        int totalScored = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.printf("A %dª nota está (certa = 1 | errada = 0): ", (i+1));
            response = scanner.nextInt();
            if (response == 1) {
                totalScored++;
            }
        }

        float correctPercentage = ((float)totalScored/notes.length)*100 ;

        System.out.printf("Porcentagem de acertos: %.2f%%", correctPercentage);
        
        scanner.close();
    }
}
