package Questionário_100Questões;

public class Exercicio80 {
    public static void main(String[] args) {

        String[] tests = {"arara", "A base do teto desaba", "Naruto"};

        for (int i = 0; i < tests.length; i++) {
            String original = tests[i];
            String cleaned = clean(original);
            String reversed = new StringBuilder(cleaned).reverse().toString();

            System.out.println("Teste " + (i + 1) + ": \"" + original + "\"");
            System.out.println("Limpo: \"" + cleaned + "\"");
            System.out.println("Invertido: \"" + reversed + "\"");

            if (cleaned.equals(reversed)) {
                System.out.println("Resultado: É palíndromo ✓");
            } else {
                System.out.println("Resultado: NÃO é palíndromo ✗");
            }

            System.out.println();
        }
    }

    static String clean(String text) {
        String lower = text.toLowerCase();
        String result = "";

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
        }

        return result;
    }
}