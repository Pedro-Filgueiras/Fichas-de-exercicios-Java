package Ficha_03;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] districts = {"Pernambuco", "Bahia", "São Paulo", "Rio de Janeiro", "Amazonas", "Acre", "Paraná", "Santa Catarina", "Mato Grosso", "Goiás", "Sergipe", "Paraíba"};

        System.out.print("Digite um numero de 1 a 12: ");
        int response = scanner.nextInt();

        if (response >= 1 && response <=12) {
            System.out.printf("Distrito de número[%d]: %s", response, districts[response-1]);
        } else {
            System.out.println("Número inválido!");
        }



        scanner.close();
    }
}
