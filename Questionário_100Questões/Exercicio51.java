package Questionário_100Questões;

public class Exercicio51 {
    public static void main(String[] args) {

        int[] original = {1, 3, 2, 3, 4, 2, 5, 1};
        int[] withoutDuplicates = new int[original.length]; // tamanho máximo possível
        int finalSize = 0; // quantos elementos únicos já foram guardados
        int removedCount = 0;

        System.out.println("Array original: " + arrayToString(original));
        System.out.println("Removendo duplicatas...");

        for (int i = 0; i < original.length; i++) {
            int current = original[i];
            boolean alreadyExists = false;

            // Verifica se "current" já foi adicionado antes no array de resultado
            for (int j = 0; j < finalSize; j++) {
                if (withoutDuplicates[j] == current) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                withoutDuplicates[finalSize] = current;
                finalSize++;
            } else {
                removedCount++;
            }
        }

        // Copia só a parte preenchida do array (sem os espaços vazios sobrando)
        int[] result = new int[finalSize];
        for (int i = 0; i < finalSize; i++) {
            result[i] = withoutDuplicates[i];
        }

        System.out.println("Array sem duplicatas: " + arrayToString(result));
        System.out.println("Elementos removidos: " + removedCount + " duplicatas");
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