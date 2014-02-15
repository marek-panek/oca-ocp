package oracle.certified.associate.topic6.access_modifiers.two;

import oracle.certified.associate.topic6.access_modifiers.one.PublicClass;

/**
 * Example of a not related class outside the package.
 * 
 * <p>
 * 	Only {@code public} members of those classes are accessible.
 * </p>
 * 
 * @author mpanek
 */
public class NotRelatedOutsideClass {

	public NotRelatedOutsideClass() {
		PublicClass publicClass = new PublicClass();

		System.out.println(publicClass.publicField);
		//	System.out.println(publicClass.protectedField);
		//	System.out.println(publicClass.packageField);
		//	System.out.println(publicClass.privateField);

		publicClass.publicMehod();
		//	publicClass.protectedMehod();
		//	publicClass.packageMehod();
		//	publicClass.privateMethod();

		//	PackageClass packageClass = new PackageClass();		// We don't have access to package-private class here
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
