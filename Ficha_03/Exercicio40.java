package Ficha_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listMutants = new ArrayList<>();

        System.out.println("Criando vetor nomes!");
        
        char choice = '\0';
        String response = "";
        do {
            System.out.print("Insira um nome para o seu vetor: ");
            response = scanner.nextLine();
            listMutants.add(response);
            System.out.println("Nome adicionado com sucesso!\nGostaria de continuar adicionando? (s/n)");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 's' || choice == 'n');

        for (String name : listMutants) {
            if (name.equals("Jean Grey") || name.equals("Magneto") ) {
                System.out.printf("%s: Nível Ômega Detectado!\n", name);
            } else {
                System.out.println(name);
            }
        }
        scanner.close();
    }
}
