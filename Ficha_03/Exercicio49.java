package Ficha_03;

import java.util.Random;

public class Exercicio49 {
    public static void main(String[] args) {
        
        Random random = new Random();

        char randomChar = '\n';
        char[] totalRandom = new char[16];
        String wordCompleted = "";
        
        for (int i = 0; i < totalRandom.length; i++) {
            randomChar = (char) ('a' + random.nextInt(26));
            totalRandom[i] = randomChar;
        }

        for (char character : totalRandom) {
            wordCompleted += character;
        }

        System.out.println(wordCompleted);
    }
}
