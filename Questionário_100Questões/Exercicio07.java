package Questionário_100Questões;

import java.util.Locale;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        int dividend = 10; int divisor = 3;
        int resultInt = dividend/divisor;
        
        System.out.printf("Divisão com int: %d / %d = %d\n", dividend, divisor, resultInt);

        double resultDouble = (double) dividend / (double) divisor;

        System.out.printf("Divisão com double: %.1f / %.1f = %.16f\n", (float)dividend, (float)divisor, resultDouble);
    }
}
