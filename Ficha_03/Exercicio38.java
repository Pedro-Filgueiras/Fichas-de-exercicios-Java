package Ficha_03;

public class Exercicio38 {
    public static void main(String[] args) {
        
        int[] rupees = {1, 5, 20, 100, 5};

        for (int i = 0; i < rupees.length; i++) {
            if (rupees[i] == 100) {
                System.out.println("Achou a Rupee Dourada!");
                break;
            }
        }

    }
}
