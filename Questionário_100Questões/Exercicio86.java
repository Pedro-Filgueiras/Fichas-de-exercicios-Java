package Questionário_100Questões;

public class Exercicio86 {
    public static void main(String[] args) {

        int[] tests = {4, 7, 0, -6};

        System.out.println("Testando método isEven():");

        for (int number : tests) {
            System.out.println(number + " é par? " + isEven(number));
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}