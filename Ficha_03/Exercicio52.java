package Ficha_03;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] zombiesLife = {27,38,43,39,72};
        int damage = 0;
        int result = 0;

        for (int i = 0; i < zombiesLife.length; i++){
            System.out.print("Quanto de dano seu ataque causou? ");
            damage = scanner.nextInt();
            result = zombiesLife[i] - damage;
            if (result > 0) {
                System.out.println("O Zumbi está vivo");
            } else {
                System.out.println("O Zumbi morreu");
            }
        }

        scanner.close();
    }
}