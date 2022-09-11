package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        //2. обем в куб. см
        //3. преобразуваме обем в литри
        //4. колко литра са нужни
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double volumeLiters = volumeCm * 0.001;
        double needLiters =  volumeLiters * (1 - percent / 100);
        System.out.println(needLiters);

    }
}
