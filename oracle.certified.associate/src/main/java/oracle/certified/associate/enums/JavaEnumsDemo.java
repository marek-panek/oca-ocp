package oracle.certified.associate.enums;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/**
 * All enum types are subtypes of the {@link java.lang.Enum} class which provides the default behavior.
 * All enum types are comparable and serializable.
 * It is no possible to extend this class directly in code.
 * <pre>
 * 	public abstract class Enum&lt;E extends Enum&lt;E&gt;&gt;
 * 	extends Object
 * 	implements Comparable&lt;E&gt;, Serializable
 * </pre>
 *	All enum types inherit the following final methods from the {@link java.lang.Enum} class
 *	and these methods can therefore not be overridden by an enum type:
 *	<p>
 *	<dl>
 *		<dt>protected final Object clone()</dt>
 *		<dd>An instance of an enum type cannot be cloned. The method throws an CloneNotSupportedException.</dd>
 *		<dt>final int compareTo(E o)</dt>
 *		<dd>The natural order of the enum constants in an enum type is according to their ordinal values (see the ordinal() method below).</dd>
 *		<dt>final boolean equals(Object other)</dt>
 *		<dd>This method returns true if the specified object is equal to this enum constant.</dd>
 *		<dt>protected final void finalize()</dt>
 *		<dd>An enum constant cannot be finalized, because this final method effectively prevents enum
 *			types from implementing their own finalize() method.</dd>
 *		<dt>final Class&lt;E&gt; getDeclaringClass()</dt>
 *		<dd>This method returns the Class object corresponding to this enum constant's enum type.</dd>
 *		<dt>final int hashCode()</dt>
 *		<dd>This method returns a hash code for this enum constant.</dd>
 *		<dt>final String name()</dt>
 *		<dd>This method returns the name of this enum constant, exactly as declared in its enum declaration.</dd>
 *		<dt>final int ordinal()</dt>
 *		<dd>This method returns the ordinal value of this enum constant (that is, its position in its enum type declaration).
 *			The first enum constant is assigned an ordinal value of zero.
 *		</dd>
 *	</dl>
 *	</p>
 *	<p>
 *	The Enum class also overrides the toString() method from the Object class. The toString() method
 *	returns the name of the enum constant, but it is not final, and can be overridden by an enum type.
 *	</p>
 *	<p>
 *	An enum type can be declared as a top-level type. Enum types can also be nested,
 *	but only within other static members, or other top-level type declarations.
 *	When nested, it is implicitly static, and can be declared with the keyword static.
 *	</p>
 *	<p>
 *	An enum type cannot be explicitly extended using the extends clause.
 *	An enum type is implicitly final, unless it contains constant-specific class bodies. If it
 *	declares constant-specific class bodies, it is implicitly extended. No matter what, it
 *	cannot be explicitly declared final.
 *	</p>
 */
public class JavaEnumsDemo {
	//	 An enum type declaration is a special kind of reference type declaration.
	//	 It can declare constructors and other members as in an ordinary class,
	//	 but the enum constants must be declared before any other declarations.
	public enum Direction {
		LEFT, RIGHT(), UP(10), DOWN(20);
		
		private int code;
		
		// Only package and private scope are possible for enum constructor
		private Direction() {
			
		}
		
		private Direction(int code) {
			this.code = code;
		}
		
		public int getCode() {
			return code;
		}
		
		@Override
		public String toString() {
			return this.name().toLowerCase();
		}
	}
	
	//	Constant-specific class bodies define anonymous classes inside an enum type, i.e.,
	//	they implicitly extend the enclosing enum type. Besides the abstract method the enum
	//	cannot be marked as abstract implicitly.
	public enum Taste {
		SWEET {
			@Override
			public void print() {
				System.out.println("Sweet!");
			}
		}, 
		
		SOUR {
			@Override
			public void print() {
				System.out.println("Sour!");
			}
		}, 
		
		BITTER {
			@Override
			public void print() {
				System.out.println("Bitter!");
			}
		}, 
		
		SALTY {
			@Override
			public void print() {
				System.out.println("Salty!");
			}
		};
		
		private Taste() {
			print();
		}
		
		protected abstract void print();
	}
	
	//	The following definitions are not correct:
	//	---------------------------------------------------
	// 	public final enum Enum1 {}; 			// Illegal modifier for the member enum Enum1; final
	//	public abstract enum Enum2 {};			// Illegal modifier for the member enum Enum2; abstract
	//	public enum Enum3 extends Object {};	// The enum cannot extend anything even Object.
	//	public class Wrong extends Taste {};	// We cannot subclass the enum type.
	//	public enum OnlyAbstractMethod {		// The enum JavaEnumsDemo.OnlyAbstractMethod can only 
	//		;									// define the abstract method foo() if it also defines 
	//		public abstract void foo();			// enum constants with corresponding implementations
	//	}
	
	
	public static enum Enum4 {};
	public enum Enum5 implements Closeable {
		; // This semicolon is required if there are no enum constants and there are some members

		@Override
		public void close() throws IOException {
			// Nothing to do here :)
		}
	}
	
	public static void main(String[] args) {
		Direction[] allDirections = Direction.values();
		System.out.println(Arrays.toString(allDirections));
		
		// Direction left = new Direction(); // Compile-time error. An enum type cannot be instantiated using the new operator.
		
		System.out.println(Direction.valueOf("LEFT"));
		System.out.println(Direction.valueOf(Direction.class, "LEFT"));
		
		//System.out.println(Direction.valueOf(null));
		
		//	IllegalArgumentException - if the specified enum type has no constant with the specified name,
		//	or the specified class object does not represent an enum type
		//	Both the 2 following throw IllegalArgumentException.
		//	----------------------------------------------------------------------------------------
		//	System.out.println(Direction.valueOf(Enum.class, "left"));
		//	System.out.println(Direction.valueOf("left"));
		
		System.out.println(Direction.LEFT.getClass());								// class oca.sample.enums.JavaEnumsDemo$Direction
		System.out.println(Direction.LEFT.getDeclaringClass());						// class oca.sample.enums.JavaEnumsDemo$Direction
		System.out.println(Direction.LEFT.getDeclaringClass().getCanonicalName());	// oca.sample.enums.JavaEnumsDemo.Direction
		System.out.println(Direction.LEFT.getDeclaringClass().getName());			// oca.sample.enums.JavaEnumsDemo$Direction
		System.out.println(Direction.LEFT.getDeclaringClass().getSimpleName());		// Direction
		

		//	Note that the equality test implemented by the equals() method is based on reference
		//	equality (==) of the enum constants, not on value equality. Comparing two enum references
		//	for equality means determining whether they store the reference value of the same enum contant,
		//	i.e., whether the references are aliases. Thus, for any two enum references dir1 and dir2,
		//	the expression dir1.equals(dir2) and dir1 == dir2 are equivalent.
		Direction down = Direction.DOWN;
		Direction up = Direction.UP;
		
		System.out.println(down.equals(up));			// false
		System.out.println(down == up);					// false
		System.out.println(down.equals(Direction.UP));	// false
		System.out.println(down == Direction.UP);		// false
		up = down;										// From now up points to the same as down
		System.out.println(down.equals(up));			// true
		System.out.println(down == up);					// true
		down = Direction.UP;
		System.out.println(down.equals(up));			// false
		System.out.println(down == up);					// false
		
		for (Direction direction : allDirections) {
			System.out.printf("%d, ", direction.code); 	// 0, 0, 10, 20,
		}
		System.out.println();
		
		Taste[] allTastes = Taste.values();
		System.out.println(Arrays.toString(allTastes));
		
	}

}


