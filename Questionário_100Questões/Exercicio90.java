package Questionário_100Questões;

public class Exercicio90 {
    public static void main(String[] args) {

        System.out.println("=== MÉTODOS RECURSIVOS ===");
        System.out.println();

        System.out.println("Fatorial recursivo de 5:");
        printFactorialExpansion(5);
        int factorialResult = recursiveFactorial(5);
        System.out.println("= " + factorialResult);

        System.out.println();
        System.out.println("Fibonacci recursivo (8º termo):");
        int fibResult = recursiveFibonacci(8);
        System.out.println("fibonacciRecursivo(8) = " + fibResult);

        System.out.println();
        System.out.println("Comparação de performance:");

        long start = System.nanoTime();
        int iterFactorial = iterativeFactorial(5);
        long end = System.nanoTime();
        System.out.printf("Fatorial iterativo(5): %d (%d ms)%n", iterFactorial, (end - start) / 1000000);

        start = System.nanoTime();
        int recFactorial = recursiveFactorial(5);
        end = System.nanoTime();
        System.out.printf("Fatorial recursivo(5): %d (%d ms)%n", recFactorial, (end - start) / 1000000);

        start = System.nanoTime();
        int iterFib = iterativeFibonacci(8);
        end = System.nanoTime();
        System.out.printf("Fibonacci iterativo(8): %d (%d ms)%n", iterFib, (end - start) / 1000000);

        start = System.nanoTime();
        int recFib = recursiveFibonacci(8);
        end = System.nanoTime();
        System.out.printf("Fibonacci recursivo(8): %d (%d ms)%n", recFib, (end - start) / 1000000);
    }

    public static int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int previous = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    static void printFactorialExpansion(int n) {
        StringBuilder line1 = new StringBuilder("fatorialRecursivo(" + n + ")");
        System.out.println(line1);

        StringBuilder expansion = new StringBuilder("= ");
        for (int i = n; i >= 1; i--) {
            expansion.append(i);
            if (i > 1) {
                if (i > 2) {
                    expansion.append(" × fatorialRecursivo(").append(i - 1).append(")");
                    System.out.println(expansion);
                    expansion = new StringBuilder("= ");
                    for (int j = n; j >= i; j--) {
                        expansion.append(j).append(" × ");
                    }
                } else {
                    expansion.append(" × ");
                }
            }
        }
        System.out.println(expansion);
    }
}