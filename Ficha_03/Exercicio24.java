package Ficha_03;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] jediList = new String[5];
        
        System.out.println("Preencha os assentos do meio 1, 2 e 3");
        for (int i = 0; i < jediList.length; i++) {
            if (i == 0) {
                jediList[i] = "Yoda";
            } else if (i == 4) {
                jediList[i] = "Mace Windu";
            } else {
                System.out.printf("%d: " , i);
                jediList[i] = scanner.nextLine();
            }
        }

        for (String jedi : jediList) {
            System.out.printf("%s, ", jedi);
        }
        scanner.close();
    }
}
