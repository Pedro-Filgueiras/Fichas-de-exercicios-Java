package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int sideA = scanner.nextInt();
        System.out.print("Digite o lado B: ");
        int sideB = scanner.nextInt();
        System.out.print("Digite o lado C: ");
        int sideC = scanner.nextInt();

        String type = "";

        if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            if (sideA == sideB && sideB == sideC && sideC == sideA) {
                type = "Equilátero";
            } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
                type = "Isósceles";
            } else {
                type = "Escaleno";
            }

            System.out.printf("Os lados %d, %d, %d formam um triângulo.\n", sideA, sideB, sideC);
            System.out.printf("Tipo: %s", type);
        }


        scanner.close();
    }
}
