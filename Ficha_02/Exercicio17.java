package Ficha_02;

public class Exercicio17 {
    public static void main(String[] args) {
        
        int[] vetor = { 80, 50, 95, 20, 100 };

        int maiorChakra = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maiorChakra) {
                maiorChakra = vetor[i];
            }
        }

        System.out.println("Maior Chakra: " + maiorChakra);
    }
}