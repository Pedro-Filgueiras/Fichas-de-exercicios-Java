package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE NOTAS ===");
        System.out.println();

        System.out.print("Digite a nota (0-100): ");
        int grade = scanner.nextInt();

        System.out.println();
        System.out.println("Nota inserida: " + grade);
        System.out.println();

        if (grade < 0 || grade > 100) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 100.");
            scanner.close();
            return;
        }

        String concept;
        String status;
        String observation;
        String range;

        int bracket = grade / 10;

        switch (bracket) {
            case 10:
            case 9:
                concept = "A";
                range = "90-100";
                status = "Aprovado";
                observation = "Excelente desempenho";
                break;

            case 8:
                concept = "B";
                range = "80-89";
                status = "Aprovado";
                observation = "Bom desempenho";
                break;

            case 7:
                concept = "C";
                range = "70-79";
                status = "Aprovado";
                observation = "Desempenho regular";
                break;

            case 6:
                concept = "D";
                range = "60-69";
                status = "Aprovado";
                observation = "Desempenho insuficiente";
                break;

            default:
                concept = "F";
                range = "0-59";
                status = "Reprovado";
                observation = "Necessário recuperação";
                break;
        }

        System.out.println("Análise:");
        System.out.println("Faixa: " + range);
        System.out.println("Conceito: " + concept);
        System.out.println("Status: " + status);
        System.out.println("Observação: " + observation);

        System.out.println();
        System.out.println("Distribuição de conceitos:");
        System.out.println("A (90-100): Excelente");
        System.out.println("B (80-89): Bom");
        System.out.println("C (70-79): Regular");
        System.out.println("D (60-69): Insuficiente");
        System.out.println("F (0-59): Reprovado");

        scanner.close();
    }
}