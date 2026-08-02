package Ficha_03;

public class Exercicio12 {
    public static void main(String[] args) {

        String[] names = {"Uchiha", "Hyuga", "Uzumaki", "Nara", "Inuzuka"};

        for (String name : names) {
            if (name == "Uchiha") {
                System.out.println("Alerta: Sharingan!");
            }
            System.out.println(name);
            System.out.println();
        }
    }
}
