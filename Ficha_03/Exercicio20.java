package Ficha_03;

public class Exercicio20 {
    public static void main(String[] args) {
        
        String[] plates = {"Pizza", "Lasanha", "Parmegiana", "Hamburguer", "Açaí"};
        int index = 0;


        for (String plate : plates) {
            System.out.printf("Item #%d: %s\n", (index+1), plate);
            index++;
        }
    }
}
