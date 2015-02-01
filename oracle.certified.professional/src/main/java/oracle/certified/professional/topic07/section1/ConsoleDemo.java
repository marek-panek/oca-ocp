package oracle.certified.professional.topic07.section1;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Arrays;

/**
 * <b>| Topic 7.1 | -  <i>Read and write data from the console.</i></b>
 * 
 * <p>This new Java 6 convenience class provides methods to read input from the console and write formatted output to the console.</p>
 * 
 * <pre>
 * public final class Console
 * extends Object
 * implements Flushable
 * </pre>
 * 
 * <p>
 * If this virtual machine has a console then it is represented by a unique instance of this class
 * which can be obtained by invoking the {@code System.console()} method.<br />
 * If no console device is available then an invocation of that method will return {@code null}.
 * </p>
 * 
 * <p>
 * Read and write operations are synchronized to guarantee the atomic completion of critical operations;
 * therefore invoking methods {@code readLine()}, {@code readPassword()}, {@code format()}, {@code printf()} <br />
 * as well as the read, format and write operations on the objects returned by {@code reader()} and {@code writer()} may block in multithreaded scenarios.
 * </p>
 * 
 * <p>
 * Invoking {@code close()} on the objects returned by the {@code reader()} and the {@code writer()} will not close the underlying stream of those objects.
 * </p>
 * 
 * <p>
 * The console-read methods return {@code null} when the end of the console input stream is reached,
 * for example by typing {@code control-D} on Unix or {@code control-Z} on Windows.<br />
 * Subsequent read operations will succeed if additional characters are later entered on the console's input device.
 * </p>
 * 
 * <p>
 * Unless otherwise specified, passing a {@code null} argument to any method in this class will cause a {@code NullPointerException} to be thrown.
 * </p>
 *  
 * @author mpanek
 */
public class ConsoleDemo {

    private static void readCreadentials(final Console console, boolean formatInput) {
        assert console != null;

        String userName = null;
        char[] passwd = null;

        if (formatInput) {
            userName = console.readLine("[%1$s]: ", "User name");
            passwd = console.readPassword("[%1$s]: ", "Password");
        } else {
            userName = console.readLine();
            passwd = console.readPassword();
        }

        console.format("Username: %1$s%nPassword: %2$s%n", userName, new String(passwd));

        Arrays.fill(passwd, ' ');
    }

    // --------------------------------------------------------------------------------
    // Run this example from outside IDE
    // --------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        final Console console = System.console();

        if (console != null) {
            console.format("%s...%n", "Type your credentials");

            boolean formatInput = false;

            do {
                readCreadentials(console, formatInput);
                formatInput = !formatInput;
            } while (formatInput);

            // --------------------------------------------------------------------------------
            // You can also get instances of Reader and PrintWriter
            // --------------------------------------------------------------------------------
            Reader reader = console.reader();
            PrintWriter writer = console.writer();

            writer.println("Type your message and press Control+Z to mark the end...");
            writer.flush();

            StringBuilder sb = new StringBuilder();
            int i = 0;
            while ((i = reader.read()) != -1) {
                sb.append((char) i);
            }

            writer.write(sb.toString());
            writer.flush();
        }

    }

}
