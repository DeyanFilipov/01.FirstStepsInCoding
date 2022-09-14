package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double euro = 1.94;
        double Vegetables = priceKgVegetables * totalKgVegetables;
        double Fruits = priceKgFruits * totalKgFruits;
        double Total = (Vegetables + Fruits) / euro;
        System.out.printf("%.2f", Total);

    }
}
