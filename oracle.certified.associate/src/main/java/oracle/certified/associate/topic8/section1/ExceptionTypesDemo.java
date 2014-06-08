package oracle.certified.associate.topic8.section1;

import oracle.certified.associate.common.CustomCheckedException;

/**
 *  <b>| Topic 8.1 | -  <i>Differentiate among checked exceptions, RuntimeExceptions and Errors.</i></b>
 *  
 *  <p>
 *  An exception is an instance of a class derived directly, or indirectly, from the {@code Throwable} class.<br/>
 *  Two predefined Java classes are derived from {@code Throwable} — {@code Error} and {@code Exception}.<br/>
 *  </p>
 *  
 *  The two classes that derive from the {@code Exception} class support two types of exceptions:
 *  <ul>
 *      <li>Checked: These are exceptions that need to be dealt with in the code</li>
 *      <li>Unchecked: These are exceptions that do not need to be dealt with in the code</li>
 *  </ul>
 *  
 *  <p>
 *  Checked exceptions include all exceptions derived from the {@code Exception} class and are not derived from the {@code RuntimeException} class.<br/>
 *  These must be handled in code or the code will not compile cleanly, resulting in compile-time errors.
 * 
 * @author mpanek
 */
public class ExceptionTypesDemo {

    public static void m1() throws Exception {
        throw new Exception();
    }

    public static void m2() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    public static void main(String[] args) {
        // -----------------------------------------------------------------------
        // Doesn't compile as it is, it must be surrounded by try/catch clause or
        // the exception must be specified in throws clause of main method.
        // -----------------------------------------------------------------------
        // m1();

        // -----------------------------------------------------------------------
        // Doesn't compile as it is, it must be surrounded by try/catch clause or
        // the exception must be specified in throws clause of main method.
        // -----------------------------------------------------------------------
        // m2();

        // Good
        try {
            m1();
        } catch (Exception e) {
            System.err.println("Catched exception: " + e);
        }

        // Good
        try {
            m2();
        } catch (CustomCheckedException e) {
            System.err.println("Catched exception: " + e);
        }

        // -----------------------------------------------------------------------
        // This will generate a compile-time error.
        // The more specific exception in the hierarchy must be handled first.
        // Unreachable catch block for CustomCheckedException.
        // It is already handled by the catch block for Exception
        // -----------------------------------------------------------------------
        // try {
        // m2();
        // } catch (Exception e) {
        // System.err.println("Catched exception" + e);
        // } catch (CustomCheckedException e) {
        // System.err.println("Catched exception" + e);
        // }
    }
}
