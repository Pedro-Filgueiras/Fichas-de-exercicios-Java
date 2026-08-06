package Questionário_100Questões;

import java.util.ArrayList;

public class Exercicio54 {
    public static void main(String[] args) {

        ArrayList<String> ninjas = new ArrayList<>();

        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Hinata");

        System.out.println("=== LISTA DE NINJAS ===");

        int count = 1;
        for (String ninja : ninjas) {
            System.out.println(count + ". " + ninja);
            count++;
        }

        System.out.println();
        System.out.println("Total de ninjas: " + ninjas.size());
    }
}