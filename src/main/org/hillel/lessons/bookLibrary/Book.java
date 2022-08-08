package org.hillel.lessons.bookLibrary;

public class Book {

    private Author bookAuthor;

    private String bookTitle;

    private int bookYear;

    private int isbn;

    public Book(String bookTitle, int bookYear, int isbn) {
        this.bookTitle = bookTitle;
        this.isbn = isbn;
        this.bookYear = bookYear;
    }

    public Book(Author bookAuthor, String bookTitle, int bookYear) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookYear = bookYear;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookYear() {
        return bookYear;
    }

    public static void printBookList(Book[] book) {
        for (Book element : book) {
            System.out.println("Автор: " + element.getBookAuthor().getAuthorName() + "; Название: " + element.getBookTitle() + " (год издания: " + element.getBookYear() + ")");
        }
    }
}
