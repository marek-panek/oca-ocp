package oracle.certified.professional.topic02.section4.methodlocal;

class MyOuter {

    private static int count = 0;
    private int x = 10;

    // A method-local inner class can be instantiated only within the method where the inner class is defined.
    // In other words, no other code running in any other method—inside or outside the outer class—can ever
    // instantiate the method-local inner class. Like regular inner class objects, the method-local inner class
    // object shares a special relationship with the enclosing (outer) class object and can access its private
    // (or any other) members. However, the inner class object cannot use the local variables of the method
    // the inner class is in. Why not?
    // Think about it. The local variables of the method live on the stack and exist only
    // for the lifetime of the method. You already know that the scope of a local variable is
    // limited to the method the variable is declared in. When the method ends, the stack
    // frame is blown away and the variable is history. But even after the method
    // completes, the inner class object created within it might still be alive on the heap if,
    // for example, a reference to it was passed into some other code and then stored in an
    // instance variable. Because the local variables aren't guaranteed to be alive as long as
    // the method-local inner class object is, the inner class object can't use them. Unless
    // the local variables are marked final! The following code attempts to access a local
    // variable from within a method-local inner class:

    void instanceMethod() {
        final int localY = 30;
        int localX = 50;

        // And just a reminder about modifiers within a method:
        // The same rules apply to method-local inner classes as to local variable declarations.
        // You can't, for example, mark a method-local inner class public, private, protected, static,
        // transient, and the like. For the purpose of the exam, the only modifiers you can
        // apply to a method-local inner class are abstract and final, but, as always, never
        // both at the same time.

        class MyInner {

            public void seeOuter() {
                System.out.println("Outer x is " + x);
                System.out.println("Local y is " + localY);

                // Cannot refer to a non-final variable localX inside an inner class defined in a different method
                // System.out.println("Local x is " + localX);
            }
        }

        MyInner inner = new MyInner();
        inner.seeOuter();
    }

    static void staticMethod() {

        // Remember that a local class declared in a static method has access to only static members of the enclosing class,
        // since there is no associated instance of the enclosing class. If you're in a static method, there is no this,
        // so an inner class in a static method is subject to the same restrictions as the static method. In other words,
        // no access to instance variables.

        class MyInner {
            public void seeOuter() {
                System.out.println("Outer count is " + count);
                // Cannot make a static reference to the non-static field x
                // System.out.println("Outer x is " + x);
            }
        }

        MyInner inner = new MyInner();
        inner.seeOuter();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + x;
    }

}
