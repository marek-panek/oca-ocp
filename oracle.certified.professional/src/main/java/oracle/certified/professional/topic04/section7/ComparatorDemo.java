package oracle.certified.professional.topic04.section7;

import java.util.Collections;
import java.util.List;

/**
 * <b>| Topic 4.7 | - <i>Use java.util.Comparator and java.lang.Comparable.</i></b>
 * 
 * <p>
 * While looking up the {@code Collections.sort()} method,
 * you might have noticed that there is an overloaded version of {@code sort()}
 * that takes both a {@code List} AND something called a {@code Comparator}.
 * </p>
 * 
 * <p>
 * The {@code Comparator} interface gives you the capability to sort a given collection
 * any number of different ways. The other handy thing about the {@code Comparator} interface is that
 * you can use it to sort instances of any class—even classes you can't modify—unlike 
 * the {@code Comparable} interface, which forces you to change the class whose instances you want to sort.
 * The {@code Comparator} interface is also very easy to implement, having only one method, {@code compare()}.
 * </p>
 * 
 * <p>
 * A comparison function, which imposes a total ordering on some collection of objects.
 * Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order.
 * Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps),
 * or to provide an ordering for collections of objects that don't have a natural ordering.
 * </p>
 * 
 * <p>
 * The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals<br />
 * if and only if {@code c.compare(e1, e2)==0} has the same boolean value as {@code e1.equals(e2)} for every e1 and e2 in S.
 * </p>
 * 
 * Caution should be exercised when using a comparator capable of imposing an ordering inconsistent with equals to order a sorted set (or sorted map).<br />
 * 
 * Suppose a sorted set (or sorted map) with an explicit comparator c is used with elements (or keys) drawn from a set S.
 * If the ordering imposed by c on S is inconsistent with equals, the sorted set (or sorted map) will behave "strangely."
 * In particular the sorted set (or sorted map) will violate the general contract for set (or map), which is defined in terms of equals.<br />
 * 
 * For example, suppose one adds two elements a and b such that (a.equals(b) && c.compare(a, b) != 0) to an empty TreeSet with comparator c.
 * The second add operation will return true (and the size of the tree set will increase) because a and b are not equivalent from the tree set's perspective,
 * even though this is contrary to the specification of the Set.add method.
 * </p>
 * 
 * <p>
 * Note: It is generally a good idea for comparators to also implement {@code java.io.Serializable},
 * as they may be used as ordering methods in serializable data structures (like {@code TreeSet}, {@code TreeMap}).
 * In order for the data structure to serialize successfully, the comparator (if provided) must implement {@code Serializable}.
 * </p>
 * 
 * <p>
 * Unlike {@code Comparable}, a comparator may optionally permit comparison of null arguments, while maintaining the requirements for an equivalence relation. 
 * </p>
 *
 * @author mpanek
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        final Library library = new Library();
        final List<Book> books = library.getBooks();

        System.out.println("Before sorting: ");
        print(books); // Show books before sorting

        final BookComparator bookComparator = new BookComparator();

        Collections.sort(books, bookComparator); // Sort books with the specified Comparator

        System.out.println("After sorting: ");
        print(books); // Show books after sorting

        Collections.sort(books, Collections.reverseOrder(bookComparator)); // Sort books with the specified Comparator in reverse direction

        System.out.println("After reverse sorting: ");
        print(books); // Show books after sorting
    }

    private static void print(final List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
