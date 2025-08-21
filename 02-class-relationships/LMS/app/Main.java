package app;

import author.Author;
import book.Book;
import ebook.Ebook;
import library.Library;
import reader.Reader;
import readingClub.ReadingClub;

public class Main {
    public static void main(String[] args) {
        // Authors
        Author orwell = new Author("George Orwell");
        Author uncleBob = new Author("Robert C. Martin");

        // Books (Readable)
        Book b1 = new Book("1984", orwell);
        Book b2 = new Ebook("Clean Code", uncleBob, "PDF");  // polymorphism: Ebook is-a Book

        // Library (aggregates books)
        Library cityLib = new Library("City Library");
        cityLib.addBook(b1);
        cityLib.addBook(b2);

        // Readers + Dependency (Reader uses Book)
        Reader ayush = new Reader("Ayush");
        Reader john  = new Reader("John");

        ayush.readBook(b1);
        john.readBook(b2);

        // ReadingClub (Aggregation of Readers)
        ReadingClub club = new ReadingClub("Evening Readers");
        club.addMember(ayush);
        club.addMember(john);


        System.out.println("\n--- Library Catalogue ---");
        for (Book bk : cityLib.getBooks()) {
            bk.read();  // dynamic dispatch for Ebook
        }

        System.out.println("\n--- Reading Club Members ---");
        for (Reader r : club.getMembers()) {
            System.out.println(r.getName());
        }
    }
}
