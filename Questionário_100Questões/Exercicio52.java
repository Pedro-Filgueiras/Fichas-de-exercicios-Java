package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] data = {5, 12, 18, 25, 33, 47, 56, 69, 78, 84};

        System.out.println("Array ordenado: " + arrayToString(data));
        System.out.print("Digite o valor a buscar: ");
        int target = scanner.nextInt();

        System.out.println();
        System.out.printf("Busca binária por %d:%n", target);

        int start = 0;
        int end = data.length - 1;
        int comparisons = 0;
        int foundPosition = -1;

        while (start <= end) {
            int middle = (start + end) / 2;
            comparisons++;

            if (data[middle] == target) {
                System.out.printf("Início=%d, Fim=%d, Meio=%d, Valor=%d ✓%n", start, end, middle, data[middle]);
                foundPosition = middle;
                break;
            } else if (data[middle] < target) {
                System.out.printf("Início=%d, Fim=%d, Meio=%d, Valor=%d (menor, buscando à direita)%n", start, end, middle, data[middle]);
                start = middle + 1;
            } else {
                System.out.printf("Início=%d, Fim=%d, Meio=%d, Valor=%d (maior, buscando à esquerda)%n", start, end, middle, data[middle]);
                end = middle - 1;
            }
        }

        System.out.println();
        if (foundPosition != -1) {
            System.out.println("Valor encontrado na posição " + foundPosition);
        } else {
            System.out.println("Valor não encontrado no array.");
        }
        System.out.println("Comparações realizadas: " + comparisons);

        scanner.close();
    }

    static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int idx = 0; idx < arr.length; idx++) {
            sb.append(arr[idx]);
            if (idx != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}