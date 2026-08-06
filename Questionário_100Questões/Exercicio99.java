package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio99 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        mainMenu();

        scanner.close();
    }

    static void mainMenu() {
        boolean running = true;

        while (running) {
            System.out.println("=== SISTEMA NINJA - MENU PRINCIPAL ===");
            System.out.println("1 - Gerenciar Ninjas");
            System.out.println("2 - Missões");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                System.out.println();
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    ninjaMenu();
                    break;

                case 2:
                    missionMenu();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        }
    }

    static void ninjaMenu() {
        boolean inMenu = true;

        while (inMenu) {
            System.out.println("=== GERENCIAR NINJAS ===");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                System.out.println();
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.println("=== CADASTRAR NINJA ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("=== LISTAR NINJAS ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    break;

                case 3:
                    inMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        }
    }

    static void missionMenu() {
        boolean inMenu = true;

        while (inMenu) {
            System.out.println("=== MISSÕES ===");
            System.out.println("1 - Nova Missão");
            System.out.println("2 - Listar Missões");
            System.out.println("3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                System.out.println();
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.println("=== NOVA MISSÃO ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("=== LISTAR MISSÕES ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    break;

                case 3:
                    inMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        }
    }
}