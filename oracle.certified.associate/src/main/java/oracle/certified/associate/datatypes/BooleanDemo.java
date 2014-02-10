package oracle.certified.associate.datatypes;

import oracle.certified.associate.common.Utils;

/**
 * <pre>
 * public final class Boolean
 * extends Object
 * implements Serializable, Comparable&lt;Boolean&gt;
 * </pre>
 * 
 * @see java.lang.Boolean
 * @author mpanek
 */
public class BooleanDemo {

	private static final Boolean TRUE_ONE = Boolean.TRUE;
	private static final Boolean FALSE_ONE = Boolean.FALSE;
	private static final Class<Boolean> clazz = Boolean.TYPE;


	public static void main(String[] args) {

		// Note: It is rarely appropriate to use this constructor. Unless a new instance is required,
		// the static factory valueOf(boolean) is generally a better choice.
		// It is likely to yield significantly better space and time performance.
		new Boolean(true);

		// Allocates a Boolean object representing the value true if the string argument is not null and is equal,
		// ignoring case, to the string "true". Otherwise, allocate a Boolean object representing the value false
		Utils.printHeader(System.out, "Boolean(String s)");

		System.out.println("new Boolean(\"true\") = " + new Boolean("true"));
		System.out.println("new Boolean(\"TRUE\") = " + new Boolean("TRUE"));
		System.out.println("new Boolean(\"yes\") = " + new Boolean("yes"));
		System.out.println("new Boolean(\"false\") = " + new Boolean("false"));
		System.out.println("new Boolean(null) = " + new Boolean(null));

		// Parses the string argument as a boolean. The boolean returned represents the value true
		// if the string argument is not null and is equal, ignoring case, to the string "true".
		Utils.printHeader(System.out, "parseBoolean(String s)");

		System.out.println("Boolean.parseBoolean(\"true\") = " + Boolean.parseBoolean("true"));
		System.out.println("Boolean.parseBoolean(\"TRUE\") = " + Boolean.parseBoolean("TRUE"));
		System.out.println("Boolean.parseBoolean(\"yes\") = " + Boolean.parseBoolean("yes"));
		System.out.println("Boolean.parseBoolean(\"false\") = " + Boolean.parseBoolean("false"));
		System.out.println("Boolean.parseBoolean(null) = " + Boolean.parseBoolean(null));

		// Returns the value of this Boolean object as a boolean primitive.
		boolean primitiveTrue = TRUE_ONE.booleanValue();
		boolean primitiveFalse = FALSE_ONE.booleanValue();

		// Returns a Boolean instance representing the specified boolean value. If the specified boolean value is true,
		// this method returns Boolean.TRUE; if it is false, this method returns Boolean.FALSE.
		Boolean objectOne = Boolean.valueOf(primitiveTrue);
		Boolean objectTwo = Boolean.valueOf(primitiveFalse);

		Utils.printHeader(System.out, "valueOf(String s)");
		System.out.println("Two booleans after valueOf: " + objectOne + " and " + objectTwo);

		// Returns a hash code for this Boolean object.
		// The integer 1231 if this object represents true; returns the integer 1237 if this object represents false.
		Utils.printHeader(System.out, "hashCode()");
		System.out.println("hashCode for true value: " + TRUE_ONE.hashCode());
		System.out.println("hashCode for false value: " + FALSE_ONE.hashCode());


		// Compares this Boolean instance with another.
		// Zero if this object represents the same boolean value as the argument;
		// a positive value if this object represents true and the argument represents false;
		// and a negative value if this object represents false and the argument represents true
		// NullPointerException - if the argument is null
		Utils.printHeader(System.out, "compareTo(Boolean b)");
		System.out.println("TRUE_ONE.compareTo(FALSE_ONE): " + TRUE_ONE.compareTo(FALSE_ONE));
		System.out.println("FALSE_ONE.compareTo(TRUE_ONE): " + FALSE_ONE.compareTo(TRUE_ONE));
		System.out.println("TRUE_ONE.compareTo(TRUE_ONE): " + TRUE_ONE.compareTo(TRUE_ONE));
		// The following statement will throw NullPointerException
		// System.out.println("TRUE_ONE.compareTo(null): " + TRUE_ONE.compareTo(null));


		// Compares two boolean values. The value returned is identical to what would be returned by:
		// Boolean.valueOf(x).compareTo(Boolean.valueOf(y))
		// the value 0 if x == y; a value less than 0 if !x && y; and a value greater than 0 if x && !y
		Boolean.compare(true, false);
		Boolean.compare(false, true);

		Utils.printHeader(System.out, "clazz.getName()");
		System.out.println(clazz.getName());
		Utils.printHeader(System.out, "clazz.getSimpleName()");
		System.out.println(clazz.getSimpleName());

	}

}
