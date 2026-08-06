package Questionário_100Questões;

import java.util.Scanner;

public class Exercicio94 {

    public static final double METERS_TO_FEET = 3.28084;
    public static final double CELSIUS_FAHRENHEIT_MULT = 1.8;
    public static final double CELSIUS_FAHRENHEIT_ADD = 32;
    public static final double KM_TO_MILES = 0.621371;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println();

        System.out.print("Digite metros: ");
        double meters = scanner.nextDouble();

        System.out.print("Digite celsius: ");
        double celsius = scanner.nextDouble();

        System.out.print("Digite quilômetros: ");
        double km = scanner.nextDouble();

        double feet = metersToFeet(meters);
        double fahrenheit = celsiusToFahrenheit(celsius);
        double miles = kmToMiles(km);

        System.out.println();
        System.out.println("Conversões realizadas:");
        System.out.printf("%.1f metros = %.2f pés%n", meters, feet);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
        System.out.printf("%.1f km = %.2f milhas%n", km, miles);

        System.out.println();
        System.out.println("Fatores utilizados:");
        System.out.println("METROS_PARA_PES = " + METERS_TO_FEET);
        System.out.println("CELSIUS_FAHRENHEIT_MULT = " + CELSIUS_FAHRENHEIT_MULT);
        System.out.println("CELSIUS_FAHRENHEIT_ADD = " + (int) CELSIUS_FAHRENHEIT_ADD);
        System.out.println("KM_PARA_MILHAS = " + KM_TO_MILES);

        scanner.close();
    }

    public static double metersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_FAHRENHEIT_MULT + CELSIUS_FAHRENHEIT_ADD;
    }

    public static double kmToMiles(double km) {
        return km * KM_TO_MILES;
    }
}