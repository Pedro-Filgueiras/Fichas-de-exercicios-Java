package Ficha_03;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String object = "";

        while (!object.equals("Parar")) {
            System.out.print("Digite um objeto para colocar na gelatina: ");
            object = scanner.nextLine();

            if (!object.equals("Parar")) {
                count++;
            }
        }
        
        System.out.println("Total de objetos colocados na gelatina: " + count);

        scanner.close();
    }
}
