package Questionário_100Questões;

public class Exercicio53 {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 9, 12};
        int[] array2 = {3, 6, 8, 15, 20};
        int[] result = new int[array1.length + array2.length];

        int i = 0; // ponteiro do array1
        int j = 0; // ponteiro do array2
        int k = 0; // ponteiro do array resultado

        // Enquanto os dois arrays ainda tiverem elementos não comparados
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        // Copia o que sobrou do array1 (se ainda houver)
        while (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }

        // Copia o que sobrou do array2 (se ainda houver)
        while (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }

        // Impressão formatada
        System.out.println("Array 1: " + arrayToString(array1));
        System.out.println("Array 2: " + arrayToString(array2));
        System.out.println();
        System.out.println("Intercalando arrays...");
        System.out.println("Array resultado: " + arrayToString(result));
    }

    // Método auxiliar pra formatar array como [1, 2, 3]
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