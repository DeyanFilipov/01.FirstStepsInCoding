package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogfood = Double.parseDouble(scanner.nextLine());
        double dogfoodmoney = dogfood * 2.50;
        double catfood = Double.parseDouble(scanner.nextLine());
        double catfoodmoney = catfood * 4.0;
        System.out.println(dogfoodmoney + catfoodmoney );
    }
}
