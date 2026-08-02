package Ficha_03;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int heroLife = 100;
        int monsterLife = 100;
        int damage = 0;
        boolean monsterDeath = false;
        boolean heroDeath = false;

        while (heroLife > 0 && monsterLife > 0) {
            System.out.print("Quanto de dano você deu no monstro??? ");
            damage = scanner.nextInt();
            monsterLife -= damage;
            if (monsterLife == 0) {
                monsterDeath = true;
            }
            System.out.printf("Vida atual do monstro: %d\n", monsterLife);

            System.out.print("Quanto de dano você levou??? ");
            damage = scanner.nextInt();
            heroLife -= damage;
            if (heroLife == 0) {
                heroDeath = true;
            }
            System.out.printf("Sua vida atual: %d\n", heroLife);
        }

        if (monsterDeath && !heroDeath) {
            System.out.println("O monstro morreu!");
        } else if (heroDeath || !monsterDeath) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Os dois morreram!");
        }

        scanner.close();
    }
}
