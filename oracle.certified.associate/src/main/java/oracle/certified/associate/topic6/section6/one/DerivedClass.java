package oracle.certified.associate.topic6.section6.one;

/**
 * Example of a derived class within the same package.
 * 
 * <p>
 * 	Only private members of the base class are not accessible.
 * </p>
 * 
 * @author mpanek
 */
public class DerivedClass extends PublicClass {

	public DerivedClass() {
		System.out.println(publicField);
		System.out.println(protectedField);
		System.out.println(packageField);
		//	System.out.println(privateField);

		publicMehod();
		protectedMehod();
		packageMehod();
		//	privateMehod();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
