package oracle.certified.professional.topic01;

import java.util.Locale;

/**
 * Represents a square.
 *
 * @author mpanek
 */
public class Square extends Shape {
    private double side;

    public Square() {
        this(10.0d);
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public final double area() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Square: (side: %1$.2f), (area: %2$.2f)", side, area());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = prime * result + (int) (temp ^ temp >>> 32);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Square other = (Square) obj;
        if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side)) {
            return false;
        }
        return true;
    }

}
