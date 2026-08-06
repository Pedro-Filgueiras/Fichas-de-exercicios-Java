package Questionário_100Questões;

public class Exercicio85 {
    public static void main(String[] args) {

        double radius = 5.0;

        System.out.println("=== CALCULADORA DE ÁREA DO CÍRCULO ===");
        System.out.println("Raio: " + radius);

        double area = calculateCircleArea(radius);

        System.out.printf("Área: %.2f%n", area);
        System.out.println("Fórmula usada: π × r²");
    }

    public static double calculateCircleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("O raio deve ser positivo");
        }
        return Math.PI * radius * radius;
    }
}