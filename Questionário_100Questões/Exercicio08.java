package Questionário_100Questões;

public class Exercicio08 {
    public static void main(String[] args) {
        
        String name = "Sasuke";

        char firstLetter = name.charAt(0);

        int codigoASCII = (int) firstLetter;

        System.out.println("Primeira letra: " + firstLetter);
        System.out.println("Código ASCII: " + codigoASCII);
    }
}
