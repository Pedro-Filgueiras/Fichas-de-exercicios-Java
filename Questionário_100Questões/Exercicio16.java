package Questionário_100Questões;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Idade: ");
        int age = scanner.nextInt();
        System.out.print("Salário: ");
        float salary = scanner.nextFloat();

        System.out.println("===============================");
        System.out.println("        FICHA FUNCIONÁRIO");
        System.out.println("===============================");
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Idade: %d\n", age);
        System.out.printf("Salário: R$ %.2f\n", salary);
        System.out.println("===============================");

        scanner.close();
    }
}
