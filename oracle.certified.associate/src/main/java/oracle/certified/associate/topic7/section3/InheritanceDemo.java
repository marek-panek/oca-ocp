package oracle.certified.associate.topic7.section3;

/**
 *  <b>| Topic 7.3 | -  <i>Differentiate between the type of a reference and the type of an object.</i></b>
 *  
 *  <p>
 *  Given the following definition of classes Animal, and interfaces:
 *  <pre>
 *  interface Jumpable {}
 *  class Animal {}
 *  class Lion extends Animal implements Jumpable {}
 *  </pre>
 *  select the correct combinations of assignments of a variable.
 *  </p>
 *
 * @author mpanek
 */
public class InheritanceDemo {

    // ---------------------------------------------------------------------------------------------------------
    // Incorrect. An interface can’t be instantiated.
    // ---------------------------------------------------------------------------------------------------------
    // Jumpable var1 = new Jumpable();

    // ---------------------------------------------------------------------------------------------------------
    // Correct. Animal is not abstract here so instance of this class can be created.
    // ---------------------------------------------------------------------------------------------------------
    Animal var2 = new Animal();

    // ---------------------------------------------------------------------------------------------------------
    // Incorrect. A reference variable of a derived class can’t be used to refer to an object of its base class.
    // ---------------------------------------------------------------------------------------------------------
    // Lion var3 = new Animal();

    // ---------------------------------------------------------------------------------------------------------
    // Incorrect. A reference variable of type Jumpable can’t be used to refer to an object of the class Animal
    // because Animal doesn’t implement the interface Jumpable.
    // ---------------------------------------------------------------------------------------------------------
    // Jumpable var4 = new Animal();

    // ---------------------------------------------------------------------------------------------------------
    // Correct. Lion class implements Jumpable interface so this assignment is correct.
    // ---------------------------------------------------------------------------------------------------------
    Jumpable var5 = new Lion();

}
