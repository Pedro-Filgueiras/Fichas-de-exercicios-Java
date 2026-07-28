package Ficha_02;

public class Exercicio21 {
    public static void main(String[] args) {
        
        int[][] matriz = {{8,2},{2,6}};

        int somaTotal = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal+= matriz[i][j];
            }
        }

        System.out.println("Soma total: " + somaTotal);

    }
}
