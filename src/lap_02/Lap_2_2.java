package lap_02;

import java.util.Scanner;

public class Lap_2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number:");
        int number = scanner.nextInt();
        boolean result = number % 2 == 0;
        if (result) {
            System.out.println("even number");
        }
        else System.out.println("odd number");
    }
}
