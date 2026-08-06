package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int option = -1;

        while (option != 0) {
            System.out.println("=== SISTEMA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                System.out.println();
                continue;
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("=== SUAS TAREFAS ===");
                    if (tasks.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println("Total: " + tasks.size() + " tarefa(s)");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.print("Digite a tarefa a remover: ");
                        String taskToRemove = scanner.nextLine();
                        boolean removed = tasks.remove(taskToRemove);
                        if (removed) {
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Tarefa não encontrada.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}