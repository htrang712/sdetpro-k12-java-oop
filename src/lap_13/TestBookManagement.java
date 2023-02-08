package lap_13;

import java.util.Scanner;

public class TestBookManagement {
    public static void main(String[] args) {

        String relativeFilePath = "/src/lap_13/BookList.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
        BookManagement bookManagement = new BookManagement();
        bookManagement.bookManagement();
    }
}
