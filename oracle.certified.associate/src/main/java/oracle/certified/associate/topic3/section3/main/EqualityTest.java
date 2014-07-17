package oracle.certified.associate.topic3.section3.main;

import oracle.certified.associate.common.Utils;
import oracle.certified.associate.common.Utils.HeaderPosition;

/**
 * <b>| Topic 3.3 | -  <i>Test equality between Strings and other objects using == and equals().</i></b>
 * 
 * <ul>
 *  <li>The String class represents character strings.</li>
 *  <li>All string literals in Java programs, such as "abc", are implemented as instances of this class.</li>
 *  <li>Strings are constant; their values cannot be changed after they are created. Because String objects are immutable they can be shared.</li>
 * </ul>
 *
 * @see Object#equals(Object)
 * @see Object#hashCode()
 * @see String
 * 
 * @author mpanek
 */
public class EqualityTest {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        String hello2 = new String(new char[] { 'H', 'e', 'l', 'l', 'o' });

        // This example illustrates six points:
        // • Literal strings within the same class (§8) in the same package (§7) represent references to the same String object (§4.3.1).
        // • Literal strings within different classes in the same package represent references to the same String object.
        // • Literal strings within different classes in different packages likewise represent references to the same String object.
        // • Strings computed by constant expressions (§15.28) are computed at compile time and then treated as if they were literals.
        // • Strings computed by concatenation at run time are newly created and therefore distinct.
        // • The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents.

        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((oracle.certified.associate.topic3.section3.other.Other.hello == hello) + " ");
        System.out.print((hello == "Hel" + "lo") + " ");
        System.out.print((hello == "Hel" + lo) + " ");
        System.out.println(hello == ("Hel" + lo).intern());

        // -----------------------------------------------------------------------------------------------------------------------------------------------------
        Utils.prettyPrint("hello2 == \"Hello\" --> " + (hello2 == "Hello"));
        Utils.prettyPrint("hello == hello2 --> " + (hello == hello2));
        Utils.prettyPrint("hello.equals(hello2) --> " + hello.equals(hello2));
        Utils.prettyPrint("hello.equals(\"HELLO\") --> " + hello.equals("HELLO"), HeaderPosition.BOTH);

        // -----------------------------------------------------------------------------------------------------------------------------------------------------
        final byte primitiveByte = 65;
        final short primitiveShort = 65;
        final char primitiveChar = 'A';
        final int primitiveInteger = 65;
        final long primitiveLong = 65L;
        final float primitiveFloat = 65.0F;
        final double primitiveDouble = 65.0;

        final Byte wrapperByte = 65;
        final Short wrapperShort = 65;
        final Character wrapperChar = 'A';
        final Integer wrapperInteger = 65;
        final Long wrapperLong = 65L;
        final Float wrapperFloat = 65.0F;
        final Double wrapperDouble = 65.0;

        Utils.prettyPrint("Comparing primitive and wrapper types:");

        Utils.prettyPrint("primitiveByte == 65 --> " + (primitiveByte == 65));
        Utils.prettyPrint("primitiveByte == wrapperByte --> " + (primitiveByte == wrapperByte));
        Utils.prettyPrint("wrapperByte.equals(65) --> " + wrapperByte.equals(65)); // This will return false because there are different types
        Utils.prettyPrint("wrapperByte.equals(primitiveByte) --> " + wrapperByte.equals(primitiveByte));

        Utils.prettyPrint("primitiveShort == 65 --> " + (primitiveShort == 65));
        Utils.prettyPrint("primitiveShort == wrapperShort --> " + (primitiveShort == wrapperShort));
        Utils.prettyPrint("wrapperShort.equals(65) --> " + wrapperShort.equals(65)); // This will return false because there are different types
        Utils.prettyPrint("wrapperShort.equals(primitiveShort) --> " + wrapperShort.equals(primitiveShort));

        Utils.prettyPrint("primitiveInteger == 65 --> " + (primitiveInteger == 65));
        Utils.prettyPrint("primitiveInteger == wrapperByte --> " + (primitiveInteger == wrapperInteger));
        Utils.prettyPrint("wrapperInteger.equals(65) --> " + wrapperInteger.equals(65)); // This will return true because there the same types
        Utils.prettyPrint("wrapperInteger.equals(primitiveInteger) --> " + wrapperInteger.equals(primitiveInteger));
    }
}

class Other {
    static String hello = "Hello";
}
