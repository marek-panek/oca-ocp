package oracle.certified.professional.topic06.section5;

import java.util.Date;

/**
 * <b>| Topic 6.5 | -  <i>Test invariants by using assertions.</i></b>
 * 
 * <p>
 * The assertion mechanism was added to the language with version 1.4.<br/>
 * The {@code assert} statement is used to check or test your assumptions about the program.
 * </p>
 * 
 * <ul>
 *  <li>Assertions are condition checks in the program and are meant to be used for explicitly checking the assumptions you make while writing programs.</li>
 *  <li>The {@code assert} statement is of two forms: one that takes a {@code Boolean} argument and one that takes an additional string argument (or any value converted by toString() method).</li>
 *  <li>If the {@code Boolean} condition given in the assert argument fails (i.e., evaluates to {@code false}), the program will terminate after throwing an {@code AssertionError}.
 *      It is not advisable to catch and recover from when an {@code AssertionError} is thrown by the program.</li>
 *  <li>By default, assertions are disabled at runtime. You can use the command-line arguments of –ea (for enabling asserts) and –da (for disabling asserts) and their variants when you invoke the JVM.</li>
 * </ul>
 * 
 * <p>
 * <table border=1 cellpadding=5>
 *  <tr><td>Command-Line Argument</td><td>Short Description</td></tr>
 *  <tr><td>-ea</td><td>Enables assertions by default (except system classes).</td></tr>
 *  <tr><td>-ea:&lt;class name&gt;</td><td>Enables assertions for the given class name.</td></tr>
 *  <tr><td>-ea:&lt;package name&gt;...</td><td>Enables assertions in all the members of the given package &lt;package name&gt; including subpackages.</td></tr>
 *  <tr><td>-ea:...</td><td>Enables assertions in the given unnamed package.</td></tr>
 *  <tr><td>-esa</td><td>Short for -enablesystemsassertions; enables assertions in system classes. This option is rarely used.</td></tr>
 *  <tr><td>-da</td><td>Disables assertions by default (except system classes).</td></tr>
 *  <tr><td>-da:&lt;class name&gt;</td><td>Disables assertions for the given class name.</td></tr>
 *  <tr><td>-da:&lt;package name&gt;... </td><td>Disables assertions in all the members of the given package &lt;package name&gt; including subpackages.</td></tr>
 *  <tr><td>da:...</td><td>Disables assertions in the given unnamed package.</td></tr>
 *  <tr><td>-dsa</td><td>Short for -disablesystemsassertions; disables assertions in system classes. This option is rarely used.</td></tr>
 * </table>
 * </p>
 *
 * @author mpanek
 */
public class AssertionDemo {

    private int value = Integer.MIN_VALUE;

    @SuppressWarnings("unused")
    private void noReturn() {

    }

    private int aReturn() {
        return 1;
    }

    private void go() {
        int x = 1;
        boolean b = true;

        // -------------------------------------------------
        // the following six are legal assert statements
        // -------------------------------------------------
        assert x == 1;
        assert b;
        assert true;
        assert x == 1 : x;
        assert x == 1 : aReturn();
        assert x == 1 : new Date();

        // -------------------------------------------------
        // the following six are ILLEGAL assert statements
        // -------------------------------------------------

        // assert x = 1; // none of these are booleans
        // assert x;
        // assert 0;
        // assert x == 1 : ; // none of these return a value
        // assert x == 1 : noReturn();
        // assert x == 1 : Date date = null;
    }

    private void fail() {
        if (value < 0) {
            value = -value;
        }

        assert value >= 0 : "Value should be non-negative";
    }

    // --------------------------------------------------------------
    // Do not use assertions to validate arguments to a public method
    // --------------------------------------------------------------
    public void inappropriateUsage1(int arg) {
        assert arg > 0; // Inappropriate!
    }

    // --------------------------------------------------------------
    // Do not use assert expressions that can cause side effects
    // --------------------------------------------------------------
    public void inappropriateUsage2(int arg) {
        assert modifyValue(arg); // Inappropriate!
    }

    private boolean modifyValue(int value) {
        this.value = value;
        return true;
    }

    // To enable asserts run this demo program by: java -ea oracle.certified.professional.topic6.section5.AssertionDemo
    // ----------------------------------------------------------------------------------------------------------------
    // Do not use assertions to validate command-line arguments
    // ----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        assert args.length == 0; // Inappropriate!

        new AssertionDemo().go();
        new AssertionDemo().fail();
        new AssertionDemo().inappropriateUsage1(5);
        new AssertionDemo().inappropriateUsage2(5);
    }

}
