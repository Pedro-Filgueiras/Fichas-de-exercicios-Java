package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio61 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(18);
        numbers.add(23);
        numbers.add(4);
        numbers.add(15);
        numbers.add(30);
        numbers.add(9);
        numbers.add(6);

        System.out.println("Lista original: " + numbers);
        System.out.println();
        System.out.println("Removendo números pares...");

        String removedString = "";
        int removedCount = 0;

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();

            if (current % 2 == 0) {
                if (removedString.isEmpty()) {
                    removedString += current;
                } else {
                    removedString += ", " + current;
                }
                removedCount++;
                iterator.remove();
            }
        }

        System.out.println("Números removidos: " + removedString);
        System.out.println();
        System.out.println("Lista final: " + numbers);
        System.out.println("Elementos removidos: " + removedCount);
    }
}