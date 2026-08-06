package Questionário_100Questões;

public class Exercicio81 {
    public static void main(String[] args) {

        String[] emails = {
            "naruto@konoha.com",
            "sasuke.uchiha@gmail",
            "@teste.com",
            "sakura@"
        };

        System.out.println("Validando emails:");
        System.out.println();

        for (int i = 0; i < emails.length; i++) {
            validateEmail(emails[i], i + 1);
        }
    }

    static void validateEmail(String email, int index) {
        System.out.println(index + ". \"" + email + "\"");

        int atCount = countChar(email, '@');

        if (atCount != 1) {
            System.out.println("   ✗ Não tem exatamente 1 @");
            System.out.println("   Resultado: Email INVÁLIDO");
            System.out.println();
            return;
        }
        System.out.println("   ✓ Tem exatamente 1 @");

        int atIndex = email.indexOf('@');
        String beforeAt = email.substring(0, atIndex);
        String afterAt = email.substring(atIndex + 1);

        if (beforeAt.isEmpty()) {
            System.out.println("   ✗ Parte antes do @ está vazia");
            System.out.println("   Resultado: Email INVÁLIDO");
            System.out.println();
            return;
        }

        if (afterAt.isEmpty()) {
            System.out.println("   ✗ Parte após @ está vazia");
            System.out.println("   Resultado: Email INVÁLIDO");
            System.out.println();
            return;
        }

        if (!afterAt.contains(".")) {
            System.out.println("   ✗ Não tem ponto após @");
            System.out.println("   Resultado: Email INVÁLIDO");
            System.out.println();
            return;
        }
        System.out.println("   ✓ Tem pelo menos 1 ponto após @");
        System.out.println("   ✓ Parte antes do @ não está vazia");
        System.out.println("   ✓ Parte após @ não está vazia");
        System.out.println("   Resultado: Email VÁLIDO");
        System.out.println();
    }

    static int countChar(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}