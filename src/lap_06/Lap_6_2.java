package lap_06;

import java.util.Scanner;

public class Lap_6_2 {
    /*
     * String myPassword = "password123";
     * Allow user to input maximum 3 times
     * */
    public static void main(String[] args) {
        String myPassword = "password123";
        int condition = 0;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.printf("Please enter my password: ");
            String enterPassword = scanner.next();
            if (enterPassword.equals(myPassword)) {
                System.out.println("Correct password.");
                break;
            } else {
                System.out.println("Incorrect password.");
            }
            condition++;
        } while (condition < 3);
    }
}
