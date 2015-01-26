package oracle.certified.professional.topic12.section23;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <b>| Topic 12.2 | -  <i>Build a resource bundle for each locale.</i></b><br />
 * <b>| Topic 12.3 | -  <i>Call a resource bundle from an application.</i></b>
 * 
 * <p>
 * You create resource bundles by extending the {@code ListResourceBundle} class, whereas with {@code PropertyResourceBundle},
 * you create the resource bundle as property files.<br />
 * Furthermore, when extending {@code ListResourceBundle}, you can have any type of objects as values, whereas values in a properties file can only be Strings.
 * </p>
 * 
 * <p>
 * Assume we decide to request the Canadian French resource bundle:
 * <pre>
 *      Locale locale = new Locale("fr", "CA");
 *      ResourceBundle rb = ResourceBundle.getBundle("RB", locale);
 * </pre>
 * 
 * Java will look for the following files in the classpath in this order:
 * 
 * <pre>
 *  RB_fr_CA.java           // exactly what we asked for
 *  RB_fr_CA.properties
 *  RB_fr.java              // couldn't find exactly what we asked for
 *  RB_fr.properties        // now trying just requested language
 *  RB_en_US.java           // couldn't find French
 *  RB_en_US.properties     // now trying default Locale
 *  RB_en.java              // couldn't find full default Locale country
 *  RB_en.properties        // now trying default Locale language
 *  RB.java                 // couldn't find anything any matching Locale,
 *  RB.properties           // now trying default bundle
 *  </pre>
 *  
 *  If none of these files exist, Java gives up and throws a {@code MissingResourceException}.<br /> 
 *  While this is a lot of things for Java to try, it is pretty easy to remember.<br /> 
 *  Start with the full Locale requested. Then fall back to just language.<br />  
 *  Then fall back to the default Locale. Then fall back to the default bundle. Then cry.
 *  </p>
 * 
 * @author mpanek
 */
public class ResourceBundleDemo {

    private static final String RESOURCE_BUNDLE_PREFIX = "oracle.certified.professional.topic12.section23";

    private static void readFromResource(ResourceBundle bundle) {
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good-bye"));
        System.out.println(bundle.getObject("date"));

        // java.lang.ClassCastException: java.util.Date cannot be cast to java.lang.String
        // System.out.println(bundle.getString("date"));
        System.out.println("----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        final ResourceBundle bundle1 = ResourceBundle.getBundle(RESOURCE_BUNDLE_PREFIX + ".MyResource");
        final ResourceBundle bundle2 = ResourceBundle.getBundle(RESOURCE_BUNDLE_PREFIX + ".MyResource", Locale.forLanguageTag("en"));
        final ResourceBundle bundle3 = ResourceBundle.getBundle(RESOURCE_BUNDLE_PREFIX + ".MyResource", new Locale("it", "IT"));
        final ResourceBundle bundle4 = ResourceBundle.getBundle(RESOURCE_BUNDLE_PREFIX + ".MyResource", new Locale("it")); // default will be used

        readFromResource(bundle1);
        readFromResource(bundle2);
        readFromResource(bundle3);
        readFromResource(bundle4);
    }

}
