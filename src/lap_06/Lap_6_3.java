package lap_06;

import java.util.ArrayList;
import java.util.List;

public class Lap_6_3 {
    /*
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
     * */
    public static void main(String[] args) {
        String myStr = "100 minutes"; //100 minutes
        String resultStr = "";
        char[] myCharacters = myStr.toCharArray();
        List<Character> myNumbers = new ArrayList<>();
        for (char character : myCharacters) {
            if (Character.isDigit(character)) {
                myNumbers.add(character);
            }
        }
        if (!myNumbers.isEmpty()) {
            for (Character number : myNumbers) {
                resultStr = resultStr + number;
            }
            System.out.println("Result string: " + resultStr);
        } else System.out.println("String don't have number");
    }
}
