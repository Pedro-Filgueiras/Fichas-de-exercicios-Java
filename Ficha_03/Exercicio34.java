package Ficha_03;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] nameList = new String[5];
        
        for (int i = 0; i < nameList.length; i++) {
            System.out.print("Digite os nome: ");
            nameList[i] = scanner.nextLine();
        }

        for (String name : nameList) {

            System.out.println("Eliminado: " + name);
        }

        scanner.close();
    }
}
