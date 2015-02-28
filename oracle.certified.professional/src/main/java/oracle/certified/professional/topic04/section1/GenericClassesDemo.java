package oracle.certified.professional.topic04.section1;

import java.math.BigDecimal;

/**
 * <b>| Topic 4.1 | - <i>Create a generic class.</i></b>
 *
 * @author mpanek
 */
public class GenericClassesDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------------------------------------------------
        // Pair class does not impose any restrictions on the types of the parameters. They can be any type (all reference types).
        // ---------------------------------------------------------------------------------------------------------------------------------
        Pair<Integer, String> pair1 = new Pair<Integer, String>(2015, "OCP - 1Z0-804"); // The integer is automatically auto-boxed
        Pair<Integer, String> pair2 = new Pair<>(2015, "OCP - 1Z0-804"); // The same as above but using the 'diamond' syntax

        // Even Void can be used as parameter type, but only null value can be passed as an argument then
        Pair<Integer, Void> pair3 = new Pair<Integer, Void>(2015, null);

        // ---------------------------------------------------------------------------------------------------------------------------------
        // Coordinate class extends from Pair class and force that both type parameters should be the same type
        // and limited only to Number and its subclasses.
        // ---------------------------------------------------------------------------------------------------------------------------------
        Coordinate<Number> coordinate1 = new Coordinate<Number>(0.0f, 0.0f); // OK - Float is-a Number
        Coordinate<Number> coordinate2 = new Coordinate<Number>(0.0, 0.0); // OK - Double is-a Number
        Coordinate<Number> coordinate3 = new Coordinate<Number>(1.0, 1.0f); // OK - Double is-a Number, Float is-a Number
        Coordinate<Number> coordinate4 = new Coordinate<Number>(10, 10); // OK - Integer is-a Number

        Coordinate<Float> coordinate5 = new Coordinate<Float>(0.0f, 0.0f); // OK - Type perfect match
        Coordinate<Double> coordinate6 = new Coordinate<Double>(0.0, 0.0); // OK - Type perfect match

        // Coordinate<Float> coordinate7 = new Coordinate<Float>(0.0f, 0.0); // Does not compile! Mixed constructor types
        // Coordinate<Double> coordinate8 = new Coordinate<Double>(0.0, 0.0f); // Does not compile! Mixed constructor types

        // ---------------------------------------------------------------------------------------------------------------------------------
        // You cannot do that with Java Generics. It does not compile.
        // ---------------------------------------------------------------------------------------------------------------------------------
        // Float is-a Number, Integer is-a Number
        // but
        // Coordinate<Float> is not a subtype of Coordinate<Number>
        // Coordinate<Integer> is not a subtype of Coordinate<Number>
        // ---------------------------------------------------------------------------------------------------------------------------------
        // Coordinate<Number> coordinate9 = new Coordinate<Float>(0.0f, 0.0f);
        // Coordinate<Number> coordinate10 = new Coordinate<Integer>(0, 0);

        // This is OK. Notice the difference
        Coordinate<? extends Number> coordinate11 = new Coordinate<Float>(0.0f, 0.0f);
        Coordinate<? extends Number> coordinate12 = new Coordinate<BigDecimal>(BigDecimal.ZERO, BigDecimal.ZERO);
    }
}
