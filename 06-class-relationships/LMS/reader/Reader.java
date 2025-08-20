package reader;
import book.Book;

public class Reader {
    private final String name;

    public Reader(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void readBook(Book book) {
        book.read();
    }
}
