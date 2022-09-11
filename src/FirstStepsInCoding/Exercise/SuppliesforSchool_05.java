package FirstStepsInCoding.Exercise;
import java.util.Scanner;
public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        //Купиваме химикали, маркери, препарат
        //1. входни данни
        //2. сума за химикали = бр. на химикали * цена за 1 пакет химикали (5.80)
        //3. сума за маркери = бр. пакети маркери * цена за 1 пакет маркери (7.20)
        //4. сума за препарат = литри препарат * цена за 1л. препарат (1.20)
        //5. обща сума = сума за химикали + марлери + препарат
        //6. сума след отстъпката = крайна сума - отстъпката
        //7. отпечатваме финалната сума

        Scanner scanner = new Scanner(System.in);
        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumPens = countPens * 5.80;
        double sumMarkers = countMarkers * 7.20;
        double sumLiters = liters * 1.20;
        double totalSum = sumPens + sumMarkers + sumLiters;
        double finalSum = totalSum - (percent/100.0) * totalSum;
        System.out.println(finalSum);
    }
}
