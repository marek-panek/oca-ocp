package oracle.certified.professional.topic04.section1;

/**
 * Represents parameterized pair class.
 * 
 * <p>
 * Note that there is no restriction for the type of the parameters here.
 * </p>
 *  
 * @param <X> type of the first item
 * @param <Y> type of the second item
 *
 * @author mpanek
 */
public class Pair<X, Y> {
    private X first;
    private Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public Y getsecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "" + first + " - " + second;
    }

}
