package oracle.certified.professional.topic04.section1;

/**
 * Represents parameterized coordinate class.
 * 
 * <p>
 * Note that there is restriction for the type of the parameter here.
 * Only {@code Number} and its subclasses can be used.
 * </p>
 * 
 * @param <X> the type of x and y coordinates
 *
 * @author mpanek
 */
public class Coordinate<X extends Number> extends Pair<X, X> {

    public Coordinate(X x, X y) {
        super(x, y);
    }

}
