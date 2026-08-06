package Questionário_100Questões;

public class Exercicio50 {
    public static void main(String[] args) {

        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array inicial: " + arrayToString(data));
        System.out.println();

        int etapa = 0;

        // Bubble sort clássico: a cada passada, o maior elemento "borbulha" até o final
        for (int i = 0; i < data.length - 1; i++) {
            boolean trocou = false;

            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    // Troca os elementos adjacentes
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    trocou = true;
                }
            }

            etapa++;
            System.out.println("Etapa " + etapa + ": " + arrayToString(data));

            // Se não houve troca nessa passada, o array já está ordenado — pode parar
            if (!trocou) {
                break;
            }
        }

        System.out.println();
        System.out.println("Array ordenado: " + arrayToString(data));
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