package oracle.certified.associate.topic8.section4;

import oracle.certified.associate.common.CustomCheckedException;
import oracle.certified.associate.common.CustomUncheckedException;

/**
 * <b>| Topic 8.4 | -  <i>Invoke a method that throws an exception.</i></b>
 * 
 * @author mpanek
 */
public class InvokingMethodsWithExceptions {

    public static void m1() {
        System.out.println("Inside m1 method...");
    }

    public static void m2() throws Exception {
        System.out.println("Inside m2 method...");
        throw new Exception("Exception thrown in method m2.");
    }

    // The throws clause only informs the compiler that this method may throw exceptions of
    // the specified type and its subclasses. It also implies that it must be handled by try/catch construct
    // when invoked or invoking method must declare it in the throws clause.
    // It is OK not to throw any exception inside such a method.
    public static void m3() throws CustomCheckedException {
        System.out.println("Inside m3 method...");
    }

    // It is not needed to specify RuntimeException to be thrown in method's throws clause.
    public static void m4() throws RuntimeException {
        System.out.println("Inside m4 method...");
    }

    // It is not needed to specify any subclasses of RuntimeException to be thrown in method's throws clause.
    public static void m5() throws CustomUncheckedException {
        System.out.println("Inside m5 method...");
        throw new CustomUncheckedException("Exception thrown in method m5.");
    }

    public static void main(String[] args) throws CustomCheckedException {
        // ------------------------------------------------------------------------------------------------------------
        // Even though method m1 doesn't declare any exception to be thrown, it can be surrounded by a try/catch block.
        // This is only the case when catch clause contain Throwable, RuntimeException or any of its subclasses,
        // Exception. Any custom specified checked exceptions will generate compile-time error.
        // ------------------------------------------------------------------------------------------------------------
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Catched exception: " + e);
        } finally {
            System.out.println("Finally after invoking m1.");
        }

        try {
            m2();
        } catch (Exception e) {
            System.out.println("Catched exception: " + e);
        } finally {
            System.out.println("Finally after invoking m2.");
        }

        // ------------------------------------------------------------------------------------------------------------
        // It is OK here because the main method which invokes it declares expected exception in the throws clause
        // ------------------------------------------------------------------------------------------------------------
        m3();

        // ------------------------------------------------------------------------------------------------------------
        // There is no need to catch any unchecked exceptions, but is no problem to do so.
        // ------------------------------------------------------------------------------------------------------------
        m4();

        // ------------------------------------------------------------------------------------------------------------
        // This is valid.
        // ------------------------------------------------------------------------------------------------------------
        try {
            m5();
        } catch (CustomUncheckedException e) {
            System.out.println("Catched exception: " + e);
        } finally {
            System.out.println("Finally after invoking m5.");
        }

        // ------------------------------------------------------------------------------------------------------------
        // This is also valid.
        // ------------------------------------------------------------------------------------------------------------
        try {
            m5();
        } catch (RuntimeException e) {
            System.out.println("Catched exception: " + e);
        } finally {
            System.out.println("Finally after invoking m5.");
        }

        try {
            m5();
        } catch (Exception e) {
            System.out.println("Catched exception: " + e);
        } finally {
            System.out.println("Finally after invoking m5.");
        }

    }

}
