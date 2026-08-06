package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpfString = scanner.nextLine();
        
        if (cpfString.length() != 11) {
            System.out.println("Isso não é um CPF!!!");
        } else {
            int countRepeated = 0;
            for (int i = 0; i < cpfString.length(); i++) {
                char defaultNumber = cpfString.charAt(0);
                if (defaultNumber == cpfString.charAt(i)) {
                    countRepeated ++;
                }
            }
            if (countRepeated == 11) {
                System.out.println("CPF INVÁLIDO, TODOS OS DÍGITOS IGUAIS");
            }
            else {
                String cpfFirstPart = cpfString.substring(0, 3);
                String cpfSecondPart = cpfString.substring(3, 6);
                String cpfThirdPart = cpfString.substring(6, 9);
                String cpfLastPart = cpfString.substring(9);
                
                System.out.printf("CPF: %s.%s.%s-%s", cpfFirstPart, cpfSecondPart, cpfThirdPart, cpfLastPart);
                System.out.println("Formato válido (verificação básica)");

            }
        }
        scanner.close();
    }
}
