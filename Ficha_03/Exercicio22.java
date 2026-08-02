package Ficha_03;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] namesList = new String[10];

        int randomNumber = 0;

        for (int i = 0; i < namesList.length; i++) {
            namesList[i] = scanner.nextLine();

            randomNumber = (int) (Math.random() * 2);
            if (randomNumber == 0) {
                namesList[i] = "";
            }
        }

        for (String name : namesList) {
            System.out.printf("%s ",name);
        }
        scanner.close();
    }
}
