package oracle.certified.professional.topic02.section4.anonymous;

/**
 * Covers the creation of anonymous inner classes.
 * 
 * <p>
 *  Anonymous interface implementers:
 *  <ul>
 *      <li>They can implement only one interface.</li>
 *      <li>There simply isn't any mechanism to say that your anonymous inner class is going to implement multiple interfaces.</li>
 *      <li>In fact, an anonymous inner class can't even extend a class and implement an interface at the same time.</li>
 *      <li>The inner class has to choose either to be a subclass of a named class and not directly implement any interfaces at all
 *          or to implement a single interface.</li>
 *      <li>If the anonymous inner class is a subclass of a class type, it automatically becomes an implementer of any interfaces
 *          implemented by the superclass.</li>
 *  </ul>
 *  </p>
 *  
 * @author mpanek
 */
public class AnonymousClassDemo {

    private static void prepareMeal(final Cookable cookable) {
        cookable.cook();
    }

    public static void main(String[] args) {
        // -------------------------------------------------------------------------
        // Creates an anonymous subclass of the specified class type
        // -------------------------------------------------------------------------
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Anonymous eat method");
            };

            public void drink() {
                System.out.println("Anonymous drink method");
            }
        }; // <--- Be aware of the ending semicolon

        animal.eat();
        // animal.drink(); // Not legal! Class Animal doesn't have drink()

        // -------------------------------------------------------------------------
        // Creates an anonymous implementer of the specified interface type.
        // -------------------------------------------------------------------------
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cookable implementer 1");
            }
        }; // <--- Be aware of the ending semicolon

        c.cook();

        prepareMeal(c);

        prepareMeal(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cookable implementer 2");
            }
        }); // <--- Argument local anonymous classes end like this: });
    }

}
