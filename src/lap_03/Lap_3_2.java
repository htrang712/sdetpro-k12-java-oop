package lap_03;

import java.util.Arrays;

public class Lap_3_2 {

    /*
     * Finding maximum value/minimum value from an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Minimum: 1
     * Maximum: 5
     * */
    public static void main(String[] args) {

        int[] numArr = {1, 2, 3, 4, 5};
        int minValue, maxValue;
        minValue = maxValue = numArr[0];
        for (int i : numArr) {
            minValue = Math.min(minValue, i);
            maxValue = Math.max(maxValue, i);
        }
        System.out.println("Minimum = " + minValue);
        System.out.println("Maximum = " + maxValue);
    }
}
