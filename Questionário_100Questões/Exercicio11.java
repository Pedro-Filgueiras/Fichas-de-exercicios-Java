package Questionário_100Questões;

public class Exercicio11 {
    public static void main(String[] args) {
        
        byte value = 125;
        boolean overflow = false;

        System.out.println("Valor inicial: " + value);
        for (int i = 0; i < 3; i++) {
            value += 5;
            if (value < 0 && overflow == false) {
                System.out.printf("Após +5: 130 (overflow! Resultado : %d)\n", value);
                overflow = true;
            } else {
                System.out.println("Após +5:" + value);
            }
        }
        System.out.println("Valor final: " + value);
    }
}
