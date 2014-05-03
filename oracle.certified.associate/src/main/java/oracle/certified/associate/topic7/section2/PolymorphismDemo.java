package oracle.certified.associate.topic7.section2;

import oracle.certified.associate.common.Phone;
import oracle.certified.associate.common.Smartphone;
import oracle.certified.associate.common.Utils;
import oracle.certified.associate.common.Utils.HeaderPosition;

/**
 *  <b>| Topic 7.2 | -  <i>Develop code that demonstrates the use of polymorphism.</i></b>
 *
 * @author mpanek
 */
public class PolymorphismDemo {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        final int number = 123_456_789;

        Phone phone = new Phone();
        Phone smartphone = new Smartphone();

        // ----------------------------------------------------------------------------------------
        // Explanation: The method call(int) is defined in the base class Phone.
        // This method is inherited and overridden by the derived class SmartPhone. The type of both
        // reference variables, phone and smartphone, is Phone. But the reference variable phone
        // refers to an object of the class Phone, and the variable smartphone refers to an object
        // of the class SmartPhone. When the method call(int) is called on the reference variable
        // smartphone, it calls the method call(int) defined in the class SmartPhone, because
        // a call to an overridden method is resolved at runtime and is based on the type of
        // the object on which a method is called.
        // ----------------------------------------------------------------------------------------
        phone.call(number); // Calling from Phone to: 123456789
        smartphone.call(number); // Calling from Smartphone to: 123456789

        // ----------------------------------------------------------------------------------------
        // Explanation: Invocation of a static method is tied to the type of the reference variable
        // and doesn’t depend on the type of the object that’s assigned to the reference variable.
        // The static method belongs to a class, not to its objects.
        // ----------------------------------------------------------------------------------------
        phone.call(); // Calling from: Phone
        smartphone.call(); // Calling from: Phone

        Phone.call(); // Calling from: Phone
        Smartphone.call(); // Calling from: Smartphone

        Utils.prettyPrint("phone.getClass().getSimpleName() -> " + phone.getClass().getSimpleName());
        Utils.prettyPrint("smartphone.getClass().getSimpleName() -> " + smartphone.getClass().getSimpleName(), HeaderPosition.BOTH);

        new Phone(5.0f);
        new Smartphone(10.0f);
    }

}
