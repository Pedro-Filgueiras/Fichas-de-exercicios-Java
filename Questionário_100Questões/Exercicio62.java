package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> candidates = new ArrayList<>();
        candidates.add("João");
        candidates.add("Maria");
        candidates.add("Pedro");

        ArrayList<Integer> votes = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }

        int option = -1;

        System.out.println("=== SISTEMA DE VOTAÇÃO ===");
        System.out.println("Candidatos:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + " - " + candidates.get(i));
        }
        System.out.println("0 - Encerrar votação");
        System.out.println();

        while (option != 0) {
            System.out.print("Voto: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                continue;
            }

            option = scanner.nextInt();

            if (option == 0) {
                break;
            }

            if (option >= 1 && option <= candidates.size()) {
                int currentVotes = votes.get(option - 1);
                votes.set(option - 1, currentVotes + 1);
            } else {
                System.out.println("Candidato inválido!");
            }
        }

        int totalVotes = 0;
        for (int v : votes) {
            totalVotes += v;
        }

        System.out.println();
        System.out.println("=== RESULTADO DA VOTAÇÃO ===");

        int maxVotes = -1;
        int winnerIndex = -1;
        boolean tie = false;

        for (int i = 0; i < candidates.size(); i++) {
            int candidateVotes = votes.get(i);
            double percentage = totalVotes == 0 ? 0.0 : (candidateVotes * 100.0) / totalVotes;
            String voteWord = candidateVotes == 1 ? "voto" : "votos";

            System.out.printf("%s: %d %s (%.2f%%)%n", candidates.get(i), candidateVotes, voteWord, percentage);

            if (candidateVotes > maxVotes) {
                maxVotes = candidateVotes;
                winnerIndex = i;
                tie = false;
            } else if (candidateVotes == maxVotes) {
                tie = true;
            }
        }

        System.out.println();
        System.out.println("Total de votos: " + totalVotes);

        if (totalVotes == 0) {
            System.out.println("Nenhum voto registrado.");
        } else if (tie) {
            System.out.println("Resultado: Empate!");
        } else {
            System.out.println("Vencedor: " + candidates.get(winnerIndex));
        }

        scanner.close();
    }
}