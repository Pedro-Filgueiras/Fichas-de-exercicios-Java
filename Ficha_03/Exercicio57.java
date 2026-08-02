package Ficha_03;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] items = { 20, 5, 3 };
        String[] nameItem = {"Pokébolas", "Poções", "Revives"};

        int response = -1;
        boolean playing = true;

        while (playing) {

            System.out.println("Você gostaria de usar que item?");
            for (int i = 0; i < nameItem.length; i++) {
                System.out.printf("%d - %s\n", i, nameItem[i]);
            }

            System.out.print("Sua escolha: ");
            response = scanner.nextInt();

            if (response < 0 || response > items.length) {
                System.out.println("Opção inválida!");
            }

            if (items[response] == 0) {
                System.out.printf("Você não tem mais %s.", nameItem[response]);
            }

            System.out.printf("Você usou %s.", nameItem[response]);
            items[response]--;

            System.out.printf("Quantidade restante: %d\n", items[response]);
        }
        scanner.close();
    }
}
