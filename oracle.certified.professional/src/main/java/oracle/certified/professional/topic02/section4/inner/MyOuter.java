package oracle.certified.professional.topic02.section4.inner;

class MyOuter {
    private int x = 10;

    // -------------------------------------------------------------------------------------------------------------------------------------
    // Instantiating an Inner Class from Within the Outer Class
    // -------------------------------------------------------------------------------------------------------------------------------------
    // Most often, it is the outer class that creates instances of the inner class, since it is usually
    // the outer class wanting to use the inner instance as a helper for its own personal use.
    // -------------------------------------------------------------------------------------------------------------------------------------
    public void makeInner() {
        MyInner inner = new MyInner(); // make an inner instance
        inner.seeOuter();
    }

    // -------------------------------------------------------------------------------------------------------------------------------------
    // A regular inner class is a member of the outer class just as instance variables and methods are,
    // so the following modifiers can be applied to an inner class:
    // -------------------------------------------------------------------------------------------------------------------------------------
    // - final
    // - abstract
    // - public
    // - private
    // - protected
    // - static (but static turns it into a static nested class, not an inner class)
    // - strictfp
    // -------------------------------------------------------------------------------------------------------------------------------------
    class MyInner {
        // ---------------------------------------------------------------------------------------------------------------------------------
        // Regular inner classes cannot contain static variables, methods and initializers.
        // Only constant expressions are allowed.
        // ---------------------------------------------------------------------------------------------------------------------------------

        // ---------------------------------------------------------------------------------------------------------------------------------
        // The field counter cannot be declared static in a non-static inner type, unless initialized with a constant expression
        // ---------------------------------------------------------------------------------------------------------------------------------
        // private static int counter = 0; // NOT OK

        public static final int size = 100; // THIS IS OK a constant expression

        // ---------------------------------------------------------------------------------------------------------------------------------
        // Static methods can only be declared in a static or top level type
        // ---------------------------------------------------------------------------------------------------------------------------------
        // static void staticMethod() {} // NOT OK

        // ---------------------------------------------------------------------------------------------------------------------------------
        // Cannot define static initializer in inner type MyOuter.MyInner
        // ---------------------------------------------------------------------------------------------------------------------------------
        // static { }

        private int x = 20;

        // The following code is perfectly legal.
        // Notice that the inner class is indeed accessing a private member of the outer class.
        // That's fine, because the inner class is also a member of the outer class.
        public void seeOuter() {
            System.out.println("Inner x is " + x);
            System.out.println("Outer x is " + MyOuter.this.x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + " " + x;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + x;
    }

}
