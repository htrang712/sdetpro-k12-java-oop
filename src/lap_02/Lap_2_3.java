package lap_02;

import java.util.Scanner;

public class Lap_2_3 {
    final static float UNDERWEIGHT = 18.5f;
    final static float MIN_NORMAL_WEIGHT = 18.5f;
    final static float MAX_NORMAL_WEIGHT = 24.9f;

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
                float minStandardWeight = MIN_NORMAL_WEIGHT * yourHeight * 2;
                System.out.println(minStandardWeight);
                float increaseWeight = minStandardWeight - yourWeight;
                System.out.println(increaseWeight);
                System.out.println("You need to gain " + increaseWeight + " kg");

            } else if (bmi >= MIN_NORMAL_WEIGHT && bmi <= MAX_NORMAL_WEIGHT) {
                System.out.println("Normal weight");

            } else {
                System.out.println("Overweight");
                float maxStandardWeight = MAX_NORMAL_WEIGHT * yourHeight * 2;
                System.out.println(maxStandardWeight);
                float decreaseWeight = yourWeight - maxStandardWeight;
                System.out.println(decreaseWeight);
                System.out.println("You need to lose " + decreaseWeight + " kg");

            }

        } else System.out.println("your height or your weight invalid. Please enter again!");
    }
}
