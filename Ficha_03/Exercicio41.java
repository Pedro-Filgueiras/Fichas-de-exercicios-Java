package Ficha_03;

public class Exercicio41 {
    public static void main(String[] args) {
        
        int trip = 10;

        for (int distance = 1; distance <= trip; distance++) {
            if (distance % 2 == 0) {
                System.out.println("A gente já chegou?");
            }
            if (distance == trip) {
                System.out.println("SIM!");
            }

        }
    }
}
