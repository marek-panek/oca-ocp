/**
 * <b>| Topic 6.6 | -  <i>Apply access modifiers.</i></b>
 * 
 * <p style='width: 700px; text-align: justify'>
 * Access modifiers control the accessibility of a class or an interface, including its members (methods and variables), by other classes and interfaces.
 * For example, you can’t access the {@code private} variables and methods of another class.
 * By using the appropriate access modifiers, you can limit access to your class or interface, and their members, by other classes and interfaces.
 * </p>
 * 
 * <b>There are two levels of access control:</b>
 * <blockquote>
 * <ul>
 * 		<li>At the top level — {@code public}, or package-private (no explicit modifier).</li>
 * 		<li>At the member level — {@code public}, {@code private}, {@code protected}, or package-private (no explicit modifier).</li>
 * </ul>
 * </blockquote>
 * 
 * <b>Java defines four access modifiers:</b>
 * <blockquote>
 * <ul>
 * 		<li>{@code public} (least restrictive)</li>
 *		<li>{@code protected}</li>
 *		<li><i>package-private</i></li>
 *		<li>{@code private} (most restrictive)</li>
 * </ul>
 * </blockquote>
 * 
 * <ul>
 * 		<li>Access modifiers can be applied to classes, interfaces, and their members (instance and class variables and methods).</li>
 * 		<li>Local variables and method parameters can’t be defined using access modifiers. An attempt to do so will prevent the code from compiling.</li>
 * </ul>
 * 
 * <pre>
 *  +--------------------+-----------+---------------+-----------------+------------+-----------------+
 *  |      Modifier      |   Class   |   Interface   |   Constructor   |   Method   |   Data member   |
 *  +--------------------+-----------+---------------+-----------------+------------+-----------------+
 *  |   public           |   Yes     |   Yes         |   Yes           |   Yes      |   Yes           |
 *  |   protected        |   No*     |   No*         |   Yes           |   Yes      |   Yes           |
 *  |   package-private  |   Yes     |   Yes         |   Yes           |   Yes      |   Yes           |
 *  |   private          |   No*     |   No*         |   Yes           |   Yes      |   Yes           |
 *  +--------------------+-----------+---------------+-----------------+------------+-----------------+
 *  * Private and protected modifiers are allowed but only with nested/inner classes/interfaces.
 *  </pre>
 * 
 *  <pre>
 *  +--------------------+-----------------+---------------------------+------------------------------+
 *  |   Modifier         |   Same class    |          Subclass         |         Not related          |
 *  |                    |                 |   IN        |   OUT       |   IN       |   OUT           |
 *  +--------------------+-----------------+-------------+-------------+------------------------------+
 *  |   public           |   Yes           |   Yes       |   Yes       |   Yes      |   Yes           |
 *  |   protected        |   Yes           |   Yes       |   Yes       |   Yes      |   No            |
 *  |   package-private  |   Yes           |   Yes       |   No        |   Yes      |   No            |
 *  |   private          |   Yes           |   No        |   No        |   No       |   No            |
 *  +--------------------+-----------------+-------------+-------------+------------+-----------------+
 *  </pre>
 * 
 * @author mpanek
 */
package oracle.certified.associate.topic6.access_modifiers;