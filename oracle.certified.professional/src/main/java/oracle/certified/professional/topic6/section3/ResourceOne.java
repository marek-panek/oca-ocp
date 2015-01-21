package oracle.certified.professional.topic6.section3;

/**
 * Demonstrates simple resource which can be used in the {@code try-with-resources} statement.
 *
 * @author mpanek
 */
public class ResourceOne implements AutoCloseable {

    public ResourceOne() {
        System.out.println("Creating first resource...");
    }

    @Override
    public void close() {
        System.out.println("Closing first resource...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
