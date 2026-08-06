package Questionário_100Questões;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio84 {
    public static void main(String[] args) {

        System.out.println("=== GERADOR DE SENHAS ===");
        System.out.println();
        System.out.println("Critérios:");
        System.out.println("- Tamanho: 12 caracteres");
        System.out.println("- Mínimo 2 maiúsculas");
        System.out.println("- Mínimo 2 minúsculas");
        System.out.println("- Mínimo 2 números");
        System.out.println("- Mínimo 1 símbolo");
        System.out.println();

        String password = generatePassword();

        System.out.println("Senha gerada: \"" + password + "\"");
        System.out.println();

        validatePassword(password);

        scanner_close_placeholder();
    }

    static void scanner_close_placeholder() {
        // não há Scanner nesse exercício, método vazio apenas por padronização
    }

    static String generatePassword() {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&*";
        String allChars = uppercase + lowercase + numbers + symbols;

        int length = 12;
        Random random = new Random();

        ArrayList<Character> passwordChars = new ArrayList<>();

        // Garante o mínimo de cada categoria
        for (int i = 0; i < 2; i++) {
            passwordChars.add(uppercase.charAt(random.nextInt(uppercase.length())));
        }
        for (int i = 0; i < 2; i++) {
            passwordChars.add(lowercase.charAt(random.nextInt(lowercase.length())));
        }
        for (int i = 0; i < 2; i++) {
            passwordChars.add(numbers.charAt(random.nextInt(numbers.length())));
        }
        passwordChars.add(symbols.charAt(random.nextInt(symbols.length())));

        // Preenche o restante com caracteres aleatórios de qualquer categoria
        while (passwordChars.size() < length) {
            passwordChars.add(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Embaralha a lista (Fisher-Yates shuffle manual)
        for (int i = passwordChars.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = passwordChars.get(i);
            passwordChars.set(i, passwordChars.get(j));
            passwordChars.set(j, temp);
        }

        String password = "";
        for (char c : passwordChars) {
            password += c;
        }

        return password;
    }

    static void validatePassword(String password) {
        ArrayList<Character> uppercaseFound = new ArrayList<>();
        ArrayList<Character> lowercaseFound = new ArrayList<>();
        ArrayList<Character> numbersFound = new ArrayList<>();
        ArrayList<Character> symbolsFound = new ArrayList<>();

        String symbolChars = "!@#$%&*";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                uppercaseFound.add(c);
            } else if (Character.isLowerCase(c)) {
                lowercaseFound.add(c);
            } else if (Character.isDigit(c)) {
                numbersFound.add(c);
            } else if (symbolChars.indexOf(c) != -1) {
                symbolsFound.add(c);
            }
        }

        System.out.println("Validação:");

        boolean valid = true;

        String sizeCheck = password.length() == 12 ? "✓" : "✗";
        System.out.println(sizeCheck + " Tamanho: " + password.length() + " caracteres");
        if (password.length() != 12) valid = false;

        String upperCheck = uppercaseFound.size() >= 2 ? "✓" : "✗";
        System.out.println(upperCheck + " Maiúsculas: " + uppercaseFound.size() + " (" + listToString(uppercaseFound) + ")");
        if (uppercaseFound.size() < 2) valid = false;

        String lowerCheck = lowercaseFound.size() >= 2 ? "✓" : "✗";
        System.out.println(lowerCheck + " Minúsculas: " + lowercaseFound.size() + " (" + listToString(lowercaseFound) + ")");
        if (lowercaseFound.size() < 2) valid = false;

        String numberCheck = numbersFound.size() >= 2 ? "✓" : "✗";
        System.out.println(numberCheck + " Números: " + numbersFound.size() + " (" + listToString(numbersFound) + ")");
        if (numbersFound.size() < 2) valid = false;

        String symbolCheck = symbolsFound.size() >= 1 ? "✓" : "✗";
        System.out.println(symbolCheck + " Símbolos: " + symbolsFound.size() + " (" + listToString(symbolsFound) + ")");
        if (symbolsFound.size() < 1) valid = false;

        System.out.println();
        if (valid) {
            System.out.println("Senha VÁLIDA e segura!");
        } else {
            System.out.println("Senha INVÁLIDA!");
        }
    }

    static String listToString(ArrayList<Character> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                result += list.get(i);
            } else {
                result += ", " + list.get(i);
            }
        }
        return result;
    }
}