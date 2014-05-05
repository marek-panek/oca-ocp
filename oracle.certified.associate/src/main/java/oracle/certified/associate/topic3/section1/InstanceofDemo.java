package oracle.certified.associate.topic3.section1;

import oracle.certified.associate.common.Utils;
import oracle.certified.associate.common.Utils.HeaderPosition;

/**
 * Demonstrates applications of {@code instanceof} operator.
 * 
 * <p>
 * Statement using {@code instanceof} operator has the following form:
 * <pre>
 * RelationalExpression instanceof ReferenceType
 * </pre>
 * 
 * The type of the <i>RelationalExpression</i> operand of the {@code instanceof} operator must be
 * a reference type or the null type; otherwise, a compile-time error occurs.
 * </p>
 * <ul>
 *  <li>Note the spelling: instanceof not instanceOf with capitalized 'O'</li>
 * </ul>
 * 
 * @author mpanek
 *
 */
public class InstanceofDemo {

    public static void main(String[] args) {
        final Boolean booleanValue = false;
        final Byte byteValue = 64;
        final Short shortValue = 128;
        final Character charValue = 'X';
        final Integer intValue = 1024;
        final Long longValue = 2048L;
        final Float floatValue = 3.14F;
        final Double doubleValue = 1.1234;
        final Object nullableValue = null;

        // -------------------------------------------------------------------------------------------
        // Valid invocations of instanceof operator
        // -------------------------------------------------------------------------------------------
        Utils.prettyPrint("Valid invocations of instanceof operator", HeaderPosition.BOTH);

        System.out.println("booleanValue instanceof Boolean -> " + (booleanValue instanceof Boolean));
        System.out.println("byteValue instanceof Byte -> " + (byteValue instanceof Byte));
        System.out.println("shortValue instanceof Short -> " + (shortValue instanceof Short));
        System.out.println("charValue instanceof Character -> " + (charValue instanceof Character));
        System.out.println("intValue instanceof Integer -> " + (intValue instanceof Integer));
        System.out.println("longValue instanceof Long -> " + (longValue instanceof Long));
        System.out.println("floatValue instanceof Float -> " + (floatValue instanceof Float));
        System.out.println("doubleValue instanceof Double -> " + (doubleValue instanceof Double));

        System.out.println("booleanValue instanceof Object -> " + (booleanValue instanceof Object));
        System.out.println("booleanValue instanceof Comparable -> " + (booleanValue instanceof Comparable));
        System.out.println("shortValue instanceof Number -> " + (shortValue instanceof Number));
        System.out.println("intValue instanceof Number -> " + (intValue instanceof Number));

        // -------------------------------------------------------------------------------------------
        // For any null reference instanceof returns false
        // -------------------------------------------------------------------------------------------
        Utils.prettyPrint("For any null reference instanceof returns false", HeaderPosition.BOTH);

        System.out.println("nullableValue instanceof Object -> " + (nullableValue instanceof Object));
        System.out.println("null instanceof Object -> " + (null instanceof Object));
        System.out.println("null instanceof Integer -> " + (null instanceof Integer));

    }
}
