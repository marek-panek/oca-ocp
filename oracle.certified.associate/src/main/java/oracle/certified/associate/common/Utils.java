package oracle.certified.associate.common;

import java.util.EnumSet;

public class Utils {
    public enum HeaderPosition {
        TOP, BOTTOM, BOTH
    }

    private static final char CORNER_CHAR = '+';
    private static final char HEADER_CHAR = '-';

    private static final int LINE_LENGTH = 100;
    private static final String HEADER_FORMAT = "| %1$-" + (LINE_LENGTH - 3) + "s|"; //$NON-NLS-1$

    public static void prettyPrint(final String name) {
        prettyPrint(name, HeaderPosition.TOP);
    }

    public static void prettyPrint(final String name, final HeaderPosition headerPosition) {
        final StringBuilder sb = new StringBuilder();

        if (EnumSet.of(HeaderPosition.TOP, HeaderPosition.BOTH).contains(headerPosition)) {
            sb.append(generateHeader()).append('\n');
        }

        sb.append(String.format(HEADER_FORMAT, name));

        if (EnumSet.of(HeaderPosition.BOTTOM, HeaderPosition.BOTH).contains(headerPosition)) {
            sb.append('\n').append(generateHeader());
        }

        System.out.println(sb.toString());
    }

    private static String generateHeader() {
        final StringBuilder sb = new StringBuilder(LINE_LENGTH);

        for (int i = 0; i < LINE_LENGTH; i++) {
            sb.append(i == 0 || i == LINE_LENGTH - 1 ? CORNER_CHAR : HEADER_CHAR);
        }

        return sb.toString();
    }

    public static void out(final Object obj) {
        System.out.println(obj);
    }

}
