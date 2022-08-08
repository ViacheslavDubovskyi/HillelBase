package org.hillel.lessons.hashmap;

public class Book {

    private String name;
    private int isbn;
    private int year;

    public Book(String name, int isbn, int year) {
        this.name = name;
        this.isbn = isbn;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                ", year=" + year +
                '}';
    }
}
