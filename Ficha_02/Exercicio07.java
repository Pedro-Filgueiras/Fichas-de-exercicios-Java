package Ficha_02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String senha = "SapoGama";

        System.out.println("Qual a senha?");
        String testeSenha = scanner.nextLine();

        if (testeSenha.equals(senha)){
            System.out.println("Acesso ao Monte Myoboku");
        } else {
            System.out.println("Acesso Negado");
        }

    }
}
