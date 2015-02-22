package oracle.certified.professional.topic04.section2;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>| Topic 4.2 | - <i>Use the diamond for type inference.</i></b>
 * 
 * <p>
 * In Java SE 7 and later, you can replace the type arguments required to invoke the constructor of a generic class with an empty set of type arguments (<>)<br /> 
 * as long as the compiler can determine, or infer, the type arguments from the context.<br />
 * This pair of angle brackets, <>, is informally called the diamond.<br /> 
 * For example, you can create an instance of Box&lt;Integer&gt; with the following statement:
 * 
 * <pre>
 * Box&lt;Integer&gt; integerBox = new Box<>();
 * </pre>
 * </p>
 *
 * @author mpanek
 */
public class DiamondSyntaxDemo {

    private static void populate(final List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        // -------------------------------------------------------------------------------------
        // The following two statements do the same, the first one uses old pre-Java SE 7 syntax
        // and the second one utilizes the new Java SE 7 'diamond' syntax.
        // -------------------------------------------------------------------------------------
        final List<String> withoutDiamondSyntax = new ArrayList<String>();
        final List<String> withDiamondSyntax = new ArrayList<>();

        // -------------------------------------------------------------------------------------
        // The following declaration is NOT legal:
        // -------------------------------------------------------------------------------------
        // List<> stuff = new ArrayList<String>(); // NOT a legal diamond syntax

        populate(withoutDiamondSyntax);
        populate(withDiamondSyntax);

        System.out.println(withoutDiamondSyntax);
        System.out.println(withDiamondSyntax);
    }

}
