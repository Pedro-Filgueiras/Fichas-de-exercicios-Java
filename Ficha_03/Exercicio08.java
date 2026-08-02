package Ficha_03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] tasks = {"Fios", "Lixo", "Scan", "Reator"};

        for (String task : tasks) {
            System.out.print("Aperte Enter para completar cada tarefa ");
            scanner.nextLine();
            System.out.printf("Tarefa: %s completa\n", task);
            System.out.println();
        }
        scanner.close();
    }
}
