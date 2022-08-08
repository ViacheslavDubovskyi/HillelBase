package org.hillel.lessons.hashmap;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Book one = new Book("One", 133432, 2001);
        Book two = new Book("Two", 123553, 2001);
        Book three = new Book("Three", 312678, 2002);
        Book four = new Book("Four", 1333323, 2001);
        Book five = new Book("Five", 1232343, 2001);
        Book six = new Book("Six", 314434, 2002);
        Book emptyBook = new Book("", 0, 0);

        List<Book> bookList = new ArrayList<>(Arrays.asList(one, two, three, four, five, six));

        Map<Integer, Book> bookMap = new HashMap<>();

        for (Book element : bookList) {       // помещение элементов Map
            bookMap.put(element.getIsbn(), element);
        }

        Set<Integer> integers = bookMap.keySet(); // вывод полного набора ключей
        System.out.println(integers);

        ArrayList<Book> books = new ArrayList<>(bookMap.values()); // вывод полного набора значений
        System.out.println(books);

        System.out.println(bookMap.size()); // размер Map

        for (Map.Entry<Integer, Book> element : bookMap.entrySet()){ // обход элементов Map
            Integer key = element.getKey();
            Book value = element.getValue();
            System.out.println(element);
        }

        int isbn = 312678;
        Book defBook = bookMap.getOrDefault(isbn, emptyBook);  //вывод по умолчанию, при неудачном поиске
        System.out.println(defBook);

        boolean keyExist = bookMap.containsKey(isbn); // проверка на существование книги
        System.out.println(keyExist);

        Book foundBook = bookMap.get(isbn); // вывод книги по ключу
        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Book not found");
        }
    }
}


//        isbn = 312678;
//
//        Solution solution = new Solution();
//        Book book = solution.foundBook(bookList, isbn);
//        if (book != null) {
//            System.out.println(book);
//        }
//    }
//
//    private Book foundBook(List<Book> books, int isbn) {
//        for (Book element : books) {
//            if (isbn == element.getIsbn()) {
//                return element;
//            }
//        }
//        return null;
//    }
//