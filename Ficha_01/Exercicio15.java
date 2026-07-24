public class Exercicio15 {
    public static void main(String[] args) {
        int copoA = 5;
        int copoB = 10;

        System.out.printf("Valores: A = %d e B = %d\n", copoA, copoB);

        int copoVazio = copoA;

        copoA = copoB;

        copoB = copoVazio;

        System.out.printf("Valores: A = %d e B = %d\n", copoA, copoB);
    }
}
