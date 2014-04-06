package oracle.certified.associate.datatypes;

/**
 * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal.
 * 
 * <p>
 * This feature enables you, for example, to separate groups of digits in numeric literals, which can improve the readability of your code.<br />
 * For instance, if your code contains numbers with many digits, you can use an underscore character to separate digits in groups of three,<br />
 * similar to how you would use a punctuation mark like a comma, or a space, as a separator.
 * </p>
 * 
 * <b>You can place underscores only between digits.
 * You cannot place underscores in the following places:</b>
 * <blockquote>
 * <ul>
 *      <li>At the beginning or end of a number</li>
 *      <li>Adjacent to a decimal point in a floating point literal</li>
 *      <li>Prior to an (F, f), (D, d) or (L, l) suffix</li>
 *      <li>Before or after the hexadecimal and binary markers 'x, X' and 'b, B'</li> 
 *      <li>In positions where a string of digits is expected</li>
 * </ul>
 * </blockquote>
 * 
 * @author mpanek
 *
 */
public class UnderscoresForNumericLiterals {

    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi = 3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;

    // int x1 = _52; // This is an identifier, not a numeric literal
    int x2 = 5_2; // OK (decimal literal)
    // int x3 = 52_; // Invalid; cannot put underscores at the end of a literal
    int x4 = 5_______2; // OK (decimal literal)

    // float pi1 = 3_.1415F; // Invalid; cannot put underscores adjacent to a decimal point
    // float pi2 = 3._1415F; // Invalid; cannot put underscores adjacent to a decimal point
    // long socialSecurityNumber1
    // = 999_99_9999_L; // Invalid; cannot put underscores prior to an L suffix

    // int x5 = 0_x52; // Invalid; cannot put underscores in the 0x radix prefix
    // int x6 = 0x_52; // Invalid; cannot put underscores at the beginning of a number
    int x7 = 0x5_2; // OK (hexadecimal literal)
    // int x8 = 0x52_; // Invalid; cannot put underscores at the end of a number

    int x9 = 0_52; // OK (octal literal)
    int x10 = 05_2; // OK (octal literal)
    // int x11 = 052_; // Invalid; cannot put underscores at the end of a number

    int x12 = 0b0000_1111; // OK (binary literal)
    // int x13 = 0_b00001111; // Invalid; cannot put underscores in the 0b prefix
    // int x14 = 0b_00001111; // Invalid; cannot put underscores in the 0b prefix
    int x15 = 0b0_0_0_0_1_1_1_1; // OK (binary literal)

}
