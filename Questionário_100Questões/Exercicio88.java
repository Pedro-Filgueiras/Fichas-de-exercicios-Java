package Questionário_100Questões;

public class Exercicio88 {
    public static void main(String[] args) {

        System.out.println("=== CALCULADORA DE ÁREAS (SOBRECARGA) ===");
        System.out.println();

        double circleArea = calculateArea(3);
        double rectangleArea = calculateArea(4, 6);
        double triangleArea = calculateTriangleArea(5, 8);

        System.out.printf("Área do círculo (raio=3): %.2f%n", circleArea);
        System.out.printf("Área do retângulo (4x6): %.2f%n", rectangleArea);
        System.out.printf("Área do triângulo (base=5, altura=8): %.2f%n", triangleArea);

        System.out.println();
        System.out.println("Demonstração de sobrecarga:");
        System.out.printf("calcularArea(3.0) → %.2f%n", calculateArea(3.0));
        System.out.printf("calcularArea(4.0, 6.0) → %.2f%n", calculateArea(4.0, 6.0));
        System.out.printf("calcularAreaTriangulo(5.0, 8.0) → %.2f%n", calculateTriangleArea(5.0, 8.0));
    }

    // Sobrecarga 1: área do círculo (1 parâmetro)
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Sobrecarga 2: área do retângulo (2 parâmetros, mesmo nome do método acima)
    public static double calculateArea(double base, double height) {
        return base * height;
    }

    // Método com nome diferente para o triângulo
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}