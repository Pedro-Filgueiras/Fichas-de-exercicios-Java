package Questionário_100Questões;

public class Exercicio77 {
    public static void main(String[] args) {

        String texto = "Sasuke Uchiha";
        String invertida = "";

        System.out.println("String original: \"" + texto + "\"");

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("String invertida: \"" + invertida + "\"");

        System.out.println("\nProcesso:");

        int limite = Math.min(5, texto.length());

        for (int i = 0; i < limite; i++) {
            System.out.println(texto.charAt(i) + " → " + invertida.charAt(i));
        }

        if (texto.length() > limite) {
            System.out.println("...");
        }
    }
}