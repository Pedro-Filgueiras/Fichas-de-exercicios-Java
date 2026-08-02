package Ficha_02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean temConvite = false;
        boolean eDaAldeia = false;
        boolean podeEntrar = false;

        System.out.println("Você tem convite? ");
        String convite = scanner.nextLine();
        if (convite.equals("sim")){
            temConvite = true;
        }

        System.out.println("Você é da aldeia da folha? ");
        String aldeia = scanner.nextLine();
        if (aldeia.equals("sim")){
            eDaAldeia = true;
        }

        if (temConvite && eDaAldeia) {
            podeEntrar = true;
        }

        if (podeEntrar) {
            System.out.println("Entrada liberada");
        } else {
            System.out.println("Entrada negada");
        }
        scanner.close();
    }
}
