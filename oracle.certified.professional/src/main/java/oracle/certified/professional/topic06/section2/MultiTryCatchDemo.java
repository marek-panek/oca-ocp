package oracle.certified.professional.topic06.section2;

import java.io.IOException;
import java.sql.SQLException;

/**
 * <b>| Topic 6.2 | -  <i>Develop code that handles multiple exception types in a single catch block.</i></b>
 * 
 * <p>
 * We use multi-catch when we want to reuse an exception handler.<br/>
 * We can list as many types as we want so long as none of them have a superclass/subclass relationship with each other.
 * </p>
 * 
 * <ul>
 *  <li>You can't use the variable name multiple times in a multi-catch. The following won't compile: {@code catch(Exception1 e1 | Exception2 e2)}</li>
 *  <li>With multi-catch, order doesn't matter. The following two snippets are equivalent to each other:
 *      {@code catch(SQLException | IOException e)} and {@code catch(IOException | SQLException e)}</li>
 *  <li>Multi-catch is only for exceptions in different inheritance hierarchies.
 *      The following won't compile: {@code catch(IOException | FileNotFoundException e)} and {@code catch(FileNotFoundException | IOException e)}</li>
 *  <li>When using multi-catch, the catch block parameter is final and cannot have a new value assigned in the catch block.</li>
 *  <li>If you catch a general exception as shorthand for specific subclass exceptions and rethrow the caught exception,
 *      you can still list the specific subclasses in the method signature. The compiler will treat it as if you had listed them out in the catch.</li>
 * </ul>
 *  
 * </ul>
 *
 * @author mpanek
 */
public class MultiTryCatchDemo {

    // ------------------------------------------------------------------------------------------------------------
    // The variable name cannot be used multiple times in a multi-catch.
    // ------------------------------------------------------------------------------------------------------------
    public void wrongUsage1() {
        // --------------------------------------------------------------------------------------------------------
        // Won't compile: Syntax error on token "e", delete this token
        // --------------------------------------------------------------------------------------------------------

        // try {
        // Files.createFile(Paths.get("dir"));
        // } catch (IOException e | UnsupportedOperationException e) { }
    }

    // ------------------------------------------------------------------------------------------------------------
    // Multi-catch is only for exceptions in different inheritance hierarchies.
    // ------------------------------------------------------------------------------------------------------------
    public void wrongUsage2() {
        // --------------------------------------------------------------------------------------------------------
        // Won't compile: The exception FileAlreadyExistsException is already caught by the alternative IOException
        // --------------------------------------------------------------------------------------------------------

        // try {
        // Files.createFile(Paths.get("dir"));
        // } catch (FileAlreadyExistsException | IOException e) { }
    }

    // ------------------------------------------------------------------------------------------------------------
    // The catch block parameter is final and cannot have a new value assigned in the catch block.
    // ------------------------------------------------------------------------------------------------------------
    public void wrongUsage3() {
        // --------------------------------------------------------------------------------------------------------
        // Won't compile: The parameter e of a multi-catch block cannot be assigned
        // --------------------------------------------------------------------------------------------------------

        // try {
        // Files.createFile(Paths.get("dir"));
        // } catch (IOException | UnsupportedOperationException e) {
        // e = new IOException();
        // }
    }

    public void couldThrowAnException() throws IOException, SQLException {
        // You may have noticed that this method doesn't actually throw an exception.
        // The compiler doesn't know this. The method signature is key to the compiler.
        // It can't assume that no exception gets thrown, as a subclass could override the method and throw an exception.
    }

    public void rethrow1() throws SQLException, IOException {
        try {
            couldThrowAnException();
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    // ------------------------------------------------------------------------------------------------------------
    // At the risk of being too repetitive, remember that catch (Exception e)
    // doesn't necessarily catch all Exception subclasses. In Java 7, it means catch all
    // Exception subclasses that would allow the method to compile.
    // ------------------------------------------------------------------------------------------------------------
    public void rethrow2() throws SQLException, IOException {
        try {
            couldThrowAnException();
        } catch (Exception e) { // Watch out: this isn't really catching all exception subclasses
            System.err.println(e.getMessage());
            throw e; // Note: won't compile in Java 6
        }
    }

    // ------------------------------------------------------------------------------------------------------------
    // Won't compile: Unhandled exception type Exception
    // ------------------------------------------------------------------------------------------------------------
    public void rethrow3() throws SQLException, IOException {
        // try {
        // couldThrowAnException();
        // } catch (Exception e) {
        // e = new IOException();
        // throw e; // Here is the compiler error
        // }
    }

    public void rethrow4() throws SQLException, IOException {
        try {
            couldThrowAnException();
        } catch (Exception e) {
            // These are all valid rethrow statements when applied individually.

            // throw new SQLException();
            // throw new IOException();
            // throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) throws Exception {
        final MultiTryCatchDemo tryCatchDemo = new MultiTryCatchDemo();

        tryCatchDemo.rethrow1();
        tryCatchDemo.rethrow2();
        tryCatchDemo.rethrow3();
        tryCatchDemo.rethrow4();
    }

}
