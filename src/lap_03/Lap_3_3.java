package lap_03;

import java.util.Arrays;

public class Lap_3_3 {

    /*
     * Sort an integer array from min to max
     * Input: {12, 34, 1, 16, 28}
     * Expected output: {1, 12, 16, 28, 34}
     * */
    public static void main(String[] args) {

        int[] numArr = {12, 34, 1, 16, 28};
        int tamp = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[j] > numArr[i]) {
                    tamp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tamp;
                }
            }
        }
        for (int i : numArr) {
            System.out.printf("%d ", i);
        }
    }
}
