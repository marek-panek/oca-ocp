package oracle.certified.professional.topic07.section2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrates the usage of {@code FileReader} and {@code FileWriter}.
 * 
 * <p>
 * In practice, you probably won't use the {@code FileReader} and {@code FileWriter} classes without wrapping them.
 * </p>
 * 
 * <table border='1' cellpadding='2'>
 *  <tr><td>java.io Class</td><td>Superclasses</td><td>Constructor(s)</td><td>Key Methods</td></tr>
 *  <tr>
 *      <td><code>FileReader</code></td>
 *      <td>
 *          <code>Reader(abstract)<br />|<br />InputStreamReader(non-abstract)</code>
 *      </td>
 *      <td>
 *          <code>
 *              public FileReader(String fileName) throws FileNotFoundException<br />
 *              public FileReader(File file) throws FileNotFoundException<br />
 *              public FileReader(FileDescriptor fd)
 *          </code>
 *      </td>
 *      <td>
 *          <code>
 *              public int read() throws IOException<br />
 *              public int read(char cbuf[]) throws IOException<br />
 *              public int read(char cbuf[], int off, int len) throws IOException<br />
 *              public boolean ready() throws IOException<br />
 *              public void close() throws IOException
 *          </code>
 *     </td>
 *  </tr>
 *  <tr>
 *      <td><code>FileWriter</code></td>
 *      <td>
 *          <code>Writer(abstract)<br />|<br />OutputStreamWriter(non-abstract)</code>
 *      </td>
 *      <td>
 *          <code>
 *              public FileWriter(String fileName) throws FileNotFoundException<br />
 *              public FileWriter(String fileName, boolean append) throws IOException<br />
 *              public FileWriter(File file) throws FileNotFoundException<br />
 *              public FileWriter(File file, boolean append) throws IOException<br />
 *              public FileWriter(FileDescriptor fd)
 *          </code>
 *      </td>
 *      <td>
 *          <code>
 *              public void write(int c) throws IOException<br />
 *              public void write(char cbuf[], int off, int len) throws IOException<br />
 *              public void write(String str, int off, int len) throws IOException<br />
 *              public void flush() throws IOException<br />
 *              public void close() throws IOException
 *          </code>
 *      </td>
 *  </tr>
 * </table>
 *
 * @author mpanek
 */
public class ReaderWriterDemo {
    private static final String FILE_NAME = "OCP.txt";

    private static void writeToFile() throws IOException {
        final File toWrite = new File(FILE_NAME); // just an object

        try (final FileWriter writer = new FileWriter(toWrite)) { // create an actual file and a FileWriter object
            writer.write("Oracle Certified Professional\n");
            writer.append("Java SE 7 Programmer (1Z0-804)\n"); // if null is passed four characters 'null' string is added
            writer.flush();
        }
    }

    private static String readFromFile() throws IOException {
        final File toRead = new File(FILE_NAME);

        char[] buffer = new char[50];

        try (final FileReader reader = new FileReader(toRead)) {
            reader.read(buffer, 0, buffer.length);
        }

        return new String(buffer);
    }

    public static void main(String[] args) {

        try {
            writeToFile();
            String fileContent = readFromFile();
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            new File(FILE_NAME).delete();
        }

    }
}
