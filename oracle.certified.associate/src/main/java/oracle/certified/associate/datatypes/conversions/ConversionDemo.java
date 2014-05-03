package oracle.certified.associate.datatypes.conversions;

/**
 * Specific type conversions in the Java programming language are divided into 13 categories.
 * 
 * <ol>
 *  <li>
 *      <b>Identity Conversion:</b>
 *      A conversion from a type to that same type is permitted for any type.
 *  </li>
 *  <li>
 *      <b>Widening Primitive Conversion:</b>
 *      19 specific conversions on primitive types are called the widening primitive conversions:
 *      <ul>
 *          <li>byte to short, int, long, float, or double</li>
 *          <li>short to int, long, float, or double</li>
 *          <li>char to int, long, float, or double</li>
 *          <li>int to long, float, or double</li>
 *          <li>long to float or double</li>
 *          <li>float to double</li>
 *      </ul>
 *      A widening primitive conversion does not lose information about the overall magnitude of a numeric value.
 *  </li>
 *  <li>
 *      <b>Narrowing Primitive Conversion:</b>
 *      22 specific conversions on primitive types are called the narrowing primitive conversions:
 *      <ul>
 *          <li>short to byte or char</li>
 *          <li>char to byte or short</li>
 *          <li>int to byte, short, or char</li>
 *          <li>long to byte, short, char, or int</li>
 *          <li>float to byte, short, char, int, or long</li>
 *          <li>double to byte, short, char, int, long, or float</li>
 *      </ul>
 *      A narrowing primitive conversion may lose information about the overall magnitude of a numeric value and may also lose precision and range.
 *  </li>
 *  <li>
 *      <b>Widening and Narrowing Primitive Conversion:</b>
 *      The following conversion combines both widening and narrowing primitive conversions:
 *      <ul>
 *          <li>byte to char</li>
 *      </ul>
 *      First, the byte is converted to an int via widening primitive conversion, and then the resulting int is converted to a char
 *      by narrowing primitive conversion.
 *  </li>
 *  <li>
 *      <b>Widening Reference Conversion:</b>
 *      A widening reference conversion exists from any reference type S to any reference type T, provided S is a subtype of T.
 *      Widening reference conversions never require a special action at run time and therefore never throw an exception at run time.
 *      They consist simply in regarding a reference as having some other type in a manner that can be proved correct at compile time.
 *  </li>
 *  <li>
 *      <b>Narrowing Reference Conversion:</b>
 *      Six kinds of conversions are called the narrowing reference conversions:
 *      <ul>
 *          <li>From any reference type S to any reference type T, provided that S is a proper supertype of T</li>
 *          <li>From any class type C to any non-parameterized interface type K, provided that C is not final and does not implement K.</li>
 *          <li>From any interface type J to any non-parameterized class type C that is not final</li>
 *          <li>From any interface type J to any non-parameterized interface type K, provided that J is not a subinterface of K</li>
 *          <li>From the interface types Cloneable and java.io.Serializable to any array type T[].</li>
 *          <li>From any array type SC[] to any array type TC[], provided that SC and TC are reference types and there is a narrowing reference conversion from SC to TC</li>
 *      </ul>
 *      Such conversions require a test at run time to find out whether the actual reference value is a legitimate value of the new type.
 *      If not, then a ClassCastException is thrown.
 *  </li>
 *  <li>
 *      <b>Boxing Conversion:</b>
 *      Boxing conversion converts expressions of primitive type to corresponding expressions of reference type.
 *      Specifically, the following nine conversions are called the boxing conversions:
 *      <ul>
 *          <li>From type boolean to type Boolean</li>
 *          <li>From type byte to type Byte</li>
 *          <li>From type short to type Short</li>
 *          <li>From type char to type Character</li>
 *          <li>From type int to type Integer</li>
 *          <li>From type long to type Long</li>
 *          <li>From type float to type Float</li>
 *          <li>From type double to type Double</li>
 *          <li>From the null type to the null type</li>
 *      </ul>
 *      If the value p being boxed is true, false, a byte, or a char in the range \u0000 to \u007f, or an int or short number between -128 and 127 (inclusive),
 *      then let r1 and r2 be the results of any two boxing conversions of p. It is always the case that r1 == r2.
 *  </li>
 *  <li>
 *      <b>Unboxing Conversion:</b>
 *      Unboxing conversion converts expressions of reference type to corresponding expressions of primitive type.
 *  </li>
 *  <li>
 *      <b>Unchecked Conversion:</b>
 *      Let G name a generic type declaration with n type parameters. There is an unchecked conversion from the raw class or interface type G to
 *      any parameterized type of the form G<T1,...,Tn>. There is an unchecked conversion from the raw array type G[] to any array type 
 *      of the form G<T1,...,Tn>[]. Use of an unchecked conversion causes a compile-time unchecked warning unless G<...> is a parameterized type in
 *      which all type arguments are unbounded wildcards, or the unchecked warning is suppressed by the SuppressWarnings annotation.
 *  </li> 
 *  <li>
 *      <b>Capture Conversion:</b>
 *      Let G name a generic type declaration with n type parameters A1,...,An with corresponding bounds U1,...,Un.
 *      There exists a capture conversion from a parameterized type G<T1,...,Tn> to a parameterized type G<S1,...,Sn>, where, for 1 ≤ i ≤ n.
 *  </li> 
 *  <li>
 *      <b>String Conversion:</b>
 *      Any type may be converted to type String by string conversion.
 *      
 *      A value x of primitive type T is first converted to a reference value as if by giving it as an argument
 *      to an appropriate class instance creation expression. This reference value is then converted to type String by string conversion.
 *      Now only reference values need to be considered:
 *      If the reference is null, it is converted to the string "null" (four ASCII characters n, u, l, l).
 *      Otherwise, the conversion is performed as if by an invocation of the toString method of the referenced object with no arguments;
 *      but if the result of invoking the toString method is null, then the string "null" is used instead.
 *  </li>
 *  <li>
 *      <b>Forbidden Conversions:</b>
 *      Any conversion that is not explicitly allowed is forbidden.
 *  </li>
 *  <li>
 *      <b>Value Set Conversion:</b>
 *      Value set conversion is the process of mapping a floating-point value from one value set to another without changing its type.
 *  </li>
 * </ol>
 * 
 * @author mpanek
 */
public class ConversionDemo {

}
