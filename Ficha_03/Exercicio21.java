    package Ficha_03;

    import java.util.Scanner;

    public class Exercicio21 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            char response = '\0';

            do {
                System.out.print("A mosca está viva? (s/n) ");
                response = scanner.nextLine().charAt(0);
            } while (response != 'n');

            scanner.close();
        }
    }
