package Ficha_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean usandoAplicacao = true;
        ArrayList<String> quests = new ArrayList<>();

        do {
            System.out.println("Bem-vindo ao sistema de gerenciamento de missões, qual função gostaria de executar?");
            System.out.println("1 - Cadastrar\n2 - Listar\n3 - Sair");
            int response = scanner.nextInt();
            scanner.nextLine();

            if (response == 1) {
                System.out.println("Qual o nome da missão? ");
                String questName = scanner.nextLine();
                quests.add(questName);
                if (quests.size() > 3) {
                    break;
                }
            } else if (response == 2) {
                System.out.println("Lista de missões: ");
                for (int i = 0; i < quests.size(); i++) {
                    System.out.println((i + 1) + ") " + quests.get(i));
                }
            } else if (response == 3) {
                break;
            } else {
                System.out.println("Opção Inválida");
            }
        } while (usandoAplicacao);
        scanner.close();
    }
}
