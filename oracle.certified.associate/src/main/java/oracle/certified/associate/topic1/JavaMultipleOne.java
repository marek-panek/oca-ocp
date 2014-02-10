package oracle.certified.associate.topic1;

/**
 * You can define as many interfaces and classes in one Java source code file as you want.
 * 
 * <ul>
 * 	<li>The classes and interfaces can be defined in any order of occurrence in a Java source code file.</li>
 *  <li>If you define a public class or a public interface its name should match the name of the Java source code file.</li>
 *  <li>Also a source code file can’t define more than one public class or interface.</li>
 *  <li>
 *  	If Java source code file doesn't contain any public class or interface, there is no requirement that one of their
 *  	names must match file name.<br/> Although it is allowed you should avoid such situations.
 *  </li>
 * 
 * </ul>
 * 
 * @author mpanek
 *
 */
public class JavaMultipleOne {

}

interface Drawable {
	void draw();
}

interface Movable {
	void move();
}

class NonPublicClass {

}


