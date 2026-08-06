package Questionário_100Questões;

public class Exercicio05 {
    public static void main(String[] args) {
        
        float[] grades = {8.5f, 7.0f, 9.2f, 6.8f};
        float sum = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("nota %d: %.2f\n", (i+1), grades[i]);
            sum += grades[i];
        }

        float average = sum / grades.length;

        System.out.printf("Média: %.2f", average);
    }
}