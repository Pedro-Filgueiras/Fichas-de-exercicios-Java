package Ficha_03;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] items = {null, null, null, null, null};
        int response = 0;
        boolean openMenu = true;


        while (openMenu) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Adicionar item\n2 - Sair");
            response = scanner.nextInt();
            scanner.nextLine();
            switch (response) {
                case 1:
                    System.out.print("Você escolheu adicionar item. Qual item gostaria de adicionar? ");
                    boolean addItem = false;

                    for (int i = 0; i < items.length; i++) {
                        if (items[i] == null) {
                            items[i] = scanner.nextLine();
                            System.out.printf("O item %s foi adicionado no inventário e seu index é %d.\n", items[i], i);
                            addItem = true;
                            break;
                        }
                    }

                    if (!addItem) {
                        System.out.println("O inventário está lotado!");
                    }
                    break;
            
                case 2:
                    System.out.println("Você escolheu sair. Até mais!");
                    openMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}