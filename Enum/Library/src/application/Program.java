package application;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many books will be included? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; n>= i; i++) {
            System.out.println("Book #" + i + ": ");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Year: ");
            Integer year = sc.nextInt();
            sc.nextLine();
            System.out.print("Author's name: ");
            String name = sc.nextLine();
            System.out.print("Author's nationality: ");
            String nationality = sc.nextLine();
            System.out.println();

            Author author = new Author(name,nationality);

            Book book = new Book(title,year, author);

            Library library = new Library();

            library.addBook(book);

            if (n == i) {
                for (Book bookList : library.getBookList()) {
                    System.out.println(bookList.toString());
                }
            }
        }
        
    }
}
