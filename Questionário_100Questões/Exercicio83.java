package Questionário_100Questões;

import java.util.ArrayList;

public class Exercicio83 {
    public static void main(String[] args) {

        String text = "A programação em Java é muito interessante!";

        System.out.println("Texto: \"" + text + "\"");
        int totalChars = text.length();
        System.out.println("Total de caracteres: " + totalChars);
        System.out.println();
        System.out.println("=== ANÁLISE DE FREQUÊNCIA ===");
        System.out.println();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Integer> letterCounts = new ArrayList<>();

        int spaceCount = 0;
        int punctuationCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        String punctuationChars = ".,;:!?-\"'()[]{}";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                char upperC = Character.toUpperCase(c);
                int index = letters.indexOf(upperC);
                if (index == -1) {
                    letters.add(upperC);
                    letterCounts.add(1);
                } else {
                    letterCounts.set(index, letterCounts.get(index) + 1);
                }
            } else if (c == ' ') {
                spaceCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (punctuationChars.indexOf(c) != -1) {
                punctuationCount++;
            } else {
                otherCount++;
            }
        }

        // Ordena letras por frequência decrescente (bubble sort)
        for (int i = 0; i < letters.size() - 1; i++) {
            for (int j = 0; j < letters.size() - 1 - i; j++) {
                if (letterCounts.get(j) < letterCounts.get(j + 1)) {
                    int tempCount = letterCounts.get(j);
                    letterCounts.set(j, letterCounts.get(j + 1));
                    letterCounts.set(j + 1, tempCount);

                    char tempLetter = letters.get(j);
                    letters.set(j, letters.get(j + 1));
                    letters.set(j + 1, tempLetter);
                }
            }
        }

        int totalLetters = 0;
        for (int count : letterCounts) {
            totalLetters += count;
        }

        double letterPercentage = (totalLetters * 100.0) / totalChars;
        System.out.printf("LETRAS (%d - %.2f%%):%n", totalLetters, letterPercentage);

        for (int i = 0; i < letters.size(); i++) {
            double pct = (letterCounts.get(i) * 100.0) / totalChars;
            System.out.printf("%c: %d (%.2f%%)  ", letters.get(i), letterCounts.get(i), pct);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        System.out.printf("ESPAÇOS: %d (%.2f%%)%n", spaceCount, (spaceCount * 100.0) / totalChars);
        System.out.printf("PONTUAÇÃO: %d (%.2f%%)%n", punctuationCount, (punctuationCount * 100.0) / totalChars);
        System.out.printf("NÚMEROS: %d (%.2f%%)%n", digitCount, (digitCount * 100.0) / totalChars);
        System.out.printf("OUTROS: %d (%.2f%%)%n", otherCount, (otherCount * 100.0) / totalChars);

        System.out.println();
        if (!letters.isEmpty()) {
            System.out.printf("Caractere mais frequente: %c (%d ocorrências)%n", letters.get(0), letterCounts.get(0));
        }
    }
}