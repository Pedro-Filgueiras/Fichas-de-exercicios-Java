package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUser = "admin";
        int correctPassword = 123456;

        int attempts = 0;

        while (attempts < 3) {
            
            System.out.print("Usuário: ");
            String user = scanner.nextLine();
            System.out.print("Senha: ");
            int password = scanner.nextInt();
            scanner.nextLine();

            if (user.equals(correctUser) && password == correctPassword) {
                System.out.println("Login Realizado com sucesso!");
                System.out.println("Bem-vindo, admin!");
                break;
            } else {
                attempts++;
                System.out.printf("Tentativa %d falhou!\n", attempts);
            }

            if (attempts == 3) {
                System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
            }
        }



        scanner.close();
    }
}
