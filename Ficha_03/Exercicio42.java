package Ficha_03;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float[] grades = new float[4];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Digite sua %dª nota: ", (i+1));
            grades[i] = scanner.nextFloat();
        }

        for (float grade : grades) {
            if (grade < 6) {
                System.out.println("Achou que eu estava brincando?");
            }
        }
        scanner.close();
    }
}
