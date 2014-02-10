package oracle.certified.associate.topic1;

/**
 * Demonstrates Java lexical structure.
 * <p>
 * Programs are written using the Unicode character set.
 * The Java SE platform tracks the Unicode specification as it evolves.
 * The precise version of Unicode used by a given release is specified
 * in the documentation of the class {@link Character}. 
 * </p>
 * 
 * @author mpanek
 */
@SuppressWarnings("unused")
public class JavaLexicalStructure {
	// ---------------------------------------------------------------------------------------------
	// In addition to the processing implied by the grammar, for each raw input character that is a
	// backslash \, input processing must consider how many other \ characters contiguously precede
	// it, separating it from a non-\ character or the start of the input stream. If this number is
	// even, then the \ is eligible to begin a Unicode escape; if the number is odd, then the \ is
	// not eligible to begin a Unicode escape.
	//
	// For example, the raw input "\\u2126=\u2126" results in the eleven characters
	// " \ \ u 2 1 2 6 = Ω " (\u2126 is the Unicode encoding of the character Ω). 
	//
	// The character produced by a Unicode escape does not participate in further Unicode escapes.
	// 
	// For example, the raw input \u005cu005a results in the six characters \ u 0 0 5 a,
	// because 005c is the Unicode value for \. It does not result in the character Z,
	// which is Unicode character 005a, because the \ that resulted from the \u005c
	// is not interpreted as the start of a further Unicode escape.
	// ---------------------------------------------------------------------------------------------
	
	
	// ---------------------------------------------------------------------------------------------
	// Comments in Java
	// ---------------------------------------------------------------------------------------------
	// * Comments do not nest.
	// * Sequences of /* and */ have no special meaning in comments that begin with //. 
	// * // has no special meaning in comments that begin with /* or /**. 
	// ---------------------------------------------------------------------------------------------
	
	// Invalid comments:
	// /* Outer /* Nested is here */ is here */
	
	// Valid comments:
	/* /* */
	/*/*/
	
	// ---------------------------------------------------------------------------------------------
	// Literals
	// ---------------------------------------------------------------------------------------------
	// A literal is the source code representation of a value of a primitive type, the String type,
	// or the null type.
	//
	// There are 6 types of literals in Java:
	// 		1. Integer literal
	// 		2. Floating point literal
	// 		3. Boolean literal
	// 		4. Character literal
	// 		5. String literal
	// 		6. Null literal
	
	// 1. Integer literals
	// ---------------------------------------------------------------------------------------------
	// An integer literal may be expressed in decimal (base 10), hexadecimal (base 16),
	// octal (base 8), or binary (base 2).
	// An integer literal is of type long if it is suffixed with an ASCII letter L or l (ell);
	// otherwise it is of type int
	// Underscores are allowed as separators between digits that denote the integer.
	// In a hexadecimal or binary literal, the integer is only denoted by the digits after the
	// 0x or 0b characters and before any type suffix. Therefore, underscores may not appear
	// immediately after 0x or 0b, or after the last digit in the numeral.
	private int validIntegerLiteral1 = 1024;
	private int validIntegerLiteral2 = 1_024; // Invalid usages: _1024, 1024_
	private int validIntegerLiteral3 = 0_0;
	private int validIntegerLiteral4 = 1_000___000___000;
	private long validIntegerLiteral5 = 1024L; // Invalid usages: 1024_L

	private int octalLiteral1 = 0777; 		// Valid octal representation
	private int octalLiteral2 = 0__123; 	// Valid octal representation
	// private int octalLiteral3 = 0128; 	// Invalid octal representation (8 and 9 digits don't belong to octal system)
	
	// Valid hex reprezentations:
	//
	private int validHex1 = 0xCAFE;			// 0x prefix and eligible characters
	private int validHex2 = 0Xabcd;			// 0X prefix and eligible characters
	private int validHex3 = 0x00___FF;		// 0x prefix, eligible characters and underscores
	
	// Invalid hex representations: 
	// 
	// private int invalidHex1 = _0xCAFE;
	// private int invalidHex2 = 0_xCAFE;
	// private int invalidHex3 = 0x_CAFE;
	// private int invalidHex4 = 0xCAFE_;
	// private int invalidHex5 = 0x123H;
	
}

