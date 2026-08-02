package Ficha_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        boolean addingNames = true;
        
        while (addingNames) {
            System.out.print("Diga o nome do tripulante que quer adicionar: ");
            nameList.add(scanner.nextLine());

            boolean choicing = true;

            while (choicing) {
                System.out.println("Deseja continuar adicionando? (s/n)");
                char response = scanner.nextLine().charAt(0);
                if (response == 'n') {
                    addingNames = false;
                    choicing = false;
                } else if (response != 's') {
                    System.out.println("Opção inválida!");
                } else {
                    choicing = false;
                }
            }

            
        }


        scanner.close();
    }
}
