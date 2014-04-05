package oracle.certified.associate.topic6.section8;

import oracle.certified.associate.common.Person;

/**
 *  <b>| Topic 6.8 | -  <i>Determine the effect upon object references and primitive values when they are passed  into methods that change the values.</i></b>
 * 
 *  <p>
 *      Object references and primitives behave in a different manner when they’re passed to a method<br />
 *      because of the differences in how these two data types are internally stored by Java.
 *  </p>
 *  
 *  <b>Passing primitive values:</b>
 *  <blockquote>
 *      When you pass a primitive variable to a method, its value remains the same after the execution of the method.<br />
 *      The value doesn’t change, regardless of whether the method reassigns the primitive to another variable or modifies it.
 *  </blockquote>
 *  
 *  <b>Passing object references:</b>
 *  <blockquote>
 *      <ul>
 *          <li>When a method reassigns the object reference passed to it to another variable</li>
 *          <li>When a method modifies the state of the object reference passed to it</li>
 *      </ul>
 *     When you pass an object reference to a method, the method can assign it to another variable.<br />
 *     In this case, the state of the object, which was passed on to the method, remains intact.
 *  </blockquote>
 * 
 * @author mpanek
 *
 */
public class PassingValues {
    private int age;

    private static void modifyValue(int a) {
        a = a + 1;
        System.out.println("Value within the method:  " + a);
    }

    private static void swap(Person p1, Person p2) {
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    private static void modifyState(Person p1) {
        p1.setName("Duke");
        p1.setAge(19);
    }

    public static void main(String[] args) {
        PassingValues pv = new PassingValues();

        Person person1 = new Person("John", 23);
        Person person2 = new Person("Paul", 27);

        System.out.println("Value before method call:  " + pv.age); // Prints 0
        modifyValue(pv.age); // Prints 1
        System.out.println("Value after method call:  " + pv.age); // Prints 0

        System.out.println(person1 + " | " + person2); // Prints: John : 23 | Paul : 27
        swap(person1, person2);
        System.out.println(person1 + " | " + person2); // Prints: John : 23 | Paul : 27

        System.out.println(person1); // Prints: John : 23
        modifyState(person1);
        System.out.println(person1); // Prints: Duke : 19
    }

}
