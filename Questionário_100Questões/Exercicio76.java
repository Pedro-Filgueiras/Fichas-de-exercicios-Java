package Questionário_100Questões;

public class Exercicio76 {
    public static void main(String[] args) {

        String texto = "Konoha é a vila oculta da folha";

        String[] buscas = { "vila", "ninja", "folha" };

        int encontradas = 0;

        System.out.println("Texto: \"" + texto + "\"\n");
        System.out.println("Verificando substrings:");

        for (int i = 0; i < buscas.length; i++) {

            if (texto.toLowerCase().contains(buscas[i].toLowerCase())) {
                System.out.println("✓ \"" + buscas[i] + "\" - Encontrada");
                encontradas++;
            } else {
                System.out.println("✗ \"" + buscas[i] + "\" - Não encontrada");
            }

        }

        System.out.println("\nResumo: " + encontradas + " de " + buscas.length + " substrings encontradas");
    }
}