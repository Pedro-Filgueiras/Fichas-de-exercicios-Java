package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio59 {
    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(45);
        original.add(23);
        original.add(67);
        original.add(12);
        original.add(89);
        original.add(34);

        System.out.println("Lista original: " + original);
        System.out.println();

        ArrayList<Integer> ascending = new ArrayList<>(original);
        Collections.sort(ascending);

        ArrayList<Integer> descending = new ArrayList<>(original);
        Collections.sort(descending);
        Collections.reverse(descending);

        System.out.println("Ordem crescente: " + ascending);
        System.out.println("Ordem decrescente: " + descending);
    }
}