package oracle.certified.professional.topic07.section2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * <b>| Topic 7.2 | -  <i>Use streams to read from and write to files by using classes in the java.io package including BufferedReader, BufferedWriter, File, FileReader, FileWriter, DataInputStream, DataOutputStream, ObjectOutputStream, ObjectInputStream, and PrintWriter.</i></b>
 * 
 * <p>
 * The {@code File} class is "an abstract representation of file and directory pathnames."<br />
 * The {@code File} class isn't used to actually read or write data; it's used to work at a higher level,<br />
 * making new empty files, searching for files, deleting files, making directories, and working with paths.
 * </p>
 *
 * @author mpanek
 */
public class FileDemo {

    public static boolean createDir(String name) {
        System.out.println("Creating directory: " + name);
        final File directory = new File(name);
        System.out.println("Checking whether it already exists: " + directory.exists());
        return directory.mkdir();
    }

    public static boolean createSubdirs(String directory, String name) {
        System.out.println("Creating subdirectories under " + directory + " with path: " + name);
        final File subdirectory = new File(directory, name);
        System.out.println("Checking whether it already exists: " + subdirectory.exists());
        return subdirectory.mkdirs();
    }

    public static boolean createNewFile(String directory, String name) throws IOException {
        System.out.println("Creating new file: " + name);
        final File file = new File(directory, name);
        System.out.println("Checking whether it already exists: " + file.exists());
        return file.createNewFile();
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("The result of the first attempt is: " + createDir("main"));
        System.out.println("The result of the second  attempt is: " + createDir("main"));
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("The result of the first attempt is: " + createSubdirs("main", "child/grandchild"));
        System.out.println("The result of the second  attempt is: " + createSubdirs("main", "child/grandchild"));
        System.out.println("----------------------------------------------------------------------------------");

        try {
            System.out.println("The result of the first attempt is: " + createNewFile("main", "main.txt"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("---------------------------- Checking some attributes ----------------------------");
        final File mainFile = new File("main", "main.txt");
        System.out.format("%1$-15s: %2$20b%n", "Exists", mainFile.exists());
        System.out.format("%1$-15s: %2$20b%n", "Is file", mainFile.isFile());
        System.out.format("%1$-15s: %2$20b%n", "Is directory", mainFile.isDirectory());
        System.out.format("%1$-15s: %2$20b%n", "Is absolute", mainFile.isAbsolute());
        System.out.format("%1$-15s: %2$20b%n", "Is hidden", mainFile.isHidden());

        System.out.format("%1$-15s: %2$20b%n", "Can execute", mainFile.canExecute());
        System.out.format("%1$-15s: %2$20b%n", "Can read", mainFile.canRead());
        System.out.format("%1$-15s: %2$20b%n", "Can write", mainFile.canWrite());
        System.out.format("%1$-15s: %2$tF %2$tT%n ", "Last modified", mainFile.lastModified());

        System.out.println("---------------------------- Changing some attributes ----------------------------");
        mainFile.setReadable(false);
        mainFile.setWritable(false);
        mainFile.setExecutable(false);
        mainFile.setLastModified(new Date().getTime());

        System.out.format("%1$-15s: %2$20b%n", "Can execute", mainFile.canExecute());
        System.out.format("%1$-15s: %2$20b%n", "Can read", mainFile.canRead());
        System.out.format("%1$-15s: %2$20b%n", "Can write", mainFile.canWrite());
        System.out.format("%1$-15s: %2$tF %2$tT%n", "Last modified", mainFile.lastModified());

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Trying to delete file: " + mainFile.getName());
        System.out.println("Successfully deleted: " + mainFile.delete());

        final File mainDir = new File("main");
        System.out.println("Trying to delete directory: " + mainDir);
        // The directory must be empty in order to be deleted.
        boolean result = mainDir.delete();
        System.out.println("Successfully deleted: " + result);

        // Now the directories should be deleted
        new File(mainDir, "child/grandchild").delete();
        new File(mainDir, "child").delete();
        mainDir.delete();
    }

}
