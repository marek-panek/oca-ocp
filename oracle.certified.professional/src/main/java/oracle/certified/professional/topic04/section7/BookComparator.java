package oracle.certified.professional.topic04.section7;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Sample book comparator.
 * 
 * @author mpanek
 */
public class BookComparator implements Comparator<Book>, Serializable {
    private static final long serialVersionUID = 2015_02_24_20_45_05L;

    @Override
    public int compare(Book book1, Book book2) {
        if (book1 == null && book2 == null) {
            return 0;
        } else if (book1 == null && book2 != null) {
            return -1;
        } else if (book1 != null && book2 == null) {
            return 1;
        } else {
            return Integer.compare(book1.getPages(), book2.getPages());
        }
    }

}
