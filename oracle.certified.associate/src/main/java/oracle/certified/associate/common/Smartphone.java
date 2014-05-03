package oracle.certified.associate.common;

public class Smartphone extends Phone {

    public Smartphone() {
        System.out.println("Invoking no-arg constructor from : " + Smartphone.class.getSimpleName());
    }

    public Smartphone(float price) {
        super(price);
        System.out.println("Invoking constructor with float parameter from : " + Smartphone.class.getSimpleName());
    }

    public static void call() {
        Utils.prettyPrint("Calling from: " + Smartphone.class.getSimpleName());
    }

    @Override
    public void call(int number) {
        Utils.prettyPrint(String.format("Calling from %s to: %d", this.getClass().getSimpleName(), number));
    }
}
