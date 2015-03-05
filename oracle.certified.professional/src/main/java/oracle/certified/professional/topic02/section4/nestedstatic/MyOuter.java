package oracle.certified.professional.topic02.section4.nestedstatic;

public class MyOuter {
    private static int staticVariableX = 0;
    private int instanceVariableX = 100;

    private static void staticMethodX() {
        System.out.println("Inside static method: " + staticVariableX);
    }

    public void instanceMethodX() {
        System.out.println("Inside instance method: " + instanceVariableX);
    }

    public static class NestedStatic {
        public void nestedMethod() {
            // OK, you can make a static reference to the static field
            System.out.println("Static variable: " + staticVariableX);

            // OK, you can make a static reference to the static method
            staticMethodX();

            // int i = instanceVariableX; // Cannot make a static reference to the non-static field instanceVariableX
            // instanceMethodX(); // Cannot make a static reference to the non-static method instanceMethodX() from the type MyOuter
        }
    }

    public static void main(String[] args) {
        NestedStatic nestedStatic1 = new NestedStatic();
        nestedStatic1.nestedMethod();

        // To create the nested static class outside outer class just prefix nested class name with outer class name
        // MyOuter.NestedStatic nestedStatic2 = new MyOuter.NestedStatic();
        // nestedStatic2.nestedMethod();

    }

}
