package Ficha_03;

public class Exercicio16 {
    public static void main(String[] args) {
        
        float[] priceGames = {59.99f, 79.99f, 99.99f, 149.99f, 64.99f };

        for (float price : priceGames) {
            price = price / 2;
            System.out.printf("New Price: %.2f\n", price);
        }
    }
}