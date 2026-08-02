package Ficha_03;

public class Exercicio32 {
    public static void main(String[] args) {
        
        int[] gunMagazine = {12, 0, 15, 0, 8};

        for (int i = 0; i < gunMagazine.length; i++) {
            if (gunMagazine[i] == 0) {
                System.out.printf("Pente vazio no índice [%d]! Recarregar!\n", i);
            }
        }

    }
}
