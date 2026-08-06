package Questionário_100Questões;

public class Exercicio93 {

    public static final double PI = 3.14159;
    public static final long LIGHT_SPEED = 299792458; // m/s
    public static final double EARTH_GRAVITY = 9.81; // m/s²

    public static void main(String[] args) {

        System.out.println("=== CONSTANTES UNIVERSAIS ===");
        System.out.println();

        System.out.println("Constantes declaradas:");
        System.out.println("PI = " + PI);
        System.out.println("VELOCIDADE_LUZ = " + LIGHT_SPEED + " m/s");
        System.out.println("GRAVIDADE_TERRA = " + EARTH_GRAVITY + " m/s²");

        System.out.println();
        System.out.println("Exemplos de uso:");

        // Área do círculo
        double radius = 5;
        double circleArea = PI * radius * radius;
        System.out.printf("Área círculo (raio=%.0f): π × %.0f² = %.2f m²%n", radius, radius, circleArea);

        // Tempo da luz Terra-Lua
        double distanceMoon = 384400 * 1000; // km convertido para metros
        double timeToMoon = distanceMoon / LIGHT_SPEED;
        System.out.printf("Tempo luz Terra-Lua: 384400 km ÷ %d m/s = %.2f segundos%n", LIGHT_SPEED, timeToMoon);

        // Queda livre
        double time = 5;
        double fallDistance = 0.5 * EARTH_GRAVITY * time * time;
        System.out.printf("Queda livre (%.0fs): ½ × %.2f × %.0f² = %.2f metros%n", time, EARTH_GRAVITY, time, fallDistance);
    }
}