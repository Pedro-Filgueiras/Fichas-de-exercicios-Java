package Questionário_100Questões;

public class Exercicio47 {
    public static void main(String[] args) {
        
        int[] data = {12, 7, 18, 23, 4, 15, 30, 9};
        int countOdd = 0; // ímpar
        int countEven = 0; // par
        String oddList = "";
        String evenList = "";

        

        System.out.print("Array: ");
        for (int i = 0; i < data.length; i++) {

            if (data[i] % 2 == 0) {
                countEven++;
                if (evenList.isEmpty()) {
                    evenList += data[i];
                } else {
                    evenList += ", " + data[i];
                }
            } else {
                countOdd++;
                if (oddList.isEmpty()) {
                    oddList += data[i];
                } else {
                    oddList += ", " + data[i];
                }
            }

            if (i == 0) {
                System.out.printf("[%d, ", data[i]);
            } else if (i != data.length - 1) {
                System.out.printf("%d, ", data[i]);
            } else {
                System.out.printf("%d]\n", data[i]);
            }
        }

        System.out.printf("Números pares: %d (valores: %s)\n", countEven, evenList);
        
        System.out.printf("Números ímpares: %d (valores: %s)\n", countOdd, oddList);
    }
}
