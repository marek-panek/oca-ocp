package oracle.certified.associate.topic6.overloading;

/**
 *  <b>| Topic 6.5 | -  <i>Create and overload constructors.</i></b>
 * 
 *  <p>
 *      In the same way in which you can overload methods in a class, you can also overload the constructors in a class.<br />
 *      <i>Overloaded constructors</i> follow the same rules as discussed in the previous section for overloaded methods.
 *  </p>
 *  
 *  <u>Rules for defining overloaded constructors:</u>
 *  <blockquote>
 *      <ul>
 *          <li>Overloaded constructors must be defined using different argument lists.</li>
 *          <li>Overloaded constructors can’t be defined by just a change in the access modifiers.</li>
 *          <li>Overloaded constructors may be defined using different access modifiers.</li>
 *          
 *          <li>A constructor can call another overloaded constructor by using the keyword this</li>
 *          <li>A constructor can’t invoke a constructor by using its class’s name.</li>
 *          <li>If present, the call to another constructor must be the first statement in a constructor.</li>
 *      </ul>
 *  </blockquote>
 * 
 * @author mpanek
 *
 */
public class ConstructorOverloading {

    private float score;
    private String exam;
    private boolean passed;

    // No-argument constructor
    public ConstructorOverloading() {
        this(100.0f, "OCA"); // The call to the overloaded constructor must be the first statement in a constructor.
    }

    // Constructor that accepts two arguments: float and String
    public ConstructorOverloading(float score, String exam) {
        this(score, exam, score >= 63);
    }

    // Constructor that accepts three arguments: float, String and boolean
    public ConstructorOverloading(float score, String exam, boolean passed) {
        this.score = score;
        this.exam = exam;
        this.passed = passed;
    }

    // Constructor that accepts two arguments: String and float
    public ConstructorOverloading(String exam, float score) {

    }

    // Constructor cannot have any return type, even void.
    // This is valid method name, though discouraged.
    void ConstructorOverloading() {

    }

    // ------------------------------------------------------------------------------------------------//
    // Constructors can’t be defined as overloaded ones if they only differ in their access modifiers.
    // ------------------------------------------------------------------------------------------------//

    // private ConstructorOverloading() {}

    // ------------------------------------------------------------------------------------------------//
    // Recursive constructor invocation are not allowed. (Compiler error)
    // ------------------------------------------------------------------------------------------------//

    // public ConstructorOverloading() { this(); }

    // ------------------------------------------------------------------------------------------------//
    // Circular calls to constructors are not allowed. (Compiler error)
    // ------------------------------------------------------------------------------------------------//

    // public ConstructorOverloading(String s) {
    // this(s, 'X');
    // }
    //
    // public ConstructorOverloading(String s, char c) {
    // this(s);
    // }

    @Override
    public String toString() {
        return "Exam name: " + exam + " score: " + score + " passed: " + passed;
    }

    public static void main(String[] args) {
        ConstructorOverloading co1 = new ConstructorOverloading();
        ConstructorOverloading co2 = new ConstructorOverloading(90.0f, "OCA");
        ConstructorOverloading co3 = new ConstructorOverloading(62.0f, "OCA");

        System.out.println(co1);
        System.out.println(co2);
        System.out.println(co3);
    }

}
