package lap_03;

import java.util.Arrays;

public class Lap_3_4 {
    /*
     * Merge 2 SORTED integer array into one SORTED array
     * Array 01: {1, 12, 16, 28, 34}
     * Array 02: {1, 13, 16, 27, 99}
     * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
     * */
    public static void main(String[] args) {

        int[] firstArr = {1, 12, 16, 28, 34};
        int[] secondArr = {1, 13, 16, 27, 99};
        int firstArrLength = firstArr.length;
        int secondArrLength = secondArr.length;
        int[] resultArr = new int[firstArrLength + secondArrLength];
        System.arraycopy(firstArr, 0, resultArr, 0, firstArrLength);
        System.arraycopy(secondArr, 0, resultArr, firstArrLength, secondArrLength);
        Arrays.sort(resultArr);
        for (int i : resultArr) {
            System.out.printf("%d ", i);
        }
    }
}
