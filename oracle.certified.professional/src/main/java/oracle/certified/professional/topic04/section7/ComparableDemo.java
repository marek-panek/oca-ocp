package oracle.certified.professional.topic04.section7;

import java.util.Collections;
import java.util.List;

/**
 * <b>| Topic 4.7 | - <i>Use java.util.Comparator and java.lang.Comparable.</i></b>
 * 
 * <p>
 * The {@code Comparable} interface is used by the {@code Collections.sort()} method and the {@code java.util.Arrays.sort()} method
 * to sort Lists and arrays of objects, respectively.<br />
 * To implement {@code Comparable}, a class must implement a single method, {@code compareTo()}.<br />
 * We can only implement {@code compareTo()} once in a class.
 * </p>
 * 
 * <p>
 * Here's an invocation of {@code compareTo()}:
 * <pre>
 * int x = thisObject.compareTo(anotherObject);
 * 
 * The compareTo() method returns an int with the following characteristics:
 * - Negative If thisObject < anotherObject
 * - Zero If thisObject == anotherObject
 * - Positive If thisObject > anotherObject
 * </pre>
 * </p>
 *
 * @author mpanek
 */
public class ComparableDemo {

    public static void main(String[] args) {
        final Library library = new Library();
        final List<Book> books = library.getBooks();

        System.out.println("Before sorting: ");
        print(books); // Show books before sorting

        Collections.sort(books); // Sort books by their ISBN number (Book's compareTo method is used)

        System.out.println("After sorting: ");
        print(books); // Show books after sorting
    }

    private static void print(final List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
