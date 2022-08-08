package org.hillel.lessons.bookLibrary;

public class Author {

    private String authorName;

    private int authorYearOfBirth;

    private Country authorCountry;

    public String getAuthorName() {
        return authorName;
    }

    public int getAuthorYearOfBirth() {
        return authorYearOfBirth;
    }

    public Country getAuthorCountry() {
        return authorCountry;
    }

    public Author(String authorName, int authorYearOfBirth, Country authorCountry) {
        this.authorName = authorName;
        this.authorYearOfBirth = authorYearOfBirth;
        this.authorCountry = authorCountry;
    }
}
