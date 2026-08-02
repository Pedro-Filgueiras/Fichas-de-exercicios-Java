package Ficha_03;

public class Exercicio50 {
    public static void main(String[] args) {
        
        int[] numbers = {1,4,32,4,54,322,13,32,54,231,455,1454,543,543,23445,435,4,6,76,563,2314,543,69};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Dado Corrompido");
            } else {
                System.out.println("Dado Seguro");
            }
        }
    }
}