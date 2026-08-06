package Questionário_100Questões;

public class Exercicio46 {
    public static void main(String[] args) {
        
        int[] data = {1, 2, 3, 4, 5};

        System.out.print("Array Original: ");
        for (int i = 0; i < data.length; i++) {
            
            if (i == 0) {
                System.out.printf("[%d, ", data[i]);
            }
            else if (i != data.length - 1) {
                System.out.printf("%d, ", data[i]);
            } else {
                System.out.printf("%d]\n", data[i]);
            }
        }

        System.out.print("Array invertido: ");
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == data.length - 1) {
                System.out.printf("[%d, ", data[i]);
            } else if (i != 0) {
                System.out.printf("%d, ", data[i]);
            } else {
                System.out.printf("%d]\n", data[i]);
            }
        }
    }
}
