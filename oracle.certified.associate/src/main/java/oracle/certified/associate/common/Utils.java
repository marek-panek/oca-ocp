package oracle.certified.associate.common;

import java.io.PrintStream;

public class Utils {
	private static final String SEP = "="; //$NON-NLS-1$
	private static final String LINE_SEP = System.getProperty("line.separator"); //$NON-NLS-1$

	private static final int LINE_LENGTH = 80;

	public static void printHeader(final PrintStream stream, final String name) {
		StringBuilder sb = new StringBuilder();
		stream.println(generateHeader());
		stream.println(String.format("%1$80s", name));
		stream.println(generateHeader());
	}

	private static String generateHeader() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < LINE_LENGTH; i++) {
			sb.append(SEP);
		}

		return sb.toString();
	}

	public static void test() {

	}

	public static void out(final Object  obj) {
		System.out.println(obj);
	}

}
