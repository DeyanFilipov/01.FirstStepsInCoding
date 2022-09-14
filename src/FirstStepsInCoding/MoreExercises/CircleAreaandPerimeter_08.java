package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaandPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Периметър на окръжност P=π.d=2.Math.PI.r
        //Лице на окръжност S=Math.PI.r.r
        double r = Double.parseDouble(scanner.nextLine());
        double P = 2 * Math.PI * r;
        double S = Math.PI * r * r;
        System.out.printf("%.2f\n%.2f", S, P);
    }
}
