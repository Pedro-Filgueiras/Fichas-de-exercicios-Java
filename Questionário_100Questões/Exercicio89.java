package Questionário_100Questões;

public class Exercicio89 {

    static int comparisons = 0;
    static int swaps = 0;

    public static void main(String[] args) {

        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original: " + arrayToString(array));
        System.out.println("Ordenando array...");

        int[] sortedArray = sortArray(array);

        System.out.println("Array ordenado: " + arrayToString(sortedArray));
        System.out.println();
        System.out.println("Método utilizado: Bubble Sort");
        System.out.println("Comparações realizadas: " + comparisons);
        System.out.println("Trocas realizadas: " + swaps);
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return array;
    }

    static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}