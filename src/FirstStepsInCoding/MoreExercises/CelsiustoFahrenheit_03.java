package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CelsiustoFahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Формула °F = °C × 1,8 + 32
        double Celsuis = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = Celsuis * 1.8 + 32;
        System.out.printf("%.2f", Fahrenheit);
    }
}
