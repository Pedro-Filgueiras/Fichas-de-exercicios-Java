package Ficha_02;

public class Exercicio28 {
    public static void main(String[] args) {
        
        String names = "Naruto-Sasuke-Sakura";

        String[] listNames = names.split("-");

        for (String name : listNames){
            System.out.println(name);
        }

        
    }
}
