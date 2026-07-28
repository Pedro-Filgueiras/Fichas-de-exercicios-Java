package Ficha_02;

public class Exercicio20 {
    public static void main(String[] args) {
        
        char[][] matriz = new char[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 1 && j == 1) {
                    System.out.print("X");
                } else if (i == 0 && j == 2) {
                    System.out.print("O");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
