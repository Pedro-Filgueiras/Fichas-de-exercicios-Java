package Questionário_100Questões;

public class Exercicio87 {
    public static void main(String[] args) {

        System.out.println("Testando método largestNumber():");

        printResult(5, 8);
        printResult(12, 7);
        printResult(15, 15);
    }

    public static int largestNumber(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    static void printResult(int a, int b) {
        int result = largestNumber(a, b);

        if (a == b) {
            System.out.println("Maior entre " + a + " e " + b + ": " + result + " (números iguais)");
        } else {
            System.out.println("Maior entre " + a + " e " + b + ": " + result);
        }
    }
}