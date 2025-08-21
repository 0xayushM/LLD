package library;
import book.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final String name;
    private final List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

