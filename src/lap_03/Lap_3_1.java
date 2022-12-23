package lap_03;

public class Lap_3_1 {

    /*
     * Count how many odd, even number(s) in an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Even numders: 2
     * Odd numbers: 3
     * */
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};
        int evenNum = 0;
        int oddNum = 0;
        for (int i : numArr) {
            if (i % 2 == 0)
                evenNum++;
            else
                oddNum++;
        }
        System.out.println("Even numvers: " + evenNum);
        System.out.println("Odd numbers:" + oddNum);
    }
}
