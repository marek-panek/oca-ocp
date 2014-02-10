/* Comments are allowed before package statement */
package oracle.certified.associate.topic1;

import java.util.Date;

/**
 * <b>| Topic 1.2 | -  <i> Define the structure of a Java class.</i></b>
 * 
 *	<p>
 * 	<b>Packages:</b>
 *	<blockquote>
 *		<ul>
 * 			<li>All Java classes are part of a package.</li>
 *  		<li>
 *  			A Java class can be explicitly defined in a named package;
 *  			otherwise it becomes part of a default package, which doesn’t have a name.
 *  		</li>
 *			<li>A package statement is used to explicitly define which package a class is in.</li>
 *			<li>
 *				If a class includes a package statement, it must be the first statement in the class definition.
 *				The only exception to this rule is the presence of comments.
 *			</li>
 *			<li>Also, if present, the package statement must appear exactly once in a class.</li>
 * 		</ul>
 *	</blockquote>
 *	</p>
 *
 *	<p>
 * 	<b>Imports:</b>
 *	<blockquote>
 *		<ul>
 *			<li>
 *				To use a class or an interface from another package, you must use its fully qualified name.<br/>
 *				Because this can be tedious and can make your code difficult to read, you can use the import
 *				statement to use the simple name of a class or interface in your code.
 *			</li>
 * 			<li>The import statement follows the package statement but precedes the class declaration.</li>
 * 
 * 		</ul>
 *	</blockquote>
 *	</p>
 *
 * <p>
 * 	<b>Class declaration:</b>
 *	<blockquote>
 *		<ul>
 * 			<li>
 * 				The class declaration marks the start of a class.
 * 				It can be as simple as the keyword {@code class} followed by the name of a class, for instance: <code>class Person {}</code>
 * 			</li>
 * 			<li><i>[Access modifier] [Non-access modifier] (Keyword class) (Name of class) [Keyword extends] [Base class name] [Keyword implements] [Name of implemented interface] (Curly braces)</i></li>
 * 			<li><code>public final class Runner extends Person implements Athlete {}</code></li>
 * 		</ul>
 *	</blockquote>
 *	</p>
 * 
 * 
 * @author mpanek
 *
 */
public class JavaClassStructure {
	private Date fromDate;

	public JavaClassStructure() {
		fromDate = new Date();
	}

	public JavaClassStructure(Date fromDate) {
		fromDate = new Date(fromDate.getTime());
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
}
