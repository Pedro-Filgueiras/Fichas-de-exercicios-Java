package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio100 {

    static final int GREEN_TIME = 30;
    static final int YELLOW_TIME = 5;
    static final int RED_TIME = 25;

    static String currentState = "VERDE";
    static int remainingTime = GREEN_TIME;
    static boolean maintenanceMode = false;
    static int cycleCount = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SEMÁFORO INTELIGENTE ===");
        System.out.println("Estado inicial: " + currentState);
        System.out.println("Tempo restante: " + remainingTime + " segundos");
        System.out.println();
        System.out.println("Comandos: PROXIMO, MANUTENCAO, NORMAL, STATUS, SAIR");
        System.out.println();

        boolean running = true;

        while (running) {
            System.out.print("> ");
            String command = scanner.nextLine().trim().toUpperCase();
            System.out.println();

            switch (command) {
                case "PROXIMO":
                    advanceState();
                    break;

                case "MANUTENCAO":
                    enterMaintenance();
                    break;

                case "NORMAL":
                    exitMaintenance();
                    break;

                case "STATUS":
                    showStatus();
                    break;

                case "SAIR":
                    System.out.println("Encerrando sistema...");
                    running = false;
                    break;

                default:
                    System.out.println("Comando inválido!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    static void advanceState() {
        if (maintenanceMode) {
            System.out.println("Não é possível avançar estado em modo manutenção. Use NORMAL para retomar.");
            return;
        }

        String previousState = currentState;

        switch (currentState) {
            case "VERDE":
                currentState = "AMARELO";
                remainingTime = YELLOW_TIME;
                break;

            case "AMARELO":
                currentState = "VERMELHO";
                remainingTime = RED_TIME;
                break;

            case "VERMELHO":
                currentState = "VERDE";
                remainingTime = GREEN_TIME;
                cycleCount++;
                break;
        }

        System.out.println(previousState + " → " + currentState);
        System.out.println("Estado atual: " + currentState + " (" + remainingTime + " segundos)");
    }

    static void enterMaintenance() {
        if (maintenanceMode) {
            System.out.println("Sistema já está em modo manutenção.");
            return;
        }

        String previousState = currentState;
        currentState = "PISCA_AMARELO";
        maintenanceMode = true;

        System.out.println(previousState + " → PISCA_AMARELO");
        System.out.println("Estado atual: PISCA_AMARELO (modo manutenção)");
    }

    static void exitMaintenance() {
        if (!maintenanceMode) {
            System.out.println("Sistema já está em operação normal.");
            return;
        }

        maintenanceMode = false;
        currentState = "VERDE";
        remainingTime = GREEN_TIME;

        System.out.println("PISCA_AMARELO → VERDE");
        System.out.println("Estado atual: VERDE (" + remainingTime + " segundos)");
        System.out.println("Sistema retomou operação normal");
    }

    static void showStatus() {
        String nextState = getNextState();

        System.out.println("Estado: " + currentState);
        System.out.println("Tempo restante: " + remainingTime + " segundos");
        System.out.println("Próximo estado: " + nextState);
        System.out.println("Modo: " + (maintenanceMode ? "MANUTENÇÃO" : "NORMAL"));
        System.out.println("Ciclo atual: " + cycleCount);
    }

    static String getNextState() {
        switch (currentState) {
            case "VERDE":
                return "AMARELO";
            case "AMARELO":
                return "VERMELHO";
            case "VERMELHO":
                return "VERDE";
            case "PISCA_AMARELO":
                return "N/A (manutenção)";
            default:
                return "DESCONHECIDO";
        }
    }
}