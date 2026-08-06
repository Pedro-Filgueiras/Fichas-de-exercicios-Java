package Questionário_100Questões;

import java.util.ArrayList; 

public class Exercicio71 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 2},
            {4, 2, 1, 3},
            {2, 4, 2, 1}
        };

        System.out.println("Matriz:");
        printMatrix(matrix);

        ArrayList<Integer> uniqueValues = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int current = matrix[i][j];
                int index = uniqueValues.indexOf(current);

                if (index == -1) {
                    uniqueValues.add(current);
                    counts.add(1);
                } else {
                    counts.set(index, counts.get(index) + 1);
                }
            }
        }

        // Ordena os valores únicos (e as contagens juntas) em ordem crescente
        for (int i = 0; i < uniqueValues.size() - 1; i++) {
            for (int j = 0; j < uniqueValues.size() - 1 - i; j++) {
                if (uniqueValues.get(j) > uniqueValues.get(j + 1)) {
                    int tempValue = uniqueValues.get(j);
                    uniqueValues.set(j, uniqueValues.get(j + 1));
                    uniqueValues.set(j + 1, tempValue);

                    int tempCount = counts.get(j);
                    counts.set(j, counts.get(j + 1));
                    counts.set(j + 1, tempCount);
                }
            }
        }

        System.out.println();
        System.out.println("Contagem de frequências:");
        int maxCount = 0;
        for (int i = 0; i < uniqueValues.size(); i++) {
            System.out.println(uniqueValues.get(i) + ": " + counts.get(i) + " vezes");
            if (counts.get(i) > maxCount) {
                maxCount = counts.get(i);
            }
        }

        ArrayList<Integer> mostFrequent = new ArrayList<>();
        for (int i = 0; i < uniqueValues.size(); i++) {
            if (counts.get(i) == maxCount) {
                mostFrequent.add(uniqueValues.get(i));
            }
        }

        System.out.println();
        if (mostFrequent.size() == 1) {
            System.out.println("Elemento mais frequente: " + mostFrequent.get(0) + " (aparece " + maxCount + " vezes)");
        } else {
            String tiedString = "";
            for (int i = 0; i < mostFrequent.size(); i++) {
                if (i == 0) {
                    tiedString += mostFrequent.get(i);
                } else {
                    tiedString += ", " + mostFrequent.get(i);
                }
            }
            System.out.println("Empate entre os elementos mais frequentes: " + tiedString + " (cada um aparece " + maxCount + " vezes)");
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}