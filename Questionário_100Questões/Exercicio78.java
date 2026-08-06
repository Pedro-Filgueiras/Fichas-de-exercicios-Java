package Questionário_100Questões;

public class Exercicio78 {
    public static void main(String[] args) {

        String texto = "Naruto Uzumaki";

        int[] frequencia = new int[26];
        int totalLetras = 0;

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (Character.isLetter(letra)) {
                frequencia[letra - 'A']++;
                totalLetras++;
            }

        }

        System.out.println("Texto: \"" + texto + "\"\n");
        System.out.println("Contagem de letras (case-insensitive):");

        for (int i = 0; i < frequencia.length; i++) {

            if (frequencia[i] > 0) {
                System.out.println((char) ('A' + i) + ": " + frequencia[i] + " vez(es)");
            }

        }

        System.out.println("\nTotal de letras: " + totalLetras);
    }
}