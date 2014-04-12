package oracle.certified.associate.datatypes;

/**
 * The float data type is a single-precision 32-bit IEEE 754 floating point.
 * 
 * <p>
 *  The IEEE 754 standard includes not only positive and negative numbers that consist of a sign and magnitude,
 *  but also positive and negative zeros, positive and negative infinities, and special Not-a-Number values 
 *  (hereafter abbreviated NaN). A NaN value is used to represent the result of certain invalid operations
 *  such as dividing zero by zero. NaN constant of float type is predefined as Float.NaN.
 * </p>
 * 
 * <ul>
 *  <li>
 *      Except for NaN, floating-point values are ordered; arranged from smallest to largest,<br />
 *      they are negative infinity, negative finite nonzero values, positive and negative zero,
 *      positive finite nonzero values, and positive infinity.
 *  </li>
 *  <li>Any operation performed on NaN results in NaN; there is no such thing as –NaN.</li>
 *  <li>The numerical comparison operators <, <=, >, and >= return false if either or both operands are NaN.</li>
 *  <li>The equality operator == returns false if either operand is NaN.</li>
 *  <li>The inequality operator != returns true if either operand is NaN.</li>
 *  <li>In particular, x!=x is true if and only if x is NaN.</li>
 * </ul>
 * 
 * This data type should never be used for precise values, such as currency.
 * 
 * <pre>
 *  public final class Float
 *  extends Number
 *  implements Comparable&lt;Float&gt;
 * </pre>
 * 
 * @see java.lang.Float
 * @author mpanek
 */
public class FloatDemo {

    public static void main(String[] args) {
        final float minFloat = Float.MIN_VALUE;
        final float maxFloat = Float.MAX_VALUE;

        System.out.println("Min float value: " + formatValues(minFloat));
        System.out.println("Max float value: " + formatValues(maxFloat));

        // --------------------------------------------------------------
        // Infinity represents the concept of positive infinity:
        // 1.0 / 0.0, 1e300 / 1e–300, Math.abs (–1.0 / 0.0)
        // --------------------------------------------------------------
        // Each of the following 3 variables represent positive infinity:
        // --------------------------------------------------------------
        final float positiveInfinity1 = Float.POSITIVE_INFINITY;
        final float positiveInfinity2 = 1.0f / 0.0f;
        final float positiveInfinity3 = Float.intBitsToFloat(0x7f800000);

        System.out.println(formatValues(positiveInfinity1, positiveInfinity2, positiveInfinity3));

        // --------------------------------------------------------------
        // –Infinity represents the concept of negative infinity:
        // –1.0 / 0.0, 1.0 / (–0.0), 1e300/–1e–300
        // --------------------------------------------------------------
        // Each of the following 3 variables represent negative infinity:
        // --------------------------------------------------------------
        final float negativeInfinity1 = Float.NEGATIVE_INFINITY;
        final float negativeInfinity2 = -1.0f / 0.0f;
        final float negativeInfinity3 = Float.intBitsToFloat(0xff800000);

        System.out.println(formatValues(negativeInfinity1, negativeInfinity2, negativeInfinity3));

        // ----------------------------------------------------------------------
        // NaN represents undefined results:
        // 0.0 / 0.0, 1e300 * Float.NaN, Math.sqrt (–9.0)
        // ----------------------------------------------------------------------
        // Each of the following 3 variables represent Not-a-Number entity (NaN):
        // ----------------------------------------------------------------------
        final float nan1 = Float.NaN;
        final float nan2 = 0.0f / 0.0f;
        final float nan3 = Float.intBitsToFloat(0x7fc00000);

        System.out.println(formatValues(nan1, nan2, nan3));

        // --------------------------------------------------------------
        // –0.0 represents a negative number close to zero:
        // –1.0 / (1.0 / 0.0), –1e300 / 1e300
        // --------------------------------------------------------------
        final float minusZero = -1.0F / (1.0F / 0.0F);

        System.out.println(formatValues(minusZero));

        final float sampleFloat = 1.12345F; // the 'f' or 'F' suffix is required here
        System.out.println(formatValues(sampleFloat));

        // Positive zero and negative zero compare equal;
        // thus the result of the following expressions are true and false respectively
        System.out.println("0.0f == -0.0f: " + (0.0f == -0.0f));
        System.out.println("0.0f >  -0.0f: " + (0.0f > -0.0f));

        System.out.println("Float.isInfinite(1.0f / 0.0f) -> " + Float.isInfinite(1.0f / 0.0f));
        System.out.println("Float.isInfinite(-1.0f / 0.0f) -> " + Float.isInfinite(-1.0f / 0.0f));
        System.out.println("Float.isInfinite(-0.0F) -> " + Float.isInfinite(-0.0F));

        System.out.println("Float.isNaN(Float.NaN) -> " + Float.isNaN(Float.NaN));
        System.out.println("Float.isNaN(0.0f / 0.0f) -> " + Float.isNaN(0.0f / 0.0f));
        System.out.println("Float.isNaN(-0.0f / 0.0f) -> " + Float.isNaN(-0.0f / 0.0f));
        System.out.println("Float.isNaN(0.0f / -0.0f) -> " + Float.isNaN(0.0f / -0.0f));
        System.out.println("Float.isNaN(-0.0f / -0.0f) -> " + Float.isNaN(-0.0f / -0.0f));
        System.out.println("Float.isNaN((float) Math.sqrt(-9.0)) -> " + Float.isNaN((float) Math.sqrt(-9.0)));

        System.out.println("Float.NaN == Float.NaN -> " + (Float.NaN == Float.NaN));
        System.out.println("nan1 == Float.NaN -> " + (nan1 == Float.NaN));
        System.out.println("Float.NaN != Float.NaN -> " + (Float.NaN != Float.NaN));
        System.out.println("nan1 != Float.NaN -> " + (nan1 != Float.NaN));
    }

    private static String formatValues(float... values) {
        final StringBuilder sb = new StringBuilder();

        for (float value : values) {
            sb.append(String.format("%1$10e", value));
        }

        return sb.toString();
    }

}
