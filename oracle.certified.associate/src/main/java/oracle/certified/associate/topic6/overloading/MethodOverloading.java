package oracle.certified.associate.topic6.overloading;

/**
 *  <b>| Topic 6.3 | -  <i>Create an overloaded method.</i></b>
 * 
 *  <p>
 * 	    <i>Overloaded methods</i> are methods with the same name but different method parameter lists.
 *  </p>
 *  
 *  <u>Rules for defining overloaded methods:</u>
 *  <blockquote>
 * 		<ul>
 * 			<li>Overloaded methods must have different method parameters from one another.</li>
 *			<li>Overloaded methods may or may not define a different return type.</li>
 *			<li>Overloaded methods may or may not define different access modifiers.</li>
 *			<li>Overloaded methods can’t be defined by only changing their return type or access modifiers.</li>
 * 		</ul>
 * 	</blockquote>
 * 
 * 	<b>Overloaded methods accept different lists of arguments.</b><br/><u>The argument lists can differ in terms of any of the following:</u>
 * 	<blockquote>
 * 		<ul>
 * 			<li>Change in the number of parameters that are accepted.</li>
 *			<li>Change in the types of parameters that are accepted.</li>
 *			<li>Change in the positions of the parameters that are accepted (based on parameter type, not variable names).</li>
 * 		</ul>
 * 	</blockquote>
 * 
 * @author mpanek
 *
 */
public class MethodOverloading {

    // This the base method
    public void overload() {
        System.out.println("Method with no arguments");
    }

    // Differs in the number of parameters
    public void overload(int a) {
        System.out.println("Method with one argument int: " + a);
    }

    // Differs in the number of parameters
    public void overload(int a, int b) {
        System.out.println("Method with two int arguments: " + a + ", " + b);
    }

    // Differs in the types of parameters
    public void overload(double a) {
        System.out.println("Method with one argument double: " + a);
    }

    // The following two methods are also valid overloaded methods.
    // They differ in the positions of the parameters that are accepted.
    public void overload(int a, double b) {
        System.out.println("Method with two arguments int and double: " + a + ", " + b);
    }

    public void overload(double a, int b) {
        System.out.println("Method with two arguments double and int: " + a + ", " + b);
    }

    // Differs in the types of parameters
    public void overload(int... a) {
        System.out.println("Method with: " + a.length + " int varargs");
    }

    // ----------------------------------------------------------------------------------------------//
    // Methods can’t be defined as overloaded methods if they differ only in their return types.
    // ----------------------------------------------------------------------------------------------//

    // public int overload() {}

    // ----------------------------------------------------------------------------------------------//
    // Methods can’t be defined as overloaded methods if they only differ in their access modifiers.
    // ----------------------------------------------------------------------------------------------//

    // private void overload() {}

    // ----------------------------------------------------------------------------------------------//
    // This is not a valid overloaded method, it is in conflict with the varargs one.
    // ----------------------------------------------------------------------------------------------//

    // public void overload(int[] a) {}

    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32767;
        char charVar = 'a';
        float floatVar = 3.14f;

        MethodOverloading mo = new MethodOverloading();

        mo.overload();
        mo.overload(1);
        mo.overload(byteVar);
        mo.overload(shortVar);
        mo.overload(charVar);
        mo.overload(floatVar);
        mo.overload(1.0d);
        mo.overload(1, 2);
        mo.overload(1, 2, 3);
        mo.overload(1.0d, 2);
        mo.overload(1, 2.0d);
    }
}
