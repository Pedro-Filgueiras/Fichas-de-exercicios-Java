package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Hinata");

        System.out.println("Lista original: " + ninjas);

        System.out.print("Digite o nome do ninja a remover: ");
        String toRemove = scanner.nextLine();

        System.out.println("Removendo: " + toRemove);

        boolean removed = ninjas.remove(toRemove);

        if (removed) {
            System.out.println("Lista atualizada: " + ninjas);
            System.out.println(toRemove + " foi removido com sucesso!");
        } else {
            System.out.println("Ninja não encontrado");
        }

        scanner.close();
    }
}