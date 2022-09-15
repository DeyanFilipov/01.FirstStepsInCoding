package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        if (celsius <= 5.00) {
            System.out.println("unknown");
        }else if (celsius <= 11.9) {
            System.out.println("Cold");
        }else if (celsius <= 14.9) {
            System.out.println("Cool");
        }else if (celsius <= 20.00) {
            System.out.println("Mild");
        }else if (celsius <= 25.9) {
            System.out.println("Warm");
        }else if (celsius <= 35.00) {
            System.out.println("Hot");
        }else {
            System.out.println("unknown");
        }
    }
}
