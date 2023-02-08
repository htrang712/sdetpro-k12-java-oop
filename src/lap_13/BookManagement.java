package lap_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public void bookManagement() {
        boolean conditionLoop = true;
        Scanner scanner = new Scanner(System.in);
        String relativeFilePath = "/src/lap_13/BookList.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
        System.out.println("Welcome to my programming!!!");
        List<Book> bookList = new ArrayList<>();
        List<Book> bookListResult = new ArrayList<>();

        do {
            String menuList = printMenu();
            System.out.println(menuList);

            System.out.print("Please enter menu number: ");
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1 -> {
                    bookList = readFileBookList(absoluteFilePath);
                    bookListResult = addNewBook(bookList);
                    writeFileBookList(bookListResult, absoluteFilePath);
                    System.out.println("Add new book successful!!");
                }
                case 2 -> {
                    bookList = readFileBookList(absoluteFilePath);
                    findABook(bookList);
                }
                case 3 -> {
                    bookList = readFileBookList(absoluteFilePath);
                    bookListResult = updateABook(bookList);
                    writeFileBookList(bookListResult, absoluteFilePath);
                    System.out.println("Update a book successful!!");
                }
                case 4 -> {
                    bookList = readFileBookList(absoluteFilePath);
                    bookListResult = deleteABook(bookList);
                    writeFileBookList(bookListResult, absoluteFilePath);
                    System.out.println("Delete a book successful!!");
                }
                case 5 -> {
                    bookList = readFileBookList(absoluteFilePath);
                    printBookList(bookList);
                }
                case 0 -> conditionLoop = false;
                default -> System.out.println("Please enter invalid number!!");
            }

        } while (conditionLoop);

        System.out.println("See you later!!");

    }

    String printMenu() {
        return "\n======= Book Management Program (CRUD)============\n" +
                "1. New book\n" +
                "2. Find a book(ISBN)\n" +
                "3. Update a book\n" +
                "4. Delete a book\n" +
                "5. Print the book list\n" +
                "0. Exit";
    }

    List<Book> readFileBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookInfo = dataLine.split(";");
                String ISBN = bookInfo[0];
                String title = bookInfo[1];
                String author = bookInfo[2];
                int year = Integer.parseInt(bookInfo[3]);
                Book book = new Book(ISBN, title, author, year);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FilePath not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
        return bookList;
    }

    void writeFileBookList(List<Book> bookList, String filePath) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {

            if (!bookList.isEmpty()) {
                for (Book book : bookList) {
                    String ISBN = book.getISBN();
                    String title = book.getTitle();
                    String author = book.getAuthor();
                    int year = book.getYear();
                    String dataLine = ISBN + ";" + title + ";" + author + ";" + year;
                    bufferedWriter.write(dataLine);
                    bufferedWriter.newLine();
                }
            } else
                System.out.println("Book list is empty!!");

        } catch (FileNotFoundException e) {
            System.out.println("FilePath not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<Book> addNewBook(List<Book> bookList) {
        boolean conditionLoop = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter ISBN: ");
        String ISBN = "";

        do {
            ISBN = scanner.nextLine();
            if (ISBN.trim().isEmpty()) {
                System.out.println("ISBN can't be blank, try again");
                System.out.print("Please enter ISBN: ");
            } else if (!bookList.isEmpty() && checkISBNExists(bookList, ISBN)) {
                System.out.println("ISBN exist in Database, try again");
                System.out.print("Please enter ISBN: ");
            } else conditionLoop = false;

        } while (conditionLoop);

        System.out.print("Please enter title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();

        Book book = new Book(ISBN, title, author, year);
        bookList.add(book);

        return bookList;
    }

    boolean checkISBNExists(List<Book> bookList, String ISBN) {
        boolean isExists = false;
        for (Book book : bookList) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }

    void findABook(List<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        boolean conditionLoop = true;
        boolean isFound = false;
        System.out.print("Please enter ISBN book: ");
        String ISBN = "";
        do {
            ISBN = scanner.nextLine();
            if (ISBN.trim().isEmpty()) {
                System.out.println("ISBN can't be blank, try again");
                System.out.print("Please enter ISBN: ");
            } else conditionLoop = false;
        } while (conditionLoop);

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getISBN().equalsIgnoreCase(ISBN)) {
                    printABook(01, book);
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Book with ISBN <" + ISBN + "> is not found");
            }
        }
    }

    void printABook(int index, Book book) {
        System.out.println("Book " + index + ": " + book.getTitle());
        System.out.println("    ISBN: " + book.getISBN());
        System.out.println("    Author: " + book.getAuthor());
        System.out.println("    Year: " + book.getYear());
    }

    List<Book> updateABook(List<Book> bookList) {
        boolean conditionLoop = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter ISBN: ");
        String ISBN = "";

        do {
            ISBN = scanner.nextLine();
            if (ISBN.trim().isEmpty()) {
                System.out.println("ISBN can't be blank, try again");
                System.out.print("Please enter ISBN: ");
            } else if (bookList.isEmpty() || !checkISBNExists(bookList, ISBN)) {
                System.out.println("ISBN don't exist in Database, try again");
                System.out.print("Please enter ISBN: ");
            } else conditionLoop = false;

        } while (conditionLoop);

        System.out.print("Please enter title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();

        for (Book book : bookList) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                book.setTitle(title);
                book.setAuthor(author);
                book.setYear(year);
                break;
            }
        }
        return bookList;
    }

    List<Book> deleteABook(List<Book> bookList) {
        boolean conditionLoop = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter ISBN: ");
        String ISBN = "";

        do {
            ISBN = scanner.nextLine();
            if (ISBN.trim().isEmpty()) {
                System.out.println("ISBN can't be blank, try again");
                System.out.print("Please enter ISBN: ");
            } else if (bookList.isEmpty() || !checkISBNExists(bookList, ISBN)) {
                System.out.println("ISBN don't exist in Database, try again");
                System.out.print("Please enter ISBN: ");
            } else conditionLoop = false;

        } while (conditionLoop);

        for (Book book : bookList) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                bookList.remove(book);
                break;
            }
        }
        return bookList;
    }

    void printBookList(List<Book> bookList) {
        if (!bookList.isEmpty()) {

            for (int i = 0; i < bookList.size(); i++) {
                printABook(i + 1, bookList.get(i));
            }
        } else System.out.println("Book list is empty!!");
    }
}
