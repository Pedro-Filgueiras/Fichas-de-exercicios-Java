package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio91 {

    static int totalOperations = 0;
    static int sumCount = 0;
    static int subtractionCount = 0;
    static int multiplicationCount = 0;
    static int divisionCount = 0;
    static int powerCount = 0;
    static int divisionByZeroAvoided = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA MODULAR ===");

        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println();
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                continue;
            }

            int option = scanner.nextInt();

            if (option == 0) {
                break;
            }

            if (option < 1 || option > 5) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.print("Primeiro número: ");
            double first = scanner.nextDouble();
            System.out.print("Segundo número: ");
            double second = scanner.nextDouble();

            switch (option) {
                case 1:
                    double sumResult = add(first, second);
                    sumCount++;
                    System.out.println(first + " + " + second + " = " + sumResult);
                    break;

                case 2:
                    double subResult = subtract(first, second);
                    subtractionCount++;
                    System.out.println(first + " - " + second + " = " + subResult);
                    break;

                case 3:
                    double mulResult = multiply(first, second);
                    multiplicationCount++;
                    System.out.println(first + " × " + second + " = " + mulResult);
                    break;

                case 4:
                    if (second == 0) {
                        System.out.println("Erro: divisão por zero não é permitida!");
                        divisionByZeroAvoided++;
                        continue;
                    }
                    double divResult = divide(first, second);
                    divisionCount++;
                    System.out.println(first + " ÷ " + second + " = " + divResult);
                    break;

                case 5:
                    double powResult = power(first, second);
                    powerCount++;
                    System.out.println(first + " ^ " + second + " = " + powResult);
                    break;
            }

            totalOperations++;

            System.out.println();
            System.out.print("Deseja fazer outra operação? (s/n): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                continueCalculating = false;
            }
        }

        System.out.println("Calculadora encerrada!");
        System.out.println();
        System.out.println("Estatísticas da sessão:");
        System.out.println("- Operações realizadas: " + totalOperations);
        if (sumCount > 0) {
            System.out.println("- Soma: " + sumCount + (sumCount == 1 ? " vez" : " vezes"));
        }
        if (subtractionCount > 0) {
            System.out.println("- Subtração: " + subtractionCount + (subtractionCount == 1 ? " vez" : " vezes"));
        }
        if (multiplicationCount > 0) {
            System.out.println("- Multiplicação: " + multiplicationCount + (multiplicationCount == 1 ? " vez" : " vezes"));
        }
        if (divisionCount > 0) {
            System.out.println("- Divisão: " + divisionCount + (divisionCount == 1 ? " vez" : " vezes"));
        }
        if (powerCount > 0) {
            System.out.println("- Potência: " + powerCount + (powerCount == 1 ? " vez" : " vezes"));
        }
        System.out.println("- Divisão por zero evitada: " + divisionByZeroAvoided + " vezes");

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}