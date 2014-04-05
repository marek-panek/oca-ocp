package oracle.certified.associate.topic6.section6.two;

import oracle.certified.associate.topic6.section6.one.PublicClass;

/**
 * Example of a derived class outside the package in which base class resides.
 * 
 * <p>
 * 	Only {@code public} and {@code protected} members of the base class are accessible.
 * </p>
 * 
 * <blockquote>
 * 	<ul>
 * 		<li>
 * 			A derived class can inherit and access protected members of its base class,
 * 			regardless of the package in which it’s defined.
 * 		</li>
 *		<li>
 *			A derived class in a separate package can’t access protected members of its base class using reference variables.
 *		</li>
 * 	</ul>
 * </blockquote>
 * 
 * @author mpanek
 */
public class DerivedOutsideClass extends PublicClass {

	public DerivedOutsideClass() {
		System.out.println(publicField);
		System.out.println(protectedField);
		//	System.out.println(packageField);
		//	System.out.println(privateField);

		publicMehod();
		protectedMehod();
		//	packageMehod();
		//	privateMehod();

		PublicClass publicClass = new DerivedOutsideClass();
		System.out.println(publicClass.publicField);
		//	System.out.println(publicClass.protectedField); 	// In a separate package we can’t access protected members of its base class using reference variables
		//	System.out.println(publicClass.packageField);
		//	System.out.println(publicClass.privateField);

		// PackageClass packageClass = new PackageClass();		// We don't have access to package-private class here
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
