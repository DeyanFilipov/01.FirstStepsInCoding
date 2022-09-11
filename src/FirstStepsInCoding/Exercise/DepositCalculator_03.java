package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        //2.сума = депозирана сума + срок на депозита * ((депозирана сума + годишен лихвен процент) / 12)
        //3. отпечатваме сума

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double finalSum = depositSum + months * ((depositSum * (percent * 0.01)) / 12);
        System.out.println(finalSum);
    }
}
