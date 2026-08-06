package Questionário_100Questões;

public class Exercicio04 {
    public static void main(String[] args) {
        
        int[] numbersList = {23, 67, 45};
        int highestNumber = 0;

        for (int i = 0; i < numbersList.length; i++) {
            if (highestNumber < numbersList[i]) {
                highestNumber = numbersList[i];
            }
        }

        System.out.printf("O maior número é: %d", highestNumber);
    }
}
