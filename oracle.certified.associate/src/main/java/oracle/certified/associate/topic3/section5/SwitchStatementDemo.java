package oracle.certified.associate.topic3.section5;

/**
 *  <b>| Topic 3.5 | -  <i>Use a switch statement.</i></b>
 * 
 *  <p>
 *      <i>Switch statement</i> can be used to compare the value of a variable with multiple values.<br/>
 *      For each of these values, you can define a set of statements to execute.
 *  </p>
 *  
 *  <p>
 *  There are limitations on the types of arguments that a switch statement can accept.<br/>
 *  
 *  <u>A switch statement accepts arguments of type:</u>
 *  <blockquote>
 *      <ul>
 *          <li>{@code byte}, {@code Byte}</li>
 *          <li>{@code short}, {@code Short}</li>
 *          <li>{@code char}, {@code Character}</li>
 *          <li>{@code int}, {@code Integer}</li>
 *          <li>{@code enum}</li>
 *          <li>{@code String} (starting from Java version 7)</li>
 *      </ul>
 *  </blockquote>
 *  The switch statement doesn’t accept arguments of type {@code long}, {@code float}, {@code double}, or any object besides {@code String}.
 *  </blockquote>
 *  </p>
 *  
 *  <u>All of the following must be true, or a compile-time error occurs:</u>
 *  <blockquote>
 *  <ul>
 *      <li>Every case constant expression associated with a switch statement must be assignable to the type of the switch Expression.</li>
 *      <li>No two of the case constant expressions associated with a switch statement may have the same value.</li>
 *      <li>No switch label is {@code null}.</li>
 *      <li>At most one default label may be associated with the same switch statement.</li>
 *  </ul>
 *  </blockquote>
 * 
 * @author mpanek
 * 
 */
public class SwitchStatementDemo {
    private static final int speed = 140;
    private static final Byte value = 127;
    private static final String day = "Saturday";

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // --------------------------------------------------------------------------------------------------
        // This is an example of valid switch statement (it can contain empty block)
        // --------------------------------------------------------------------------------------------------
        switch (1) {
        // EMPTY BODY
        }

        // --------------------------------------------------------------------------------------------------
        // This is also a valid switch statement
        // --------------------------------------------------------------------------------------------------
        switch (1) {
            default:
        }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because switch statement requires a block (even empty one)
        // --------------------------------------------------------------------------------------------------
        // switch (1);

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because a sole empty statement ';' is not allowed
        // --------------------------------------------------------------------------------------------------
        // switch (1) {
        // ;
        // }

        // --------------------------------------------------------------------------------------------------
        // This is also a valid switch statement
        // --------------------------------------------------------------------------------------------------
        switch (speed) {
            case 50:
                System.out.println("Why so slow!");
                break;
            case 90:
                System.out.println("Now it's better");
                break;
            case 140:
                System.out.println("You must be in hurry!");
                break;
            default:
                System.out.println("Your speed was: " + speed);
                break;
        }

        // --------------------------------------------------------------------------------------------------
        // This is also a valid switch statement (default can be placed anywhere in switch block)
        // --------------------------------------------------------------------------------------------------
        switch (value) {
            case Byte.MIN_VALUE:
                System.out.println("You chose min byte value: " + value);
                break;
            default:
                System.out.println("Your chose: " + value);
                break;
            case Byte.MAX_VALUE:
                System.out.println("You chose max byte value: " + value);
                break;
        }

        // --------------------------------------------------------------------------------------------------
        // Note that string values are compared based on equals method (so it is case-sensitive)
        // --------------------------------------------------------------------------------------------------
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Time to work"); // Here we have the falls-through
                break;
            case "Friday":
                System.out.println("Nearing weekend");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day!");
                break; // break statement is redundant if default is last statement
        }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because it breaks the rule:
        // No two of the case constant expressions associated with a switch statement may have the same value
        // --------------------------------------------------------------------------------------------------
        // switch (speed) {
        // case 50:
        // case 25 * 2:
        // }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because it breaks the rule:
        // At most one default label may be associated with the same switch statement.
        // --------------------------------------------------------------------------------------------------
        // switch (speed) {
        // case 50:
        // default:
        // case 70:
        // default:
        // }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because it breaks the rule:
        // No switch label is null.
        // --------------------------------------------------------------------------------------------------
        // switch (value) {
        // case 20:
        // case 30:
        // case null:
        // }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because it breaks the rule:
        // Every case constant expression associated with a switch statement must be assignable
        // to the type of the switch Expression.
        // --------------------------------------------------------------------------------------------------
        // switch (value) {
        // case 1:
        // case 128:
        // }

        // --------------------------------------------------------------------------------------------------
        // The same here (note that -Byte.MIN_VALUE is integer number 128)
        // --------------------------------------------------------------------------------------------------
        // switch (value) {
        // case -Byte.MIN_VALUE:
        // case -Byte.MAX_VALUE:
        // }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because case expression must be constant expression
        // --------------------------------------------------------------------------------------------------
        int seventy = 70;
        // switch (speed) {
        // case 50:
        // case seventy: // case expression must be constant expression
        // }

        // --------------------------------------------------------------------------------------------------
        // This one is valid because fifty is a constant expression
        // --------------------------------------------------------------------------------------------------
        final int fifty = 50;
        switch (speed) {
            case fifty: // this is constant expression
            case 70:
        }

        // --------------------------------------------------------------------------------------------------
        // This one causes compile-time error because case expression must be constant expression
        // --------------------------------------------------------------------------------------------------
        final int sixty; // final variable sixty is defined but not initialized
        sixty = 60;
        // switch (speed) {
        // case sixty: // case expression must be constant expression
        // case 70:
        // }

    }
}
