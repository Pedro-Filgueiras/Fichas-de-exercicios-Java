package Questionário_100Questões;

public class Exercicio74 {
    public static void main(String[] args) {

        String texto = "O ninja nunca desiste.\nEle sempre encontra um caminho.";

        System.out.println("Texto:");
        System.out.println("\"" + texto + "\"");

        int caracteres = texto.length();
        int caracteresSemEspacos = texto.replace(" ", "").replace("\n", "").length();
        int palavras = texto.trim().split("\\s+").length;
        int linhas = texto.split("\n").length;

        System.out.println("\nEstatísticas:");
        System.out.println("Caracteres: " + caracteres);
        System.out.println("Caracteres (sem espaços): " + caracteresSemEspacos);
        System.out.println("Palavras: " + palavras);
        System.out.println("Linhas: " + linhas);
    }
}