package org.hillel.lessons.arraysecond;

import java.util.Scanner;

public class LessonTen {

    public static void main(String[] args) {
        String[] books = {"Book1", "Book2", "Book3", "Book4", "Book2", "Book6", "Book7"};
        int[] years = {1950, 1869, 1900, 2000};
        int[] connections = {2, 0, 0, 3, 1, 2, 3};

        System.out.println("Hello. 1 - search by year, 2 - search by title, 0 - exit from system");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userChoice = getUserData(scanner);
            if (userChoice == 1) {
                searchByYear(books, years, connections, scanner);
                break;
            }
            if (userChoice == 2) {
                searchByTitle(books, years, connections, scanner);
                break;
            }
            if (userChoice == 0) {
                System.out.println("You chose exit from system");
                break;
            }
            System.out.println("Please repeat input");
        }

        System.out.println("Thanks. Bye!");
        scanner.close();
    }

    public static boolean checkTitle(String[] books, String title) {
        for (String book : books) {
            if (book.contains(title)) {
                return true;
            }
        }
        return false;
    }

    public static void searchByTitle(String[] books, int[] years, int[] connections, Scanner scanner) {
        System.out.println("Hello. Please, input title from: ");
        printTitles(books);

        while (true) {

            String userTitle = scanner.next();
            boolean resultTitleSearch = checkTitle(books, userTitle);
            if (resultTitleSearch) {
                printBookByTitleFilter(books, years, connections, userTitle);
                break;
            }
            if (userTitle.equals ("0")) {
                break;
            }
            System.out.println("You input incorrect title. Please, repeat");
        }
    }

    public static void printTitles(String[] books) {
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();
    }


    public static void searchByYear(String[] books, int[] years, int[] connections, Scanner scanner) {
        System.out.println("Hello. Please, input year of publishing from: ");
        printYears(years);

        while (true) {
            int userData = getUserData(scanner);
            if (userData > 0) {
                boolean resultCheck = checkYear(years, userData);
                if (resultCheck) {
                    printBookByYearFilter(books, years, connections, userData);
                    break;
                }
                System.out.println("You input incorrect year " + userData);
            }
            if (userData == 0) {
                break;
            }
            System.out.println("Please repeat input");
        }
    }

    public static void printBookByYearFilter(String[] books, int[] years, int[] connections, int userYear) {
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            int yearIndex = connections[i];
            int year = years[yearIndex];
            if (year == userYear) {
                System.out.println("Book title = " + book + ", year of publishing: " + year);
            }

        }

    }

    public static void printBookByTitleFilter(String[] books, int[] years, int[] connections, String userTitle) {
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            int yearIndex = connections[i];
            int year = years[yearIndex];
            if (book.contains(userTitle)) {
                System.out.println("Book title = " + book + ", year of publishing: " + year);
            }
        }
    }

    public static boolean checkYear(int[] years, int userInputYear) {
        for (int year : years) {
            if (year == userInputYear) {
                return true;
            }
        }
        return false;
    }

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public static void printYears(int[] years) {
        for (int year : years) {
            System.out.print(year + " ");
        }
        System.out.println();
    }

    public static void printBooks(String[] books, int[] years, int[] connections) {
        for (int i = 0; i < books.length; i++) {
            int yearIndex = connections[i];
            System.out.println("Book title = " + books[i] + ", year of publishing: " + years[yearIndex]);
        }
    }
}
