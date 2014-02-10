package oracle.certified.associate.topic1;

import static oracle.certified.associate.common.Utils.out;

import java.util.Date;

// -------------------------------------------------------------------------------------------------------------
// All the following import statements are invalid
// -------------------------------------------------------------------------------------------------------------
// import static mp.oca.common.*;			// Only a type can be imported. mp.oca.common resolves to a package.
// static import mp.oca.common.Utils.out; 	// The order of the keywords import and static can’t be reversed.
// import java.sql.Date;					// You can’t use the import statement to access multiple classes or interfaces with the same names from different packages.

/**
 * <b>| Topic 1.4 | -  <i>Import other Java packages to make them accessible in your code.</i></b>
 * 
 *	<p>
 * 	<b><u>Important notes about imports in Java:</u></b>
 *	<blockquote>
 *		<ul>
 * 			<li>
 * 				The {@code import} statement enables you to use <i>simple names</i> instead of using <i>fully qualified names</i>
 * 				for classes and interfaces defined in separate packages.
 * 			</li>
 *  		<li>
 *  			The {@code import} statement doesn’t embed the contents of the imported class in your class,
 *  			which means that importing more classes doesn’t increase the size of your own class.<br />
 *  			It lets you use the simple name for a class or interface defined in a separate package.
 *  		</li>
 *			<li>
 *				The {@code import} statement cannot be used to access multiple classes or interfaces with the same names from different packages.</li>
 *			<li>
 *				By using the wildcard character, an asterisk (*), you can import all of the public members, classes, and interfaces of a package.
 *			</li>
 *			<li>You cannot import classes from a subpackage by using an asterisk in the import statement.</li>
 *			<li>A class from a default package cannot be used in any named packaged class, regardless of whether they are defined within the same directory or not.</li>
 * 		</ul>
 *	</blockquote>
 *	</p>
 *
 * @author mpanek
 * 
 */
public class JavaImportsExample {

	public void displayDate(Date date) {
		out(date);
	}

}
