package Ficha_03;

public class Exercicio07 {
    public static void main(String[] args) {
        
        int[] integerVector = new int[10];

        for (int i = 0; i < integerVector.length; i++) {
            
            if (i % 2 == 0) {
                integerVector[i] = 0;
            } else {
                integerVector[i] = 1;
            }
        }

        for (int i : integerVector) {
            System.out.print(i);
        }
    }
}
