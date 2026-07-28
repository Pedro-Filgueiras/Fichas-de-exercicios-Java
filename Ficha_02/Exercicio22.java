package Ficha_02;

public class Exercicio22 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println();
        }

    }
}
