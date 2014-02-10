package oracle.certified.associate.topic1;

/**
 * Demonstrates all available Java primitives.
 * 
 * <p>
 * Java programming language supports <b>8</b> primitive data types:
 * <ul>
 * 	<li>{@code byte}</li>
 * 	<li>{@code short}</li>
 *	<li>{@code int}</li>
 *	<li>{@code long}</li>
 *	<li>{@code float}</li>
 *	<li>{@code double}</li>
 *	<li>{@code boolean}</li>
 *	<li>{@code char}</li>
 * </ul>
 * </p>
 * 
 * @author mpanek
 */
@SuppressWarnings("unused")
public class JavaPrimitives {
	// +-------------------------------------------------------------------------------------------+
	// |									byte												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The byte data type is an 8-bit signed two's complement integer.						   |
	// |	It has a minimum value of -128 and a maximum value of 127 (inclusive).				   |
	// +-------------------------------------------------------------------------------------------+
	private byte minByte = Byte.MIN_VALUE;		//	-2^7	|	-128		|		0x80		   |	
	private byte sampleByte = 64;				//	 2^6	|	  64		|		0x40		   |			
	private byte maxByte = Byte.MAX_VALUE;		//	 2^7-1	|	 127		|		0x7F		   |
	// +----------------------------------------------------+---------------+----------------------+
	
	
	// +-------------------------------------------------------------------------------------------+
	// |									short												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The short data type is a 16-bit signed two's complement integer.					   |
	// |	It has a minimum value of -32768 and a maximum value of 32767 (inclusive).		   	   |
	// +-------------------------------------------------------------------------------------------+
	private short minShort = Short.MIN_VALUE;	//	-2^15	|	-32768		|		0x8000		   |	
	private short sampleShort = 1024;			//	 2^10	|	  1024		|		0x0400		   |	
	private short maxShort = Short.MAX_VALUE;	//	 2^15-1	|	 32767		|		0x7FFF		   |
	// +----------------------------------------------------+---------------+----------------------+
	
	// +-------------------------------------------------------------------------------------------+
	// |									int												   	   |
	// +-------------------------------------------------------------------------------------------+
	// |	The int data type is a 32-bit signed two's complement integer.						   |
	// |	It has a minimum value of -2147483648 and a maximum value of 2147483647 (inclusive).   |
	// +-------------------------------------------------------------------------------------------+
	private int minInt = Integer.MIN_VALUE;		//	-2^31	|	-2147483648 |		0x80000000	   |	
	private int sampleInt = 65536;				//	 2^16	|	 	  65536	|		0x00010000	   |	
	private int maxInt = Integer.MAX_VALUE;		//	 2^31-1	|	 2147483647	|		0x7FFFFFFF     |
	// +----------------------------------------------------+---------------+----------------------+
	
	// +-------------------------------------------------------------------------------------------+
	// |									long												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The long data type is a 64-bit signed two's complement integer.						   |
	// |	It has a minimum value of -9223372036854775808 and							   		   |
	// |	a maximum value of 9223372036854775807 (inclusive).							           |
	// +-------------------------------------------------------------------------------------------+
	private long minLong = Long.MIN_VALUE;	// -2^63   | -9223372036854775808 | 0x8000000000000000 |	
	private long sampleLong = 4294967296L;	//	2^32   |	 	   4294967296 |	0x0000000100000000 |	
	private long maxLong = Long.MAX_VALUE;	//	2^63-1 |  9223372036854775807 |	0x7FFFFFFFFFFFFFFF |
	// +----------------------------------------------------+---------------+----------------------+
	
	// +-------------------------------------------------------------------------------------------+
	// |									float												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The float data type is a single-precision 32-bit IEEE 754 floating point.			   |
	// |	This data type should never be used for precise values, such as currency.			   |
	// +-------------------------------------------------------------------------------------------+
	private float minFloat = Float.MIN_VALUE;	
	private float sampleFloat = 1.12345F;		// the 'f' or 'F' suffix is required here
	private float maxFloat = Float.MAX_VALUE;
	
	// +-------------------------------------------------------------------------------------------+
	// |									double												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The double data type is a double-precision 64-bit IEEE 754 floating point.			   |
	// |	This data type should never be used for precise values, such as currency.			   |
	// +-------------------------------------------------------------------------------------------+
	private double minDouble = Double.MIN_VALUE;	
	private double sampleDouble = 1.12345;		// the 'd' or 'd' suffix is not required here
	private double maxDouble = Double.MAX_VALUE;
	
	// +-------------------------------------------------------------------------------------------+
	// |									boolean												   |
	// +-------------------------------------------------------------------------------------------+
	// |	The boolean data type has only two possible values: true and false.					   |
	// |	Use this data type for simple flags that track true/false conditions.				   |
	// |	This data type represents one bit of information,									   |
	// |	but its "size" isn't something that's precisely defined.							   |
	// +-------------------------------------------------------------------------------------------+
	private boolean trueCondition = true;
	private boolean falseCondition = false;
	
	// +-------------------------------------------------------------------------------------------+
	// |									char											   	   |
	// +-------------------------------------------------------------------------------------------+
	// |	The char data type is a single 16-bit Unicode character.							   |
	// |	It has a minimum value of '\u0000' (or 0) and										   |
	// |	a maximum value of '\uffff' (or 65535 inclusive).									   |
	// +-------------------------------------------------------------------------------------------+
	private char sampleLetter = 'x';
	private char sampleDigit = '8';
	private char sampleSign = '#';
	private char spaceCode = '\u0020';
	
	// Special characters
	private char backspace = '\b';
	private char tab  = '\t';
	private char linefeed = '\n';
	private char formfeed = '\f';
	private char carriageReturn = '\r';
	private char doubleQuote = '\"';
	private char singleQuote = '\'';
	private char backslash = '\\';
	
	private char validQuote = '"';				// There is no need for 'backslash' here
	// private char invalidEscapeChar = '\R'; 	// Escape sequences are case-sensitive
	
	// ---------------------------------------------------------------------------------------------
	// The precise version of Unicode used by a given release is specified in the documentation of the class Character. 
	// The Unicode standard was originally designed as a fixed-width 16-bit character encoding.
	// It has since been changed to allow for characters whose representation requires more than 16 bits.
	// The range of legal code points is now U+0000 to U+10FFFF, using the hexadecimal U+n notation.
	// Characters whose code points are greater than U+FFFF are called supplementary characters.
	// To represent the complete range of characters using only 16-bit units, the Unicode standard
	// defines an encoding called UTF-16. In this encoding, supplementary characters are represented
	// as pairs of 16-bit code units, the first from the high-surrogates range, (U+D800 to U+DBFF),
	// the second from the low-surrogates range (U+DC00 to U+DFFF).
	// For characters in the range U+0000 to U+FFFF, the values of code points and UTF-16 code units are the same.
	
	// The character produced by a Unicode escape does not participate in further Unicode escapes. 
	// For example, the raw input \u005cu005a results in the six characters \ u 0 0 5 a,
	// because 005c is the Unicode value for \. It does not result in the character Z,
	// which is Unicode character 005a, because the \ that resulted from the \u005c is not
	// interpreted as the start of a further Unicode escape. 
	
	// Default values for primitives
	private byte defaultByte = 0;
	private short defaultShort = 0;
	private int defaultInt = 0;
	private long defaultLong = 0L;
	private float defaultFloat = 0.0f;
	private double defaultDouble = 0.0d;
	private char defaultChar = '\u0000';
	private boolean defaultBoolean = false;
	
	private String String; // Hee
	
	// These values are interpreted as line-terminator characters by
	// the compiler, and will cause compile time errors.
	// You should use the escape sequences '\n' and '\r', respectively,
	// for correct interpretation of these characters in the source code.
	// Note that double \\ are used to only suppress compile-time errors
	// for one line comments. In multiple line comments they can be used
	// directly.
	// '\\u000A', '\\u000D'
	/*
	 * '\u000A', '\u000D'
	 */
	private char newLine1 = '\n';
	private char newLine2 = '\r';
	
	//	We can also use the escape sequence \ddd to specify a character literal as an octal
	//	value, where each digit d can be any octal digit (0–7). The
	//	number of digits must be three or fewer, and the octal value cannot exceed \377,
	//	i.e., only the first 256 characters can be specified with this notation.
	/* // */
	
}
