package Questionário_100Questões;

public class Exercicio75 {
    public static void main(String[] args) {

        String texto = "naruto UZUMAKI";

        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("Maiúscula: \"" + texto.toUpperCase() + "\"");
        System.out.println("Minúscula: \"" + texto.toLowerCase() + "\"");

        String[] palavras = texto.toLowerCase().split(" ");
        String capitalizada = "";

        for (int i = 0; i < palavras.length; i++) {
            capitalizada += Character.toUpperCase(palavras[i].charAt(0))
                    + palavras[i].substring(1);

            if (i < palavras.length - 1) {
                capitalizada += " ";
            }
        }

        System.out.println("Capitalizada: \"" + capitalizada + "\"");
    }
}