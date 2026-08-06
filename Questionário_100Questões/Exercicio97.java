package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio97 {

    static class Ninja {
        String name;
        int age;
        String rank;

        Ninja(String name, int age, String rank) {
            this.name = name;
            this.age = age;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return name + " (idade " + age + ", rank " + rank + ")";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Ninja> ninjas = new ArrayList<>();
        int option = -1;

        System.out.println("=== SISTEMA DE GERENCIAMENTO NINJA ===");

        while (option != 0) {
            System.out.println();
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Buscar Ninja");
            System.out.println("4 - Atribuir Missão");
            System.out.println("5 - Relatórios");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Digite sua opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opção inválida!");
                continue;
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("=== CADASTRAR NOVO NINJA ===");
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Idade: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rank: ");
                    String rank = scanner.nextLine();

                    ninjas.add(new Ninja(name, age, rank));
                    System.out.println("Ninja cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("=== LISTA DE NINJAS ===");
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (int i = 0; i < ninjas.size(); i++) {
                            System.out.println((i + 1) + ". " + ninjas.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Digite o nome do ninja a buscar: ");
                    String searchName = scanner.nextLine();

                    boolean found = false;
                    for (Ninja ninja : ninjas) {
                        if (ninja.name.equalsIgnoreCase(searchName)) {
                            System.out.println("Ninja encontrado: " + ninja);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ninja não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("=== ATRIBUIR MISSÃO ===");
                    System.out.println("Funcionalidade em desenvolvimento.");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("=== RELATÓRIOS ===");
                    System.out.println("Total de ninjas cadastrados: " + ninjas.size());
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (option != 0) {
                System.out.println();
                System.out.print("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}