package lap_02;

import java.util.Scanner;

public class lap_2_1 {
    final static float UNDERWEIGHT = 18.5f;
    final static float MIN_NORMAL_WEIGHT = 18.5f;
    final static float MAX_NORMAL_WEIGHT = 24.9f;
    final static float MIN_OVERWEIGHT = 25f;
    final static float MAX_OVERWEIGHT = 29.9f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your height: ");
        float yourHeight = scanner.nextFloat();
        System.out.printf("Please enter your weight: ");
        float yourWeight = scanner.nextFloat();

        if (yourHeight > 0 && yourWeight > 0) {

            float bmi = yourWeight / (yourHeight * 2);
            System.out.println("BMI = " + bmi);

            if (bmi < UNDERWEIGHT) {
                System.out.println("Underweight");
            } else if (bmi >= MIN_NORMAL_WEIGHT && bmi <= MAX_NORMAL_WEIGHT) {
                System.out.println("Normal weight");

            } else if (bmi >= MIN_OVERWEIGHT && bmi <= MAX_OVERWEIGHT) {
                System.out.println("Overweight");
            } else System.out.println("Obesity");

        } else System.out.println("your height or your weight invalid. Please enter again!");

    }
}
