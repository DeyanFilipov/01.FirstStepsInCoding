package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrapeziodArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double Area = (b1 + b2) * h / 2;
        System.out.println(Area);
    }
}
