package Ficha_03;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nameStation = { "Guararapes", "Boa Vista", "Zumbi", "Getúlio Vargas", "Jaqueira" };
        boolean travelling = true;
        char response = '\n';
        int i = 0;

        while (travelling) {
            
            System.out.printf("Estação Atual: %s\n", nameStation[i]);
            System.out.print("Avançar estação? (s/n) ");
            response = scanner.nextLine().charAt(0);

            if (response == 's') {
                if (i < nameStation.length - 1) {
                    i++;
                } else {
                    i = 0;
                }
            } else {
                travelling = false;
            }
        }
        scanner.close();
    }
}
