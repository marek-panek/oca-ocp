package oracle.certified.associate.common;

public class Phone {
    protected float price;

    public Phone() {
        System.out.println("Invoking no-arg constructor from : " + Phone.class.getSimpleName());
        this.price = 0.0f;
    }

    public Phone(float price) {
        System.out.println("Invoking constructor with float parameter from : " + Phone.class.getSimpleName());
        this.price = price;
    }

    public static void call() {
        Utils.prettyPrint("Calling from: " + Phone.class.getSimpleName());
    }

    public void call(int number) {
        Utils.prettyPrint(String.format("Calling from %s to: %d", this.getClass().getSimpleName(), number));
    }
}
