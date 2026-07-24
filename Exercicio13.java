public class Exercicio13 {
    public static void main(String[] args) {
        double nota = 7;

        if (nota  >= 9 && nota <= 10) {
            System.out.println("Conceito A - Excelente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Conceito B - Bom");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Conceito C - Regular");
        } else if (nota < 5 && nota > 0) {
            System.out.println("Conceito D - Reprovado");
        } else {
            System.out.println("Essa nota não é aceita");
        }
    }
}
