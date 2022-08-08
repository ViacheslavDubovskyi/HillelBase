package org.hillel.lessons.bookLibrary;

import java.util.Scanner;

public class LibraryObject {

    private static Book[] book;
    private static String[] language;
    private static Scanner scanner;

    public static void main(String[] args) {

        Country countryFrance = new Country("Франция");
        Country countryEngland = new Country("Великобритания");
        Country countryItaly = new Country("Италия");
        Country countryIndia = new Country("Индия");

        Author author1 = new Author("А. Дюма", 1802, countryFrance);
        Author author2 = new Author("А. К. Дойл", 1859, countryEngland);
        Author author3 = new Author("Р. Саббатини", 1875, countryItaly);
        Author author4 = new Author("А. Дюма", 1802, countryFrance);
        Author author5 = new Author("А. Кристи", 1890, countryEngland);
        Author author6 = new Author("Р. Киплинг", 1865, countryIndia);
        Author author7 = new Author("Р. Л. Стивенсон", 1850, countryEngland);
        Author author8 = new Author("А. Дюма", 1802, countryFrance);
        Author author9 = new Author("А. К. Дойл", 1859, countryEngland);
        Author author10 = new Author("Дж. К. Роулинг", 1965, countryEngland);

        Book book1 = new Book(author1, "'Три мушкетера'", 1965);
        Book book2 = new Book(author2, "'Приключения Шерлока Холмса'", 1980);
        Book book3 = new Book(author3, "'Одиссея капитана Блада'", 2001);
        Book book4 = new Book(author4, "'Королева Марго'", 1976);
        Book book5 = new Book(author5, "'Эркюль Пуаро (собрание)'", 1950);
        Book book6 = new Book(author6, "'Маугли'", 1993);
        Book book7 = new Book(author7, "'Остров сокровищ'", 1993);
        Book book8 = new Book(author8, "'Граф Монте-Кристо'", 1950);
        Book book9 = new Book(author9, "'Затеряный мир'", 1965);
        Book book10 = new Book(author10, "'Гарри Поттер (собрание)'", 2011);

        book = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        Book.printBookList(book);
        System.out.println();

        System.out.println(Language.interactionEN[0]);
        System.out.println(Language.interactionEN[1] + Language.interactionRU[1] + Language.interactionUA[1]);

        scanner = new Scanner(System.in);
        String userLanguage = String.valueOf(getUserData());
        switch (userLanguage) {
            case "1":
                language = Language.interactionEN;
                break;
            case "2":
                language = Language.interactionRU;
                break;
            case "3":
                language = Language.interactionUA;
                break;
            default:
                language = Language.interactionEN;
        }
        System.out.println(language[2]);
        System.out.println(language[3] + language[4] + language[5] + language[6] + language[7]);

        while (true) {
            int userChoice = getUserData();
            if (userChoice == 1) {
                searchByYear();
                break;
            }
            if (userChoice == 2) {
                searchByTitle();
                break;
            }
            if (userChoice == 3) {
                searchByAuthor();
                break;
            }
            if (userChoice == 0) {
                System.out.println(language[18]);
                break;
            }
            System.out.println(language[13]);
        }

        System.out.println();
        System.out.println(language[19]);
        scanner.close();

    }

    public static void searchByYear() {
        System.out.println(language[8] + language[11]);
        printYears(book);

        while (true) {
            int userData = getUserData();
            if (userData > 0) {
                boolean resultCheck = checkYear(userData);
                if (resultCheck) {
                    System.out.println(language[20]);
                    System.out.println();
                    printBookByYearFilter(userData);
                    break;
                }
                System.out.println(language[12] + userData);
            }
            if (userData == 0) {
                break;
            }
            System.out.println(language[13]);
        }
    }

    public static void searchByTitle() {
        System.out.println(language[9] + language[16]);
        printTitles();

        while (true) {
            String userTitle = scanner.next();
            boolean resultTitleSearch = checkTitle(userTitle);
            if (resultTitleSearch) {
                System.out.println(language[20]);
                System.out.println();
                printBookByTitleFilter(userTitle);
                break;
            }
            if (userTitle.equals("0")) {
                break;
            }
            System.out.println(language[17]);
        }
    }

    public static void searchByAuthor() {
        System.out.println(language[10] + language[22]);
        printAuthors();

        while (true) {
            String userAuthor = scanner.next();
            boolean resultAuthorSearch = checkAuthor(userAuthor);
            if (resultAuthorSearch) {
                System.out.println(language[20]);
                System.out.println();
                printBookByAuthorFilter(userAuthor);
                break;
            }
            if (userAuthor.equals("0")) {
                break;
            }
            System.out.println(language[23]);
        }
    }

    public static void printBookByYearFilter(int userYear) {
        for (Book element : book) {
            if (element.getBookYear() == userYear) {
                System.out.println(language[21] + element.getBookAuthor().getAuthorName() + language[24]
                        + element.getBookAuthor().getAuthorYearOfBirth() + language[25] + element.getBookAuthor().getAuthorCountry().getCountry()
                        + language[14] + element.getBookTitle() + language[15] + element.getBookYear());
            }
        }
    }

    public static void printBookByTitleFilter(String userTitle) {
        for (Book element : book) {
            if (element.getBookTitle().contains(userTitle)) {
                System.out.println(language[21] + element.getBookAuthor().getAuthorName() + language[24]
                        + element.getBookAuthor().getAuthorYearOfBirth() + language[25] + element.getBookAuthor().getAuthorCountry().getCountry()
                        + language[14] + element.getBookTitle() + language[15] + element.getBookYear());
            }
        }
    }

    public static void printBookByAuthorFilter(String userAuthor) {
        for (Book element : book) {
            if (element.getBookAuthor().getAuthorName().contains(userAuthor)) {
                System.out.println(language[21] + element.getBookAuthor().getAuthorName() + language[24]
                        + element.getBookAuthor().getAuthorYearOfBirth() + language[25] + element.getBookAuthor().getAuthorCountry().getCountry()
                        + language[14] + element.getBookTitle() + language[15] + element.getBookYear());
            }
        }
    }

    public static boolean checkYear(int userYear) {
        for (Book element : book) {
            if (element.getBookYear() == userYear) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTitle(String userTitle) {
        for (Book element : book) {
            if (element.getBookTitle().contains(userTitle)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkAuthor(String userAuthor) {
        for (Book element : book) {
            if (element.getBookAuthor().getAuthorName().contains(userAuthor)) {
                return true;
            }
        }
        return false;
    }

    public static void printYears(Book[] book) {
        for (Book element : book) {
            System.out.print(element.getBookYear() + " ");
        }
        System.out.println();
    }

    public static void printTitles() {
        for (Book element : book) {
            System.out.print(element.getBookTitle() + " ");
        }
        System.out.println();
    }

    public static void printAuthors() {
        for (Book element : book) {
            System.out.print(element.getBookAuthor().getAuthorName() + " ");
        }
        System.out.println();
    }

    public static int getUserData() {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}
