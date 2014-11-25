package oracle.certified.professional.topic1;

/**
 * Demonstrates dynamic polymorphism. 
 * 
 * <p>
 * A <b>class</b> is a fundamental abstraction entity and building block in OOP.<br/>
 * A class encapsulates state (data) and behavior (operations) of an entity.<br/>
 * For example, a Circle class defines a blueprint for individual circle objects.<br/>
 * The Circle class has state information such as radius and operations such as area().
 * </p>
 * 
 * <ul>
 *      <li>A <b>class</b> is a template (or blueprint), and an <b>object</b> is an instance of a class.</li>
 *      <li>Every class has a constructor. If you do not explicitly write a constructor for a class, the Java compiler 
 *          provides a default constructor (without any parameter) for that class.</li>
 *      <li>A constructor does not have a return type. If you define a return type, it is not a constructor, but a method!</li>
 *      <li>The signature of a method is made up of the method name, number of arguments, and types of arguments.
 *          You can overload methods with same name but with different signatures. Since return type and exception
 *          specification are not part of the signature, you cannot overload methods based on return type or exception specification alone.</li>
 * </ul>
 *
 * @author mpanek
 */
public class ShapesDemo {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Circle(new Point2D(5.0d, 5.0d), 5.0d);
        Shape shape3 = new Square();
        Shape shape4 = new Square(20.0d);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
    }

}
