package Questionário_100Questões;

import java.util.ArrayList;

public class Exercicio56 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(23);
        numbers.add(8);
        numbers.add(42);
        numbers.add(17);
        numbers.add(31);

        System.out.println("Lista de números: " + numbers);
        System.out.println("Calculando soma...");

        int total = 0;
        String calculation = "";

        for (int number : numbers) {
            total += number;

            if (calculation.isEmpty()) {
                calculation += number;
            } else {
                calculation += " + " + number;
            }
        }

        System.out.println(calculation + " = " + total);
        System.out.println("Soma total: " + total);
    }
}