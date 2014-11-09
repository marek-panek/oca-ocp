/**
 * Oracle Certified Professional, Java SE 7 Programmer (1Z0-804) exam objectives.
 * 
 *  <pre>
 *  +--------------------------------------------------------------------------------------------------+
 *  |                                  Java SE 7 Programmer II                                         |
 *  +---------------------------------------+----------------------------------------------------------+
 *  |   Exam Number                         |   1Z0-804                                                |
 *  |   Associated Certifications           |   Oracle Certified Professional, Java SE 7 Programmer    |
 *  |   Duration                            |   150 minutes                                            |
 *  |   Number of Questions                 |   90                                                     |
 *  |   Passing Score                       |   65%                                                    |
 *  |   Format                              |   Multiple Choice                                        |
 *  +---------------------------------------+----------------------------------------------------------+
 *  </pre>
 *  
 *  <ol>
 *      <li>Java Class Design 
 *          <ul>
 *              <li>Use access modifiers: private, protected, and public</li>
 *              <li>Override methods</li>
 *              <li>Overload constructors and methods</li>
 *              <li>Use the instanceof operator and casting</li>
 *              <li>Use virtual method invocation</li>
 *              <li>Override the hashCode, equals, and toString methods from the Object class to improve the functionality of your class.</li>
 *              <li>Use package and import statements</li>
 *          </ul>
 *      </li>
 *      <li>Advanced Class Design
 *          <ul>
 *              <li>Identify when and how to apply abstract classes</li>
 *              <li>Construct abstract Java classes and subclasses</li>
 *              <li>Use the static and final keywords</li>
 *              <li>Create top-level and nested classes</li>
 *              <li>Use enumerated types</li>
 *          </ul>
 *      </li>
 *      <li>Object-Oriented Design Principles
 *          <ul>
 *              <li>Write code that declares, implements and/or extends interfaces</li>
 *              <li>Choose between interface inheritance and class inheritance</li>
 *              <li>Apply cohesion, low-coupling, IS-A, and HAS-A principles</li>
 *              <li>Apply object composition principles (including has-a relationships)</li>
 *              <li>Design a class using a Singleton design pattern</li>
 *              <li>Write code to implement the Data Access Object (DAO) pattern</li>
 *              <li>Design and create objects using a factory pattern</li>
 *          </ul>
 *      </li>
 *      <li>Generics and Collections
 *          <ul>
 *              <li>Create a generic class</li>
 *              <li>Use the diamond for type inference</li>
 *              <li>Analyze the interoperability of collections that use raw types and generic types</li>
 *              <li>Use wrapper classes, autoboxing and unboxing</li>
 *              <li>Create and use List, Set and Deque implementations</li>
 *              <li>Create and use Map implementations</li>
 *              <li>Use java.util.Comparator and java.lang.Comparable</li>
 *              <li>Sort and search arrays and lists</li>
 *          </ul>
 *      </li>
 *      <li>String Processing
 *          <ul>
 *              <li>Search, parse and build strings (including Scanner, StringTokenizer, StringBuilder, String and Formatter)</li>
 *              <li>Search, parse, and replace strings by using regular expressions, using expression patterns for matching limited to: . (dot), * (star), + (plus), ?, \d, \D, \s, \S,  \w, \W, \b. \B, [], ().</li>
 *              <li>Format strings using the formatting parameters: %b, %c, %d, %f, and %s in format strings.</li>
 *          </ul>
 *      </li>
 *      <li>Exceptions and Assertions
 *          <ul>
 *              <li>Use throw and throws statements</li>
 *              <li>Develop code that handles multiple Exception types in a single catch block</li>
 *              <li>Develop code that uses try-with-resources statements (including using classes that implement the AutoCloseable interface)</li>
 *              <li>Create custom exceptions</li>
 *              <li>Test invariants by using assertions</li>
 *          </ul>
 *      </li>
 *      <li>Java I/O Fundamentals
 *          <ul>
 *              <li>Read and write data from the console</li>
 *              <li>Use streams to read from and write to files by using classes in the java.io package including BufferedReader, BufferedWriter, File, FileReader, FileWriter, DataInputStream, DataOutputStream, ObjectOutputStream, ObjectInputStream, and PrintWriter</li>
 *          </ul>
 *      </li>
 *      <li>Java File I/O (NIO.2)
 *          <ul>
 *              <li>Operate on file and directory paths with the Path class</li>
 *              <li>Check, delete, copy, or move a file or directory with the Files class</li>
 *              <li>Read and change file and directory attributes, focusing on the BasicFileAttributes, DosFileAttributes, and PosixFileAttributes interfaces</li>
 *              <li>Recursively access a directory tree using the DirectoryStream and FileVisitor interfaces</li>
 *              <li>Find a file with the PathMatcher interface</li>
 *              <li>Watch a directory for changes with the WatchService interface</li>
 *          </ul>
 *      </li>
 *      <li>Building Database Applications with JDBC
 *          <ul>
 *              <li>Describe the interfaces that make up the core of the JDBC API (including the Driver, Connection, Statement, and ResultSet interfaces and their relationship to provider implementations)</li>
 *              <li>Identify the components required to connect to a database using the DriverManager class (including the jdbc URL)</li>
 *              <li>Submit queries and read results from the database (including creating statements, returning result sets, iterating through the results, and properly closing result sets, statements, and connections)</li>
 *              <li>Use JDBC transactions (including disabling auto-commit mode, committing and rolling back transactions, and setting and rolling back to savepoints)</li>
 *              <li>Construct and use RowSet objects using the RowSetProvider class and the RowSetFactory interface</li>
 *              <li>Create and use PreparedStatement and CallableStatement objects</li>
 *          </ul>
 *      </li>
 *      <li>Threads
 *          <ul>
 *              <li>Create and use the Thread class and the Runnable interface</li>
 *              <li>Manage and control thread lifecycle</li>
 *              <li>Synchronize thread access to shared data</li>
 *              <li>Identify code that may not execute correctly in a multi-threaded environment.</li>
 *          </ul>
 *      </li>
 *      <li>Concurrency 
 *          <ul>
 *              <li>Use collections from the java.util.concurrent package with a focus on the advantages over and differences from the traditional java.util collections.</li>
 *              <li>Use Lock, ReadWriteLock, and ReentrantLock classes in the java.util.concurrent.locks package to support lock-free thread-safe programming on single variables.</li>
 *              <li>Use Executor, ExecutorService, Executors, Callable, and Future to execute tasks using thread pools.</li>
 *              <li>Use the parallel Fork/Join Framework</li>
 *          </ul>
 *      </li>
 *      <li>Localization
 *          <ul>
 *              <li>Read and set the locale by using the Locale object</li>
 *              <li>Build a resource bundle for each locale</li>
 *              <li>Call a resource bundle from an application</li>
 *              <li>Format dates, numbers, and currency values for localization with the NumberFormat and DateFormat classes (including number format patterns)</li>
 *              <li>Describe the advantages of localizing an application</li>
 *              <li>Define a locale using language and country codes</li>
 *          </ul>
 *      </li>
 *  </ol>
 * 
 *
 * @author mpanek
 */
package oracle.certified.professional;