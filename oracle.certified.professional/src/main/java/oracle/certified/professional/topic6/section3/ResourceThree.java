package oracle.certified.professional.topic6.section3;

/**
 * Demonstrates simple resource which can be used in the {@code try-with-resources} statement.
 *
 * @author mpanek
 */
public class ResourceThree implements AutoCloseable {

    public ResourceThree() {
        System.out.println("Creating third resource...");
    }

    // Note that if close method declares throws then that Exception must be caught in catch clause in try-with-resources
    // or the calling method must declare it too.
    @Override
    public void close() throws Exception {
        System.out.println("Closing third resource...");
        throw new Exception("Exception in closing resource: " + this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
