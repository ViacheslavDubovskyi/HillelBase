package org.hillel.lessons.arraysecond;

import java.util.Scanner;

public class HomeLibrary {

    public static void main(String[] args) {

//        Book book1 = new Book("А. Дюма","'Три мушкетера'", 1965);
//        Book book2 = new Book("А. К. Дойл","'Приключения Шерлока Холмса'",1980);
//        Book book3 = new Book("Р. Саббатини","'Одиссея капитана Блада'",2001);
//        Book book4 = new Book("А. Дюма","'Королева Марго'",1976);
//        Book book5 = new Book("А. Кристи","'Эркюль Пуаро (собрание)'",1950);
//        Book book6 = new Book("Р. Киплинг","'Маугли'",1993);
//        Book book7 = new Book("Р. Л. Стивенсон","'Остров сокровищ'",1993);
//        Book book8 = new Book("А. Дюма","'Граф Монте-Кристо'",1950);
//        Book book9 = new Book("А. К. Дойл","'Затеряный мир'", 1965);
//        Book book10 = new Book("Дж. К. Роулинг","'Гарри Поттер (собрание)'",2011);

//        Book[] book = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

//        Book.printBookListFromClass(book);
        System.out.println();

        String[] booksEN = {"'The Three Musketeers'", "'The Adventures of Sherlock Holmes'", "Captain Blood: His Odyssey", "'Queen Margo'",
                "'Hercule Poirot (collection)'", "'Mowgli'", "'Treasure Island'", "'The Count of Monte Cristo'", "'The Lost World'", "'Harry Potter (collection)'"};

        String[] booksRU = {"'Три мушкетера'", "'Приключения Шерлока Холмса'", "'Одиссея капитана Блада'", "'Королева Марго'", "'Эркюль Пуаро (собрание)'",
                "'Маугли'", "'Остров сокровищ'", "'Граф Монте-Кристо'", "'Затеряный мир'", "'Гарри Поттер (собрание)'"};

        String[] booksUA = {"'Три мушкетери'", "'Пригоди Шерлока Холмса'", "'Одісея капітана Блада'", "'Королева Марго'", "'Еркюль Пуаро (зібрання)'",
                "'Мауглі'", "'Острів скарбів'", "'Граф Монте-Кристо'", "'Загублений світ'", "'Гаррі Поттер (зібрання)'"};

        String[] authorsEN = {"A. Dumas", "R. Sabatini", "R. Kipling", "A. K. Doyle", "J. K. Rowling", "A. Christie", "R. L. Stevenson"};
        String[] authorsRU = {"А. Дюма", "Р. Саббатини", "Р. Киплинг", "А. К. Дойл", "Дж. К. Роулинг", "А. Кристи", "Р. Л. Стивенсон"};
        String[] authorsUA = {"А. Дюма", "Р. Саббатіні", "Р. Кіплінг", "А. К. Дойл", "Дж. К. Роулінг", "А. Крісті", "Р. Л. Стівенсон"};

        int[] years = {1980, 1965, 1993, 2011, 2001, 1976, 1950};
        int[] connections = {1, 0, 4, 5, 6, 2, 2, 6, 1, 3};
        int[] connectionByAuthors = {0, 3, 1, 0, 5, 2, 6, 0, 3, 4};

        String[] interactionEN = {"Please, choose the language ", "1 - English, ", "You selected English", "Hello! Please, choose the action: ",
                " 1 - search by year;", " 2 - search by title;", " 3 - search by author;", " 0 - exit from system:", "You have selected search by year.",
                "You have selected search by title.", "You have selected search by author.", " Please, enter year of publishing from:", "You input incorrect year: ",
                "Please, repeat input", ", book title: ", ", year of publishing: ", " Please, enter title from:", "You input incorrect title. Please, repeat input",
                "You chose exit from system", "Thanks. Bye!", "The result of searching:", "Author: ", "Please, enter the authors:", "You input incorrect name"};

        String[] interactionRU = {"Пожалуйста, выберите язык ", "2 - Русский, ", "Вы выбрали Русский", "Здравствуйте! Пожалуйста, выберите действие: ",
                " 1 - поиск по году издания;", " 2 - поиск по названию;", " 3 - поиск по автору;", " 0 - выход из системы:", "Вы выбрали поиск по году издания.",
                "Вы выбрали поиск по названию.", "Вы выбрали поиск по автору.", " Пожалуйста, введите год издания из:", "Вы ввели некорректный год.",
                "Пожалуйста, повторите ввод", ", название книги: ", ", год издания: ", " Пожалуйста, введите название из:", "Вы ввели неверное название. Пожалуйста, повторите ввод",
                "Вы выбрали выход из системы", "Спасибо. До свидания!", "Результаты поиска:", "Автор: ", " Пожалуйста, укажите автора:", "Вы ввели неправильное имя"};

        String[] interactionUA = {"Будь ласка, оберіть мову ", "3 - Українська:", "Ви обрали Українську", "Здрастуйте! Будь ласка, оберіть дію: ",
                " 1 - пошук за роком видання;", " 2 - пошук за назвою;", " 3 - пошук за автором;", " 0 - вихід із системи:", "Ви обрали пошук за роком видання.",
                "Ви обрали пошук за назвою.", "Ви обрали пошук за автором.", " Будь ласка, введіть рік видання з:", "Ви ввели некорректний рік.",
                "Будь ласка, повторіть введення", ", назва книги: ", ", рік видання: ", "Будь ласка, введіть назву з: ", "Ви ввели неправильну назву. Будь ласка, повторіть введення",
                "Ви обрали вихід із системи", "Дякуємо. До побачення!", "Результати пошуку:", "Автор: ", "Будь ласка, укажіть автора:", "Ви ввели неправильне ім'я"};

        Scanner scanner = new Scanner(System.in);
        String[] language;
        String[] books;
        String[] authors;
        System.out.println(interactionEN[0]);
        System.out.println(interactionEN[1] + interactionRU[1] + interactionUA[1]);

        String userLanguage = String.valueOf(getUserData(scanner));
        switch (userLanguage) {
            case "1":
                language = interactionEN;
                books = booksEN;
                authors = authorsEN;
                break;
            case "2":
                language = interactionRU;
                books = booksRU;
                authors = authorsRU;
                break;
            case "3":
                language = interactionUA;
                books = booksUA;
                authors = authorsUA;
                break;
            default:
                language = interactionEN;
                books = booksEN;
                authors = authorsEN;
        }
        System.out.println(language[2]);
        System.out.println(language[3] + language[4] + language[5] + language[6] + language[7]);

        while (true) {
            int userChoice = getUserData(scanner);
            if (userChoice == 1) {
                searchByYear(books, years, connections, scanner, language, authors, connectionByAuthors);
                break;
            }
            if (userChoice == 2) {
                searchByTitle(books, years, connections, scanner, language, authors, connectionByAuthors);
                break;
            }
            if (userChoice == 3) {
                searchByAuthor(books, years, connections, scanner, language, authors, connectionByAuthors);
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

    public static void searchByYear(String[] books, int[] years, int[] connections, Scanner scanner, String[] language,
                                    String[] authors, int[] connectionsByAuthors) {
        System.out.println(language[8] + language[11]);
        printYears(years);

        while (true) {
            int userData = getUserData(scanner);
            if (userData > 0) {
                boolean resultCheck = checkYear(years, userData);
                if (resultCheck) {
                    System.out.println(language[20]);
                    System.out.println();
                    printBookByYearFilter(books, years, connections, userData, language, authors, connectionsByAuthors);
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

    public static void searchByTitle(String[] books, int[] years, int[] connections, Scanner scanner, String[] language,
                                     String[] authors, int[] connectionsByAuthors) {
        System.out.println(language[9] + language[16]);
        printTitles(books);

        while (true) {
            String userTitle = scanner.next();
            boolean resultTitleSearch = checkTitle(books, userTitle);
            if (resultTitleSearch) {
                System.out.println(language[20]);
                System.out.println();
                printBookByTitleFilter(books, years, connections, userTitle, language, authors, connectionsByAuthors);
                break;
            }
            if (userTitle.equals("0")) {
                break;
            }
            System.out.println(language[17]);
        }
    }

    public static void searchByAuthor(String[] books, int[] years, int[] connections, Scanner scanner, String[] language,
                                      String[] authors, int[] connectionsByAuthors) {
        System.out.println(language[10] + language[22]);
        printAuthors(authors);

        while (true) {
            String userAuthor = scanner.next();
            boolean resultAuthorSearch = checkAuthor(authors, userAuthor);
            if (resultAuthorSearch) {
                System.out.println(language[20]);
                System.out.println();
                printBookByAuthorFilter(books, years, connections, userAuthor, language, authors, connectionsByAuthors);
                break;
            }
            if (userAuthor.equals("0")) {
                break;
            }
            System.out.println(language[23]);
        }
    }

    public static void printBookByYearFilter(String[] books, int[] years, int[] connections, int userYear, String[] language,
                                             String[] authors, int[] connectionsByAuthors) {
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            int elementAuthor = connectionsByAuthors[i];
            String author = authors[elementAuthor];
            int yearIndex = connections[i];
            int year = years[yearIndex];
            if (year == userYear) {
                System.out.println(language[21] + author + language[14] + book + language[15] + year);
            }
        }
    }

    public static void printBookByTitleFilter(String[] books, int[] years, int[] connections, String userTitle, String[] language,
                                              String[] authors, int[] connectionsByAuthors) {
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            int elementAuthor = connectionsByAuthors[i];
            String author = authors[elementAuthor];
            int yearIndex = connections[i];
            int year = years[yearIndex];
            if (book.contains(userTitle)) {
                System.out.println(language[21] + author + language[14] + book + language[15] + year);
            }
        }
    }

    public static void printBookByAuthorFilter(String[] books, int[] years, int[] connections, String userAuthor,
                                               String[] language, String[] authors, int[] connectionsByAuthors) {
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            int elementAuthor = connectionsByAuthors[i];
            String author = authors[elementAuthor];
            int yearIndex = connections[i];
            int year = years[yearIndex];
            if (author.contains(userAuthor)) {
                System.out.println(language[21] + author + language[14] + book + language[15] + year);
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

    public static boolean checkTitle(String[] books, String title) {
        for (String book : books) {
            if (book.contains(title)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkAuthor(String[] authors, String author) {
        for (String authorName : authors) {
            if (authorName.contains(author)) {
                return true;
            }
        }
        return false;
    }

    public static void printYears(int[] years) {
        for (int year : years) {
            System.out.print(year + " ");
        }
        System.out.println();
    }

    public static void printTitles(String[] books) {
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();
    }

    public static void printAuthors(String[] authors) {
        for (String author : authors) {
            System.out.print(author + " ");
        }
        System.out.println();
    }

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}

// public static void printBooks(String[] books, int[] years, int[] connections) {
//     for (int i = 0; i < books.length; i++) {
//         int yearIndex = connections[i];
//         System.out.println("Book title = " + books[i] + ", year of publishing: " + years[yearIndex]);
//     }
// }

//    while (true) {
//        int chosenLang = getUserData(scanner);
//        if (chosenLang == 1) {
//            for (int i = 0; i < interactions.length; i++) {
//                interactions[i] = interactionEn[i];
//            }
//            break;
