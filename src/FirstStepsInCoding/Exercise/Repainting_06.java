package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityNylon = Integer.parseInt(scanner.nextLine());
        int quantityPaint = Integer.parseInt(scanner.nextLine());
        int quantityDiluent = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());
        double sumNylon = (quantityNylon + 2) * 1.50;
        double sumPaint = (quantityPaint + quantityPaint * 0.1) * 14.50;
        double sumDiluent = quantityDiluent * 5.00;
        double sumBags = 0.40;
        double sumMaterials = sumNylon + sumPaint + sumDiluent + sumBags;
        double sumWorkers = workHours * (0.3 * sumMaterials);
        double totalSum = sumMaterials + sumWorkers;
        System.out.print(totalSum);
    }
}
