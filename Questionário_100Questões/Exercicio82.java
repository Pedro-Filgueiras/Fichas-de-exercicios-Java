package Questionário_100Questões;

public class Exercicio82 {
    public static void main(String[] args) {

        String text = "Olá,mundo!Como;você:está?Bem...";

        System.out.println("Texto: \"" + text + "\"");
        System.out.println();

        // Divide usando regex: qualquer sequência de caracteres que NÃO seja letra
        String[] words = text.split("[^\\p{L}]+");

        System.out.println("Palavras extraídas:");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
                System.out.println(count + ". \"" + word + "\"");
            }
        }

        System.out.println();
        System.out.println("Total de palavras: " + count);
    }
}