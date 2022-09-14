package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        int hDesk = 120;
        int wDesk = 70;
        int missDesk = 3;
        int hall = 100;
        double rowDesk = Math.floor((height * 100) / hDesk);
        double seatsDesk = Math.floor(((width * 100) - hall) / wDesk);
        double allDesk = (int) ((rowDesk * seatsDesk) - missDesk);
        System.out.println(allDesk);


    }
}
