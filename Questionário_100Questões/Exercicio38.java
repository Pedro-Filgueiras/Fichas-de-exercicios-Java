package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        ArrayList<Integer> numbersArray = new ArrayList<>();
        int lastDigit = 0;
        int sumNumbers = 0;

        System.out.println("Número: " + number);
        System.out.print("Digitos: ");
        while (number > 0) {    
            lastDigit = number % 10; // Pega o último digito cada vez que executa o While
            numbersArray.add(lastDigit); // Adiciona ao array esse último digito
            sumNumbers += lastDigit; // Soma ao total esse último digito
            number /= 10; // Remove a casa decimal
        }
        for (int i = numbersArray.size() - 1; i >= 0; i--) { // Para cada um dos números a lista
            
            if (i > 0) { // Se o índice for maior que 0
                System.out.printf(" %d +", numbersArray.get(i));
            } else {
                System.out.printf(" %d\n", numbersArray.get(i));
            }
        }
        System.out.println("Soma dos dígitos: " + sumNumbers);

        scanner.close();
    }
}