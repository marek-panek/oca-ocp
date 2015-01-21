package oracle.certified.professional.topic6.section3;

/**
 * Demonstrates simple resource which can be used in the {@code try-with-resources} statement.
 *
 * @author mpanek
 */
public class ResourceTwo implements AutoCloseable {

    public ResourceTwo() {
        System.out.println("Creating second resource...");
    }

    @Override
    public void close() {
        System.out.println("Closing second resource...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
