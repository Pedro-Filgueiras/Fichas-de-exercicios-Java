package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] list = {10, 25, 14, 37, 22, 18, 41};

        System.out.printf("Array: %s\n", arrayToString(list));
        System.out.print("Digite o valor a buscar: ");
        int search = scanner.nextInt();

        System.out.printf("Buscando %d no array...\n", search);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == search) {
                System.out.println("Valor encontrado na posição " + i);
            }
        }

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
