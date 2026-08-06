package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java");

        System.out.println("Lista: " + list);
        System.out.print("Digite o elemento a buscar: ");
        String target = scanner.nextLine();

        System.out.println();
        System.out.printf("Buscando \"%s\" na lista...%n", target);

        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                positions.add(i);
            }
        }

        if (positions.isEmpty()) {
            System.out.println("Elemento não encontrado");
        } else {
            String positionsString = "";
            for (int i = 0; i < positions.size(); i++) {
                if (i == 0) {
                    positionsString += positions.get(i);
                } else {
                    positionsString += ", " + positions.get(i);
                }
            }

            System.out.println("Elemento encontrado nas posições: " + positionsString);
            System.out.println("Total de ocorrências: " + positions.size());
        }

        scanner.close();
    }
}