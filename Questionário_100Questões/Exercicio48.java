package Questionário_100Questões;

public class Exercicio48 {
    public static void main(String[] args) {

        int[] data = { 85, 92, 78, 96, 87, 91 };
        int highestNumber = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        String dataString = "";

        for (int i = 0; i < data.length; i++) {

            // Monta a string de exibição do array
            if (dataString.isEmpty()) {
                dataString += data[i];
            } else {
                dataString += ", " + data[i];
            }

            // Atualiza maior e segundo maior
            if (data[i] > highestNumber) {
                secondHighest = highestNumber;
                highestNumber = data[i];
            } else if (data[i] > secondHighest && data[i] != highestNumber) {
                secondHighest = data[i];
            }
        }

        System.out.printf("Array: [%s]%n", dataString);
        System.out.printf("Maior elemento: %d%n", highestNumber);

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("Não há segundo maior");
        } else {
            System.out.printf("Segundo maior: %d%n", secondHighest);
        }
    }
}