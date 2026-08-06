package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0-100): ");
        int grade = scanner.nextInt();

        char concept = '\0';
        String status = "";

        if (grade < 0 || grade > 100) {
            System.out.println("NOTA INVÁLIDA");
        }
        else {
            if (grade >= 90 && grade <=100) {
                concept = 'A';
                status = "Aprovado";
            } else if (grade >= 80 && grade <= 89) {
                concept = 'B';
                status = "Aprovado";
            } else if (grade >= 70 && grade <= 79) {
                concept = 'C';
                status = "Aprovado com ressalvas";
            } else if (grade >= 60 && grade <= 69) {
                concept = 'D';
                status = "Reprovado";
            } else {
                concept = 'F';
                status = "Reprovado";
            }
    
            System.out.printf("Nota: %d\n", grade);
            System.out.printf("Conceito: %c\n", concept);
            System.out.printf("Status: %s\n", status);
        }

        scanner.close();
    }
}
