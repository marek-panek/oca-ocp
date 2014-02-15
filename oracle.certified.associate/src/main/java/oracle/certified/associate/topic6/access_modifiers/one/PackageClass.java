package oracle.certified.associate.topic6.access_modifiers.one;

/**
 * Sample class with {@code package-private} access modifier.
 * 
 * @author mpanek
 * 
 */
class PackageClass {
	public String publicField;
	protected String protectedField;
	String packageField;
	private String privateField;

	public PackageClass() {
		publicField = "<< Public field >>";
		protectedField = "<< Protected field >>";
		packageField = "<< Package-private field >>";
		privateField = "<< Private field >>";
	}

	public void publicMehod() {
		System.out.println("<< Public method >>");
	}

	protected void protectedMehod() {
		System.out.println("<< Protected method >>");
	}

	void packageMehod() {
		System.out.println("<< Package-private method >>");
	}

	@SuppressWarnings("unused")
	private void privateMehod() {
		System.out.println("<< Private method >>");
	}

	public String getPrivateField() {
		return privateField;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(publicField).append(protectedField).append(packageField).append(privateField);
		return sb.toString();
	}
}
