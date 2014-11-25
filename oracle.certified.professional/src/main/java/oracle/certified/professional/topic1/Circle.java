package oracle.certified.professional.topic1;

import java.util.Locale;

/**
 * Represents a circle.
 *
 * @author mpanek
 */
public class Circle extends Shape {
    private Point2D origin;
    private double radius;

    // No-arguments constructor
    public Circle() {
        this(new Point2D(), 10.0d);
    }

    // Overloaded constructor
    public Circle(Point2D origin, double radius) {
        super();
        this.origin = origin;
        this.radius = radius;
    }

    @Override
    public final double area() {
        return Math.PI * radius * radius;
    }

    public Point2D getOrigin() {
        return origin;
    }

    public void setOrigin(Point2D origin) {
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Circle: (origin: %1$s), (area: %2$.2f)", origin, area());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (origin == null ? 0 : origin.hashCode());
        long temp;
        temp = Double.doubleToLongBits(radius);
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
        Circle other = (Circle) obj;
        if (origin == null) {
            if (other.origin != null) {
                return false;
            }
        } else if (!origin.equals(other.origin)) {
            return false;
        }
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        return true;
    }

}
