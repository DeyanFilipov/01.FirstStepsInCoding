package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTaxesBasketball = Integer.parseInt(scanner.nextLine());
        double basketballShoes = yearlyTaxesBasketball - (yearlyTaxesBasketball * 0.40);
        double basketballOutfit = basketballShoes - (basketballShoes * 0.20);
        double basketBall = basketballOutfit * 0.25;
        double basketBallAccessories  = basketBall * 0.20;
        double totalPrice = yearlyTaxesBasketball + basketballShoes + basketballOutfit + basketBall + basketBallAccessories;
        System.out.println(totalPrice);


    }
}
