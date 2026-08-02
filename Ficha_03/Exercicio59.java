package Ficha_03;

import java.util.Scanner;

public class Exercicio59 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int whipDistance = 5;
        int distance = 0;
        char response = '\0';
        boolean walkDecision = true;
        int walkDistance = 0;
        
        System.out.print("Qual a distância do inimigo? ");
        distance = scanner.nextInt();
        scanner.nextLine();
        
        if (distance <= whipDistance) {
            System.out.print("Ataque efetuado");
        } else {
            while (walkDecision) {
                System.out.println("Você não está próximo o suficiente do inimigo.");
                System.out.print("Gostaria de se aproximar? (s/n)");
                response = scanner.nextLine().charAt(0);
                
                if (response == 'n' || response == 'N') {
                    walkDecision = false;
                    System.out.println("Você escolheu desistir de se aproximar.");
                } else if (response != 's' && response != 'S') {
                    System.out.println("Essa opção não existe. Tente Novamente!");
                } else {
                    System.out.println("Você escolheu andar.");
                    System.out.print("Quantos metros gostaria de andar? ");
                    walkDistance = scanner.nextInt();
                    scanner.nextLine();
                    distance -= walkDistance;
                    if (distance <= whipDistance) {
                        System.out.println("Agora você conseguiu atacar!");
                        break;
                    }
                }
            }
        }   
        scanner.close();
    }
}