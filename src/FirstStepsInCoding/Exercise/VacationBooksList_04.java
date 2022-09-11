package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pages1hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime = bookPages / pages1hour;
        int hoursPerDay = totalTime / days;
        System.out.println(hoursPerDay);
    }
}
