package oracle.certified.associate.topic6.access_modifiers.one;

/**
 * Example of a not related class within the same package.
 * 
 * <p>
 * 	Both public and package-private classes are accessible within the same package.
 * 	Only private members of those classes are not accessible here.
 * </p>
 * 
 * @author mpanek
 */
public class NotRelatedClass {

	public NotRelatedClass() {
		PublicClass publicClass = new PublicClass();

		System.out.println(publicClass.publicField);
		System.out.println(publicClass.protectedField);
		System.out.println(publicClass.packageField);
		//	System.out.println(publicClass.privateField);

		publicClass.publicMehod();
		publicClass.protectedMehod();
		publicClass.packageMehod();
		//	publicClass.privateMethod();

		PackageClass packageClass = new PackageClass();

		System.out.println(packageClass.publicField);
		System.out.println(packageClass.protectedField);
		System.out.println(packageClass.packageField);
		//	System.out.println(packageClass.privateField);

		packageClass.publicMehod();
		packageClass.protectedMehod();
		packageClass.packageMehod();
		//	packageClass.privateMethod();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
