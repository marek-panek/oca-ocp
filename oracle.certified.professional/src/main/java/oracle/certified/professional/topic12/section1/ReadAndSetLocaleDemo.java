package oracle.certified.professional.topic12.section1;

import java.util.Locale;

/**
 * <b>| Topic 12.1 | -  <i>Read and set the locale by using the Locale object.</i></b>
 * 
 * @author mpanek
 */
public class ReadAndSetLocaleDemo {

    private static void printInfo(final Locale locale) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Locale: " + locale);
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Display language: " + locale.getDisplayLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Display country: " + locale.getDisplayCountry());
        System.out.println("----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // ----------------------------------------------------------------------------
        // Get default locale
        // ----------------------------------------------------------------------------
        System.out.println("Default locale: ");
        printInfo(Locale.getDefault());

        // ----------------------------------------------------------------------------
        // Get default locale for specified category
        // ----------------------------------------------------------------------------
        System.out.println("Default locale for category DISPLAY: ");
        printInfo(Locale.getDefault(Locale.Category.DISPLAY));

        System.out.println("Default locale for category FORMAT: ");
        printInfo(Locale.getDefault(Locale.Category.FORMAT));

        // ----------------------------------------------------------------------------
        // Set default locale
        // ----------------------------------------------------------------------------
        Locale.setDefault(Locale.US);
        System.out.println("After change default locale is: ");
        printInfo(Locale.getDefault());

        // Locale.setDefault(Locale.Category.FORMAT, Locale.CANADA);
        // Locale.setDefault(Locale.Category.DISPLAY, Locale.ITALY);
    }

}
