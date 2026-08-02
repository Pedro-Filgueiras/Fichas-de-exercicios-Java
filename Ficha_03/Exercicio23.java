package Ficha_03;

public class Exercicio23 {
    public static void main(String[] args) {

        int randomNumber = 0;

        while (randomNumber <= 8) {
            
            randomNumber = (int) ((Math.random() * 10) + 1);
            System.out.println("Você jogou uma pokebola!");
            if (randomNumber > 8) {
                System.out.println("O Pokémon foi capturado! ");
            } else {
                System.out.println("O Pokémon escapou, tente de novo");
            }
            System.out.println();
        }
    }
}
