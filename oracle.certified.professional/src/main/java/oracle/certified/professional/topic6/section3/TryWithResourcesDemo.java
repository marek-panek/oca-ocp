package oracle.certified.professional.topic6.section3;

/**
 * <b>| Topic 6.3 | -  <i>Develop code that uses try-with-resources statements (including using classes that implement the AutoCloseable interface).</i></b>
 * 
 * <ul>
 *  <li>
 *      Forgetting to release resources by explicitly calling the {@code close()} method is a common mistake.
 *      You can use a try-with-resources statement to simplify your code and auto-close resources.
 *      For a resource to be usable in a try-with-resources statement, the class of that resource must
 *      implement the {@code java.lang.AutoCloseable} interface and define the {@code close()} method.
 *  </li>
 *  <li>
 *      You can auto-close multiple resources within a try-with-resources statement.
 *      These resources need to be separated by semicolons in the try-with-resources statement header.
 *  </li>
 *  <li>
 *      Because you can use multiple resources within a try-with-resources statement, the possibility
 *      of more than one exception getting thrown from the try block and the finally block is high.
 *      If a try block throws an exception, and a finally block also throws exception(s), then the
 *      exceptions thrown in the finally block will be added as suppressed exceptions to the exception
 *      that gets thrown out of the try block to the caller.
 *  </li>
 * </ul>
 * 
 * <p>
 *  <b>Comparing {@code java.lang.AutoCloseable} and {@code java.io.Closeable}</b>
 *  
 *  <table border=1>
 *      <tr>
 *          <td>a</td><td>AutoCloseable</td><td>Closeable</td>
 *      </tr>
 *      <tr>
 *          <td>Extends</td><td>None</td><td>AutoCloseable</td>
 *      </tr>
 *      <tr>
 *          <td>close method throws</td><td>Exception</td><td>IOException</td>
 *      </tr>
 *      <tr>
 *          <td>Must be idempotent (can call more than once without side effects)</td><td>Yes</td><td>No, but encouraged</td>
 *      </tr>  
 *  </table>
 * </p>
 *
 * @author mpanek
 */
public class TryWithResourcesDemo {

    // ---------------------------------------------------------------------------------------------------
    // Note that resource are closed in reverse order of creation and before going on to catch or finally.
    // This method generates the following output:
    // ---------------------------------------------------------------------------------------------------
    // Creating first resource...
    // Creating second resource...
    // ResourceOne
    // ResourceTwo
    // Closing second resource...
    // Closing first resource...
    // ---------------------------------------------------------------------------------------------------
    private void example1() {
        try (ResourceOne first = new ResourceOne(); ResourceTwo second = new ResourceTwo()) {
            System.out.println(first);
            System.out.println(second);
        }
    }

    // ---------------------------------------------------------------------------------------------------
    // This method generates the following output:
    // ---------------------------------------------------------------------------------------------------
    // Creating first resource...
    // Creating second resource...
    // ResourceOne
    // ResourceTwo
    // Closing second resource...
    // Closing first resource...
    // In the finally clause
    // ---------------------------------------------------------------------------------------------------
    private void example2() {
        try (ResourceOne first = new ResourceOne(); ResourceTwo second = new ResourceTwo();) { // <-- Last semicolon is optional but valid!
            System.out.println(first);
            System.out.println(second);
        } catch (Exception e) {
            System.out.println("In the catch clause");
        } finally {
            System.out.println("In the finally clause");
        }
    }

    // ---------------------------------------------------------------------------------------------------
    // This method generates the following output:
    // ---------------------------------------------------------------------------------------------------
    // Creating third resource...
    // ResourceThree
    // Closing third resource...
    // In the catch clause...
    // Main exception is: Exception in try block
    // Suppressed exception is: Exception in closing resource: ResourceThree
    // In the finally clause
    // ---------------------------------------------------------------------------------------------------
    private void example3() {
        try (ResourceThree third = new ResourceThree()) {
            System.out.println(third);
            throw new Exception("Exception in try block");
        } catch (Exception e) {
            System.out.println("In the catch clause...");
            System.out.println("Main exception is: " + e.getMessage());

            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("Suppressed exception is: " + t.getMessage());
            }
        } finally {
            System.out.println("In the finally clause");
        }
    }

    public void invalidUsage() {
        // ---------------------------------------------------------------------------------------------------
        // Won't compile: The resource type String does not implement java.lang.AutoCloseable
        // ---------------------------------------------------------------------------------------------------
        // try (String s = "Resource") {
        //
        // }

        // ---------------------------------------------------------------------------------------------------
        // Won't compile: Unhandled exception type Exception thrown by automatic close() invocation on third
        // ResourceThree's close method contains throws clause so the exception should be caught or declared
        // to be thrown.
        // ---------------------------------------------------------------------------------------------------
        // try (ResourceThree third = new ResourceThree()) {
        //
        // }

        // ---------------------------------------------------------------------------------------------------
        // Won't compile: Syntax error on token "(", Resources expected after this token
        // ---------------------------------------------------------------------------------------------------
        // try () { }
    }

    public static void main(String[] args) {
        TryWithResourcesDemo resourcesDemo = new TryWithResourcesDemo();

        System.out.println("----- First example -----");
        resourcesDemo.example1();

        System.out.println("----- Second example -----");
        resourcesDemo.example2();

        System.out.println("----- Third example -----");
        resourcesDemo.example3();
    }

}
