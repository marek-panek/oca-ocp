package oracle.certified.associate.topic1;

/**
 * <b>| Topic 1.3 | -  <i>Create executable Java applications with a main method.</i></b>
 * 
 * <p>
 * 	The first requirement in creating an executable Java application is to create a class with a method<br />
 * 	whose signature (name and method arguments) match the main method, defined as follows:
 * 	<pre>
 * 		public class HelloExam {
 * 			public static void main(String args[]) {
 * 				System.out.println("Hello exam");
 * 			}
 * 		}
 * 	</pre>
 * 	<b><u>The class does not need to be declared as public to be executable.</u></b>
 * 	</p>
 * 
 * <u>This main method should comply with the following rules:</u>
 * <blockquote>
 * 		<ul>
 * 			<li>The method must be marked as a {@code public} method.</li>
 *			<li>The method must be marked as a {@code static} method.</li>
 *			<li>The name of the method must be {@code main}.</li>
 *			<li>The return type of this method must be {@code void}.</li>
 *			<li>The method must accept a method argument of a {@code String} array or a variable argument of type {@code String}.</li>
 * 		</ul>
 * </blockquote>
 * 
 * @author mpanek
 *
 */
public class JavaExecutable {

	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println("Command line argument: " + arg);
		}
	}

	//	The following examples of main methods are also valid
	//	-----------------------------------------------------
	//	public static void main(String... args) { }				// It is valid to define args as a variable argument
	//	public static void main(String args[]) { }				// The square brackets can follow either the variable name or its type
	//	public static void main(String[] arguments) { }			// The name of the method parameter can be any valid identifier name.
	//	static public void main(String[] args) { }				// The placement of the keywords public and static is interchangeable.
}
