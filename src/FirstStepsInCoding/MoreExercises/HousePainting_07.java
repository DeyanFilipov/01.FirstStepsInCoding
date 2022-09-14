package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWall = x * y;
        double window = 1.50;
        double windowP = window * window;
        double sideWalls = 2 * sideWall - 2 * windowP;
        double backWall = x * x;
        double door = 1.2 * 2;
        double frontBackWalls = 2 * backWall - door;
        double totalP = sideWalls + frontBackWalls;
        double greenPaint = totalP / 3.4;
        double rectanglesRoof = 2*  (x * y);
        double triangles = 2 * (x * h / 2);
        double totalP2 = rectanglesRoof + triangles;
        double redPaint = totalP2 / 4.3;
        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);
        }
}

