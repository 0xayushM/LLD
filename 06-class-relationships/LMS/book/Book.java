package book;
import author.Author;
import readable.Readable;

public class Book implements Readable {
    private final String title;
    private final Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }

    @Override
    public void read() {
        System.out.println("Book name is "+ title +" written by "+ author.getName());
    }
}
