package Ficha_02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean continuarComendo = true;
        int contador = 0;

        do {
            System.out.println("Naruto come Ramen");
            System.out.println("Quer mais uma tigela? (s/n)");
            String decisao = scanner.nextLine();
            if (!decisao.equals("s")) {
                continuarComendo =false;
            }
            contador +=1;
        } while (continuarComendo);

        System.out.println("Total comido: " + contador);

        scanner.close();
    }
}
