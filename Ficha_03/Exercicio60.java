package Ficha_03;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"Quanto é 5 ao cubo?", "47 é um número primo?", "Qual o valor de pi até a 2ª casa decimal?"};
        String[] answers = {"125", "sim", "3,14"};
        String response = "";
        int correctAnswer = 0;

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.print("Sua resposta: ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals(answers[i])) {
                correctAnswer += 1;
            }
        }

        System.out.println("Seu total de pontos foi: " + correctAnswer + " questões.");

        scanner.close();
    }
}
