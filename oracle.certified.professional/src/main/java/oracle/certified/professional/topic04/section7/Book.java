package oracle.certified.professional.topic04.section7;

/**
 * Represents a book.
 *
 * @author mpanek
 */
public class Book implements Comparable<Book> {

    private String isbn;
    private String title;
    private String author;
    private int pages;

    public Book(String isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(final Book other) {
        return isbn.compareTo(other.isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        }

        final Book other = (Book) o;
        return isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return isbn + " " + title + " by " + author + " pages: " + pages;
    }

}
