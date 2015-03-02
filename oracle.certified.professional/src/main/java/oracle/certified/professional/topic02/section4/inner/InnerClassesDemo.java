package oracle.certified.professional.topic02.section4.inner;

/**
 * <b>| Topic 2.4 | - <i>Create top-level and nested classes.</i></b>
 * 
 * <p>
 *  <b>Instantiating an Inner Class</b>
 * </p>
 * 
 * <p>
 * To create an instance of an inner class, you must have an instance of the outer class to tie to the inner class.<br />
 * There are no exceptions to this rule: An inner class instance can never stand alone without a direct relationship<br />
 * to an instance of the outer class.
 * </p>
 * 
 * <p>
 * The differences between inner class instantiation code that's within the outer class (but not static),
 * and inner class instantiation code that's outside the outer class:
 * <p>
 * 
 * <ul>
 *  <li>
 *  From inside the outer class instance code, use the inner class name in the normal way:
 *  <pre>MyInner mi = new MyInner();</pre>
 *  </li>
 *  
 *  <li>
 *  From outside the outer class instance code (including static method code within the outer class),
 *  the inner class name must now include the outer class's name:
 *  <pre>MyOuter.MyInner</pre>
 *  To instantiate it, you must use a reference to the outer class:
 *  <pre>new MyOuter().new MyInner(); or outerObjRef.new MyInner();</pre>
 *  if you already have an instance of the outer class.
 *  </li>
 *  
 * </ul>

 *
 * @author mpanek
 *
 */
public class InnerClassesDemo {

    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        outer.makeInner();

        // --------------------------------------------------------------------------------------
        // If we want to create an instance of the inner class, we must have an instance of the
        // outer class. You already know that, but think about the implications… it means that
        // without a reference to an instance of the outer class, you can't instantiate the inner
        // class from a static method of the outer class (because, don't forget, in static code,
        // there is no this reference), or from any other code in any other class. Inner class
        // instances are always handed an implicit reference to the outer class. The compiler
        // takes care of it, so you'll never see anything but the end result—the ability of the
        // inner class to access members of the outer class.
        // --------------------------------------------------------------------------------------
        MyOuter.MyInner inner1 = outer.new MyInner(); // With using already defined outer class instance
        MyOuter.MyInner inner2 = new MyOuter().new MyInner(); // Instantiating the inner class instance in one line

        inner1.seeOuter();
        inner2.seeOuter();
    }

}
