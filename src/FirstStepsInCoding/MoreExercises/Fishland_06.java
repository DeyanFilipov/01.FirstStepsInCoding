package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceSprat = Double.parseDouble(scanner.nextLine());
        double kgBonito = Double.parseDouble(scanner.nextLine());
        double kgScad = Double.parseDouble(scanner.nextLine());
        int kgClam = Integer.parseInt(scanner.nextLine());

        double priceKgBonito = priceMackerel + priceMackerel * 0.60;
        double priceBonito = kgBonito * priceKgBonito;
        double priceKgScad = priceSprat + priceSprat * 0.80;
        double priceScad = kgScad * priceKgScad;
        double priceClam = kgClam * 7.50;
        double bill =  priceBonito + priceScad + priceClam;
        System.out.printf("%.2f", bill);



        }
    }
