package oracle.certified.associate.topic1;

/**
 * Demonstrates naming rules for Java identifiers.
 * 
 * <ul>
 * 	<li>Variable names are case-sensitive.</li>
 * 	<li>A variable's name can be any legal identifier — 
 * 		an unlimited-length sequence of Unicode letters and digits,
 * 		beginning with a letter, the dollar sign "$", or the underscore character "_".</li>
 * 	<li>The convention, however, is to always begin your variable names with a letter, not "$" or "_".</li>
 * 	<li>Additionally, the dollar sign character, by convention, is never used at all.</li>
 * 	<li>You may find some situations where auto-generated names will contain the dollar sign,
 * 		but your variable names should always avoid using it. A similar convention exists
 * 		for the underscore character; while it's technically legal to begin your variable's
 * 		name with "_", this practice is discouraged.</li>
 * 	<li>White space is not permitted.</li>
 * 	<li>Subsequent characters may be letters, digits, dollar signs, or underscore characters.
 * 		Conventions (and common sense) apply to this rule as well.</li>
 * 	<li>Also keep in mind that the name you choose must not be a keyword or reserved word.</li>
 * 	<li>If your variable stores a constant value the convention changes slightly,
 * 		capitalizing every letter and separating subsequent words with the underscore character.
 * 		By convention, the underscore character is never used elsewhere.</li>
 * </ul>
 * 	
 * @author mpanek
*/
@SuppressWarnings("unused")
public class NamingRules {
	private static final int VALID_VARIABLE = 10;	// By convention underscores should be used only in constants names
	
	// The following 7 variables have valid identifiers
	private int validVariable;			// Valid
	private int _validVariable;			// Valid but discouraged
	private int $validVariable;			// Valid but discouraged
	private int valid_variable;			// Valid but discouraged
	private int valid$variable;			// Valid but discouraged
	private int valid10variable;		// Valid
	private int zażółćGęsląJaźń;		// Valid but discouraged (contains letters from non-Latin alphabet)
	
	// The following 3 variables have invalid identifiers (so commented-out)
	// private int 1invalidVariable;	// Invalid (must not start with digit)
	// private int -invalidVariable;	// Invalid (contains invalid character '-')
	// private int invalidVariable-;	// Invalid (contains invalid character '-')
	
	
	// ---------------------------------------------------------------------------------------------
	// You cannot use any of the following(53) as identifiers in your programs
	//
	// Java Language Keywords (50):
	// +----------------+---------------+---------------+---------------+-------------------+
	// |	abstract	|	continue	|	for			|	new			|	switch			|
	// |	assert	 	|	default 	|	goto 		|	package		|	synchronized	|
	// |	boolean		|	do			|	if 			|	private 	|	this			|
	// |	break		|	double		|	implements 	|	protected 	|	throw			|
	// |	byte 		|	else 		|	import 		|	public 		|	throws			|
	// |	case 		|	enum 		|	instanceof 	|	return 		|	transient		|
	// |	catch 		|	extends 	|	int 		|	short 		|	try				|
	// |	char 		|	final 		|	interface 	|	static 		|	void			|
	// |	class 		|	finally 	|	long 		|	strictfp 	|	volatile		|
	// |	const	 	|	float		|	native		|	super		|	while			|
	// +----------------+---------------+---------------+---------------+-------------------+
	//
	// Reserved Java Literals (3):
	// +------------+-----------+-----------+
	// |	true	|	false	|	null	|
	// +------------+-----------+-----------+
	//
	// ---------------------------------------------------------------------------------------------
	
}
