package oracle.certified.professional.topic04.section8;

/**
 * <b>| Topic 4.8 | -  <i>Sort and search arrays and lists.</i></b>
 * 
 * <p>
 * Override {@code toString()} when you want to be able to read something meaningful about the objects of your class.<br />
 * Code can call {@code toString()} on your object when it wants to read useful details about your object.<br />
 * When you pass an object reference to the {@code System.out.println()} method, for example, the object's {@code toString()} method is called.
 * </p>
 * 
 * <p>
 * The {@code toString} method for class {@code Object} returns a string consisting of the name of the class of which the object is an instance,<br />
 * the at-sign character `{@code @}', and the unsigned hexadecimal representation of the hash code of the object.<br />
 * In other words, this method returns a string equal to the value of:
 * <blockquote>
 * <pre>
 * getClass().getName() + '@' + Integer.toHexString(hashCode())
 * </pre>
 * </blockquote>
 * 
 * @author mpanek
 */
public class ToStringDemo {

    public static void main(String[] args) {

        // -------------------------------------------------------------------------
        // Possible output when toString() method is not overridden
        // -------------------------------------------------------------------------
        // oracle.certified.professional.topic04.section8.ToStringDemo$Exam@1d9dc39
        // oracle.certified.professional.topic04.section8.ToStringDemo$Exam@93dcd
        // -------------------------------------------------------------------------

        // -------------------------------------------------------------------------
        // Output when toString() method is overridden
        // -------------------------------------------------------------------------
        // Your result on [OCA - 1Z0-803] was 95,00%
        // Your result on [OCP - 1Z0-804] was 90,00%
        // -------------------------------------------------------------------------
        System.out.println(new Exam("OCA - 1Z0-803", 95.0f));
        System.out.println(new Exam("OCP - 1Z0-804", 90.0f));
    }

    public static class Exam {

        private String name;
        private float score;

        public Exam(String name, float score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public float getScore() {
            return score;
        }

        @Override
        public String toString() {
            return String.format("Your result on [%1$s] was %2$.2f%%", name, score);
        }

    }
}
