package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenus * 10.35;
        double fishMenuPrice = fishMenus * 12.40;
        double vegetarianMenuPrice = vegetarianMenus * 8.15;
        double totalPriceMenus = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = totalPriceMenus * 0.20;
        double delivery = 2.50;
        double totalPrice = totalPriceMenus + desertPrice + delivery;
        System.out.println(totalPrice);
    }
}
