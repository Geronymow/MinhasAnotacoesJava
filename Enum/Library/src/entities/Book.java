package entities;

public class Book {

    private String title;
    private Integer year;
    private Author author;

    public Book() {
    }
    public Book(String title, Integer year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                ", " +
                "year: " + year  +
                ", " +
                "Author: " + author.getName() +
                ", " +
                "Nationality: " + author.getNationality();

    }
}
