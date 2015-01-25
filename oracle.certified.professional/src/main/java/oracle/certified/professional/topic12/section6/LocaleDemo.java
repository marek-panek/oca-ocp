package oracle.certified.professional.topic12.section6;

import java.util.Locale;

/**
 * <b>| Topic 12.6 | -  <i>Define a locale using language and country codes.</i></b>
 * 
 * <p>
 * The process in which we adapt the software to the local language and customs is known as {@code localization}.<br />
 * A locale represents a country’s distinctive assemblage of language, culture, numbers, currency, etc.<br />
 * Java provides good support for localizing software applications.
 * </p>
 * 
 * <pre>
 * public final class Locale
 * extends Object
 * implements Cloneable, Serializable
 * </pre>
 * 
 * <p>
 * <b>Locale format:</b>
 * 
 * <pre>
 * language + "_" + country + "_" + (variant + "_#" | "#") + script + "-" + extensions
 * </pre>
 * 
 * Language is always lower case, country is always upper case, script is always title case, and extensions are always lower case.
 * </p>
 * 
 * <b>Creating a Locale</b>
 * 
 * <p>There are several different ways to create a {@code Locale} object.
 * 
 * <dl>
 *  <dt>Constructors</dt>
 *  <dd>
 *      The {@code Locale} class provides three constructors. These constructors allow you to create a {@code Locale} object with language, country and variant, but you cannot specify script or extensions.
 *      <pre>
 *      Locale(String language)
 *      Locale(String language, String country)
 *      Locale(String language, String country, String variant)
 *      </pre>
 *  </dd>
 *  <dt>Builder</dt>
 *  <dd>
 *      Build a {@code Locale} object by instantiating {@code Locale.Builder} and then call {@code setLanguageTag()} from that object:
 *      <pre>
 *      Locale locale = new Locale.Builder().setLanguageTag("pl").build();
 *      </pre>
 *  </dd>
 *  <dt>Factory Methods</dt>
 *  <dd>
 *      The method {@code forLanguageTag(java.lang.String)} creates a {@code Locale} object for a well-formed BCP 47 language tag.
 *      <pre>
 *      Locale locale = Locale.forLanguageTag("pl");
 *      </pre>
 *  </dd>
 *  <dt>Locale Constants</dt>
 *  <dd>
 *      The {@code Locale} class provides a number of convenient constants that you can use to create Locale objects for commonly used locales.<br />
 *      For example, the following creates a {@code Locale} object for the United States.<br />
 *      <pre>
 *      Locale locale = Locale.US;
 *      </pre>
 *  </dd>
 * </dl>
 * 
 * @author mpanek
 */
public class LocaleDemo {

    private static void printInfo(final String header, final String value) {
        System.out.format("%1$-35s: %2$30s%n", header, value);
    }

    private static void displayInfoFrom(final Locale locale) {
        printInfo("locale.toString()", locale.toString());

        printInfo("locale.getLanguage()", locale.getLanguage());
        printInfo("locale.getDisplayLanguage()", locale.getDisplayLanguage());
        printInfo("locale.getDisplayLanguage(locale)", locale.getDisplayLanguage(locale));

        printInfo("locale.getCountry()", locale.getCountry());
        printInfo("locale.getDisplayCountry()", locale.getDisplayCountry());
        printInfo("locale.getDisplayCountry(locale)", locale.getDisplayCountry(locale));

        if (!"".equals(locale.getVariant())) {
            printInfo("locale.getVariant()", locale.getVariant());
            printInfo("locale.getDisplayVariant()", locale.getDisplayVariant());
            printInfo("locale.getDisplayVariant(locale)", locale.getDisplayVariant(locale));
        }

        if (!"".equals(locale.getScript())) {
            printInfo("locale.getScript()", locale.getScript());
            printInfo("locale.getDisplayScript()", locale.getDisplayScript());
            printInfo("locale.getDisplayScript(locale)", locale.getDisplayScript(locale));
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // -----------------------------------------------------------------------------------------
        // Creating 5 locales with different ways and displaying information about them
        // -----------------------------------------------------------------------------------------
        final Locale defaultLocale = Locale.getDefault();
        final Locale localeUS = Locale.US;
        final Locale localeEnCa = new Locale("en", "CA");
        final Locale localeFr = Locale.forLanguageTag("fr");
        final Locale localeFrCa = new Locale.Builder().setLanguage("fr").setRegion("CA").build();

        displayInfoFrom(defaultLocale);
        displayInfoFrom(localeUS);
        displayInfoFrom(localeEnCa);
        displayInfoFrom(localeFr);
        displayInfoFrom(localeFrCa);
    }

}
