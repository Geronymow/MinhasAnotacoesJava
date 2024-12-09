package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> bookList = new ArrayList<>();

    public Library() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(String title) {
        for(Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookList.remove(book);
            }
        }
    }

    public String Showlist() {
        return bookList.toString();
    }


}
