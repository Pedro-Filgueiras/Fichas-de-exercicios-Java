package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int age = scanner.nextInt();
        String response = "";

        if (age < 0) {
            System.out.println("Idade inválida");
        } else {
            if (age < 5) {
                System.out.println("Muito jovem para competir");
            } else {
                if (age >= 5 && age <= 7) {
                    response = "Infantil";
                } else if (age >= 8 && age <= 17) {
                    response = "Juvenil";
                } else if (age >= 18 && age <= 65) {
                    response = "Adulto";
                } else {
                    response = "Sênior";
                }
                System.out.printf("Nadador de %d anos: Categoria %s\n", age, response);
            }
        }

        scanner.close();
    }
}