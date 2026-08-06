package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" - " + author;
    }
}

public class Exercicio60 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int option = -1;

        while (option != 0) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Buscar por título");
            System.out.println("3 - Listar todos");
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
                    System.out.print("Título: ");
                    String title = scanner.nextLine();
                    System.out.print("Autor: ");
                    String author = scanner.nextLine();

                    books.add(new Book(title, author));
                    System.out.println();
                    System.out.printf("Livro adicionado: \"%s\" por %s%n", title, author);
                    break;

                case 2:
                    System.out.print("Digite o título a buscar: ");
                    String searchTitle = scanner.nextLine();

                    boolean found = false;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println();
                            System.out.println("Livro encontrado: " + book);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println();
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("=== BIBLIOTECA ===");
                    if (books.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                        System.out.println("Total: " + books.size() + " livro(s)");
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