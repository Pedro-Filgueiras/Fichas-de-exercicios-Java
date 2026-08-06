package Questionário_100Questões;

public class Exercicio12 {
    public static void main(String[] args) {
        
        double value = 9.8765;

        System.out.println("Valor original (double): " + value);
        System.out.println("Valor após o casting (int): " + (int) value );
        System.out.printf("Precisão perdida: %.4f", (value - (int) value));


    }
}
