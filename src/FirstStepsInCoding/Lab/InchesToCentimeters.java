package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        // Преобразуване на инчове към сантиметри
           // 1 инч = 2.54 сантиметра
        double centimeters = inches * 2.54;
        // Печатане на резултата
        System.out.println(centimeters);
    }

 }
