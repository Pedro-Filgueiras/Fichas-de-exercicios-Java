package Questionário_100Questões;

public class Exercicio92 {
    public static void main(String[] args) {

        System.out.println("=== VALIDADOR DE CARTÃO DE CRÉDITO ===");
        System.out.println();

        String[] cards = {"4532015112830366", "1234567890123456"};

        for (String card : cards) {
            validateCard(card);
            System.out.println();
        }
    }

    static void validateCard(String card) {
        System.out.println("Testando: " + card);

        if (!isNumeric(card)) {
            System.out.println("Resultado: CARTÃO INVÁLIDO (contém caracteres não numéricos)");
            return;
        }

        System.out.println("Tipo: " + identifyCardType(card));

        int length = card.length();
        String lengthCheck = (length >= 13 && length <= 19) ? "✓" : "✗";
        System.out.println("Comprimento: " + length + " dígitos " + lengthCheck);

        if (length < 13 || length > 19) {
            System.out.println("Resultado: CARTÃO INVÁLIDO (comprimento incorreto)");
            return;
        }

        System.out.println();
        boolean isValid = calculateLuhn(card);

        System.out.println();
        if (isValid) {
            System.out.println("Resultado: CARTÃO VÁLIDO");
        } else {
            System.out.println("Resultado: CARTÃO INVÁLIDO");
        }
    }

    static boolean isNumeric(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static String identifyCardType(String card) {
        if (card.startsWith("4")) {
            return "Visa (inicia com 4)";
        } else if (card.startsWith("5")) {
            return "Mastercard (inicia com 5)";
        } else if (card.startsWith("34") || card.startsWith("37")) {
            return "American Express (inicia com 34/37)";
        } else {
            return "Desconhecido";
        }
    }

    static boolean calculateLuhn(String card) {
        int sum = 0;
        boolean doubleDigit = false;

        String oddSumExpression = "";
        String evenExpression = "";
        int oddSum = 0;
        int evenSum = 0;

        // Percorre da direita para a esquerda
        for (int i = card.length() - 1; i >= 0; i--) {
            int digit = card.charAt(i) - '0';

            if (!doubleDigit) {
                // Posição ímpar (contando da direita, começando em 1)
                oddSum += digit;
                if (oddSumExpression.isEmpty()) {
                    oddSumExpression += digit;
                } else {
                    oddSumExpression += "+" + digit;
                }
                sum += digit;
            } else {
                // Posição par: dobra o valor
                int doubled = digit * 2;
                if (doubled > 9) {
                    doubled -= 9;
                }
                evenSum += doubled;
                if (evenExpression.isEmpty()) {
                    evenExpression += "(" + digit + "×2)";
                } else {
                    evenExpression += " + (" + digit + "×2)";
                }
                sum += doubled;
            }

            doubleDigit = !doubleDigit;
        }

        System.out.println("Algoritmo de Luhn:");
        System.out.println("Posições ímpares (direita para esquerda): " + oddSumExpression);
        System.out.println("Posições pares dobradas: " + evenExpression);
        System.out.println("Soma das posições pares (já ajustadas se > 9): " + evenSum);
        System.out.println();
        System.out.println("Soma total: " + oddSum + " + " + evenSum + " = " + sum);
        System.out.println(sum + " % 10 = " + (sum % 10) + (sum % 10 == 0 ? " = 0" : " ≠ 0"));

        return sum % 10 == 0;
    }
}