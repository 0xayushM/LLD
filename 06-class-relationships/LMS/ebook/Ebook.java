package ebook;
import author.Author;
import book.Book;

public class Ebook extends Book {
    private final String fileFormat;

    public Ebook(String title, Author author, String fileFormat) {
        super(title, author); // inherit title and author from Book
        this.fileFormat = fileFormat;
    }
    
    @Override
    public void read() {
        super.read(); // print Book details
        System.out.println("File format : "+ fileFormat);
    }

    public String getFileFormat() {
        return fileFormat;
    }
}
