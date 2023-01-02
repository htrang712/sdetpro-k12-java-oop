package lap_06;

public class Lap_6_1 {
    /*
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     * */
    public static void main(String[] args) {
        String str = "2hrs and 5 minutes";
        String[] strArr = str.split("and");
        int hours = Integer.parseInt(strArr[0].replaceAll("[^0-9]", ""));
        int minutes = Integer.parseInt(strArr[1].replaceAll("[^0-9]", ""));
        int totalMinutes = (hours * 60) + minutes;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total minutes: " + totalMinutes);
    }
}
