package Ficha_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        String[] vetor = new String[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o nome da %d ferramenta: ", (i+1));
            vetor[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(vetor));
        scanner.close();
    }
}
