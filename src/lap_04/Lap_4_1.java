package lap_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lap_4_1 {

    /*
     * Lab 4: Create a simple menu with 4 options:
     * =====MENU======
     * 1. Add number into ArrayList
     * 2. Print numbers
     * 3. Get maximum number
     * 4. Get minimum number
     * 5. search number (Add option number 5 to find a number -> index)
     * */
    public static void main(String[] args) {
        List<Integer> myArrayNum = new ArrayList<>();
        boolean conditionLoop = true;

        do {
            // Print Menu
            System.out.println("\n");
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Search number");
            System.out.println("6. Exit");

            // Select menu
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Please enter menu number: ");
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1:
                    System.out.printf("Please enter a number: ");
                    int number = scanner.nextInt();
                    myArrayNum.add(number);
                    break;
                case 2:
                    System.out.printf("My numbers: ");
                    for (Integer i : myArrayNum) {
                        System.out.printf(" " + i);
                    }
                    break;
                case 3:
                    if (myArrayNum.size() > 0) {
                        int maxNumber = getMaxNumber(myArrayNum);
                        System.out.println("Maximum number: " + maxNumber);
                    } else
                        System.out.println("MyArrayNumber is empty");
                    break;
                case 4:
                    if (myArrayNum.size() > 0) {
                        int minNumber = getMinNumber(myArrayNum);
                        System.out.println("Minimum number: " + minNumber);
                    } else
                        System.out.println("MyArrayNumber is empty");
                    break;
                case 5:
                    if (myArrayNum.size() > 0) {
                        System.out.printf("Please enter the number you want to search: ");
                        int numberSearch = scanner.nextInt();
                        List<Integer> indexNumberSearch = getListIndexNumberSearch(numberSearch, myArrayNum);
                        if (indexNumberSearch.size() > 0) {
                            System.out.printf("I found the number " + numberSearch + "in the positions: ");
                            for (int i : indexNumberSearch) {
                                System.out.printf(" " + i);
                            }
                        } else System.out.println("I don't found the number " + numberSearch + " in MyArrayNumber");

                    } else System.out.println("MyArrayNumber is empty");
                    break;
                case 6:
                    conditionLoop = false;
                    break;
                default:
                    System.out.println("Invalid number. Please enter again!!!");
            }
        } while (conditionLoop);
        System.out.println("See you later.");

    }

    private static List<Integer> getListIndexNumberSearch(int numberSearch, List<Integer> myArrayNum) {
        List<Integer> indexNumberSearch = new ArrayList<>();
        for (int i = 0; i < myArrayNum.size(); i++) {
            if (myArrayNum.get(i) == numberSearch)
                indexNumberSearch.add(i);
        }
        return indexNumberSearch;
    }


    private static int getMinNumber(List<Integer> myArrayNum) {
        int minNumber = myArrayNum.get(0);
        for (int i = 0; i < myArrayNum.size(); i++) {
            if (myArrayNum.get(i) < minNumber)
                minNumber = myArrayNum.get(i);
        }
        return minNumber;
    }

    private static int getMaxNumber(List<Integer> myArrayNum) {
        int maxNumber = myArrayNum.get(0);
        for (int i = 0; i < myArrayNum.size(); i++) {
            if (myArrayNum.get(i) > maxNumber)
                maxNumber = myArrayNum.get(i);
        }
        return maxNumber;
    }

}
