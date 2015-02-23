package oracle.certified.professional.topic04.section7;

import java.util.ArrayList;
import java.util.List;

public final class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        populate();
    }

    private void populate() {
        addBook(new Book("978-83-246-2188-0", "Clean code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 424));
        addBook(new Book("978-83-246-8500-4", "Test Driven Development: By Example", "Kent Beck", 232));
        addBook(new Book("978-83-246-3237-4", "The Pragmatic Programmer. From Journeyman to Master", "Andrew Hunt, David Thomas", 324));
    }

    public boolean addBook(final Book book) {
        return books.add(book);
    }

    public boolean removeBook(final Book book) {
        return books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

}
